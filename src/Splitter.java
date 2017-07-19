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

    public Splitter (Sequence temp, SplitterConfig cfg)
    {
        template = temp;
        this.cfg = cfg;
    }

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

    public void save (String directory) throws Exception
    {
        int tracknum = 0;
        for (Sequence value : hm.values())
        {
            if (cfg.rebase)
                adjustTimebase(value);
            if (cfg.doubleSpeed)
                makeDoubleSpeed(value);
            if (cfg.transpose != 0)
                transposeTrack(value);
            tracknum++;
            File f = new File(directory + "\\miditrack" + tracknum
                    + "-" + System.currentTimeMillis() + "-.mid");
            MidiSystem.write(value, 1, f);
        }
    }

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
                int newv1 = sm.getData1()+val;
                sm.setMessage(sm.getStatus(),sm.getChannel(), newv1, sm.getData2());
            }
        }
    }
}
