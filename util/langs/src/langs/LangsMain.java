package langs;

/** Simple CLI wrapper around LangsTask for Gradle. */
public class LangsMain {
    public static void main(String[] args) throws Exception {
        if (args.length < 4 || args.length > 5) {
            System.err.println("Usage: LangsMain <languages> <inDir> <outDir> <srcDir> [idealLang]");
            System.exit(1);
        }
        LangsTask task = new LangsTask();
        task.setLanguages(args[0]);
        task.setInDir(args[1]);
        task.setOutDir(args[2]);
        task.setSrcDir(args[3]);
        if (args.length > 4) {
            task.setIdealLang(args[4]);
        }
        task.execute();
    }
}
