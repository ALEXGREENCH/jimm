package sijapp;

import java.io.File;
import java.util.Hashtable;

/** Simple CLI wrapper around the SiJaPP preprocessor. */
public class PreprocessMain {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Usage: PreprocessMain <srcDir> <destDir> [key=value ...]");
            System.exit(1);
        }
        File src = new File(args[0]);
        File dest = new File(args[1]);
        Hashtable defs = new Hashtable();
        for (int i = 2; i < args.length; i++) {
            String arg = args[i];
            int idx = arg.indexOf('=');
            if (idx >= 0) {
                defs.put(arg.substring(0, idx), arg.substring(idx + 1));
            } else {
                defs.put(arg, "defined");
            }
        }
        Sijapp sj = new Sijapp(src, dest);
        Preprocessor pp = new Preprocessor(defs);
        sj.run(pp);
    }
}
