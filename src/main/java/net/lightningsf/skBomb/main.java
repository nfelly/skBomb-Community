package net.lightningsf.skBomb;

/**
 * Created by xiurobert on 5/2/2015.
 */

import static java.lang.System.*;

import net.lightningsf.skBomb.dialogboxes.Splash;

public class main {
    public static void main(String[] args) {
        out.println("Loading skBomb Community v1");
        Splash splash = new Splash();
        out.println("Being loading assets");

        out.println("Getting system info");

        boolean isWindows = getProperty("os.name") == "Windows";
        boolean is64bit = getProperty("os.arch") == "amd64";

        if (is64bit == true && isWindows == true) {
            out.println("System is running 64-bit Windows");
        } else if (is64bit == true) {
            String os = getProperty("os.name");
            out.println("System is running 64-bit" + " " + os);
        } else {
            String os = getProperty("os.name");
            out.println("System is 32-bit with" + " " + os);
        }

    }
}
