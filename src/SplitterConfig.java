
public class SplitterConfig
{
    final boolean rebase;
    final boolean doubleSpeed;
    final int transpose;
    final boolean onlyDrums;
    final String inputFile;
    final String outputDir;

    public SplitterConfig (boolean rebase, boolean doubleSpeed,
                           int transposeValue, boolean onlyDrums,
                           String inputFile, String outputDir)
    {
        this.onlyDrums = onlyDrums;
        this.rebase = rebase;
        this.doubleSpeed = doubleSpeed;
        this.transpose = transposeValue;
        this.inputFile = inputFile;
        this.outputDir = outputDir;
    }
}
