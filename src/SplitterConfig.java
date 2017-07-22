
public class SplitterConfig
{
    final boolean rebase;
    final boolean doubleSpeed;
    final int transpose;
    final boolean onlyDrums;
    final String inputFile;
    final String outputDir;
    final boolean chord;
    final boolean dur;

    public SplitterConfig (boolean rebase, boolean doubleSpeed,
                           int transposeValue, boolean onlyDrums,
                           String inputFile, String outputDir,
                           boolean chord, boolean dur)
    {
        this.onlyDrums = onlyDrums;
        this.rebase = rebase;
        this.doubleSpeed = doubleSpeed;
        this.transpose = transposeValue;
        this.inputFile = inputFile;
        this.outputDir = outputDir;
        this.chord = chord;
        this.dur = dur;
    }
}
