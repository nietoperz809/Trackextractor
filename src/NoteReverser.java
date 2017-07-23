import javax.sound.midi.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class NoteReverser
{
    public NoteReverser (String infile, String outpath, Modus mod) throws Exception
    {
        Sequence sequence = MidiSystem.getSequence(new File(infile));
        Sequence newSeq = new Sequence(sequence.getDivisionType(), sequence.getResolution());
        for (Track track : sequence.getTracks())
        {
            Track tr2 = newSeq.createTrack();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < track.size(); i++)
            {
                MidiEvent event = track.get(i);
                MidiMessage message = event.getMessage();
                if (message instanceof ShortMessage)
                {
                    ShortMessage sm = (ShortMessage) message;
                    int cmd = sm.getCommand();
                    if (cmd == ShortMessage.NOTE_ON || cmd == ShortMessage.NOTE_OFF)
                    {
                        int key = sm.getData1();
                        list.add(0, key);
                        tr2.add(event);
                    }
                }
            }
            if (tr2.size() == 0)
            {
                newSeq.deleteTrack(tr2);
            }
            else
            {
                for (int i = 0; i < tr2.size(); i++)
                {
                    MidiEvent event = tr2.get(i);
                    MidiMessage message = event.getMessage();
                    if (message instanceof ShortMessage)
                    {
                        ShortMessage msg = (ShortMessage) message;
                        if (mod == Modus.REV_TRACK)
                        {
                            msg.setMessage(msg.getStatus(), msg.getChannel(),
                                    list.get(i), msg.getData2());
                        }
                        else if (mod == Modus.REV_OCTAVE)
                        {
                            int key = msg.getData1();
                            int octave = (key / 12);
                            int note = 11-(key % 12);
                            msg.setMessage(msg.getStatus(), msg.getChannel(),
                                    12*octave+note, msg.getData2());
                        }
                    }
                }
            }
        }
        File f = new File(outpath + "\\midifile-" +
                System.currentTimeMillis() + "-.mid");
        MidiSystem.write(newSeq, 1, f);
    }

    ;

    enum Modus
    {
        REV_TRACK,
        REV_OCTAVE
    }
}
