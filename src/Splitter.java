import javax.sound.midi.*;
import java.io.File;
import java.util.HashMap;

/**
 * Created by Administrator on 7/19/2017.
 */
public class Splitter
{
    private final Sequence template;
    private final HashMap<Integer, Sequence> hm = new HashMap<>();
    private final SplitterConfig cfg;

    /**
     * Contructor
     *
     * @param temp Parent sequence that is used as template
     * @param cfg  Configuration values
     */
    public Splitter (Sequence temp, SplitterConfig cfg)
    {
        template = temp;
        this.cfg = cfg;
    }

    /**
     * Inserts one event into its channel
     * @param evt The event
     * @param channel The channel
     * @throws Exception If smth. gone wrong
     */
    public void insert (MidiEvent evt, int channel) throws Exception
    {
        if (cfg.onlyDrums && channel != 10)
            return;
        Sequence s = hm.get(channel);
        if (s == null)
        {
            Sequence newSeq = new Sequence(template.getDivisionType(), template.getResolution());
            Track t = newSeq.createTrack();
            t.add(evt);
            hm.put(channel, newSeq);
        }
        else
        {
            s.getTracks()[0].add(evt);
        }
    }

    /**
     * Stores all Tracks/Channels as separate MIDI files
     * @param directory Directory where all files will be stored
     * @throws Exception
     */
    public void save (String directory) throws Exception
    {
        int tracknum = 0;
        for (Sequence sequence : hm.values())
        {
            if (cfg.rebase)
                adjustTimebase(sequence);
            if (cfg.doubleSpeed)
                makeDoubleSpeed(sequence);
            if (cfg.transpose != 0)
                transposeTrack(sequence);
            tracknum++;
            File f = new File(directory + "\\miditrack" + tracknum
                    + "-" + System.currentTimeMillis() + "-.mid");
            MidiSystem.write(sequence, 1, f);
        }
    }

    /**
     * Makes a track twice as fast
     * @param s Sequence that has the track
     */
    private void makeDoubleSpeed(Sequence s)
    {
        Track t = s.getTracks()[0];
        for (int i = 0; i < t.size(); i++)
        {
            MidiEvent me = t.get(i);
            long tick = me.getTick();
            me.setTick(tick/2);
        }
    }

    /**
     * Make a track beginning at base 0 (time)
     * @param s Sequence that has the track
     */
    private void adjustTimebase(Sequence s)
    {
        long diff = 0;
        Track t = s.getTracks()[0];
        for (int i = 0; i < t.size(); i++)
        {
            MidiEvent me = t.get(i);
            long tick = me.getTick();
            if (i == 0)
                diff = tick;
            me.setTick(tick - diff);
        }
    }

    /**
     * Transpose a track n octaves up or down
     * @param s Sequence that has the track
     * @throws Exception on failure
     */
    private void transposeTrack (Sequence s) throws Exception
    {
        int val = cfg.transpose*12;
        Track t = s.getTracks()[0];
        for (int i = 0; i < t.size(); i++)
        {
            MidiMessage msg = t.get(i).getMessage();
            if (msg instanceof ShortMessage)
            {
                ShortMessage sm = (ShortMessage)msg;
                sm.setMessage(sm.getStatus(),sm.getChannel(),
                        sm.getData1()+val, sm.getData2());
            }
        }
    }
}
