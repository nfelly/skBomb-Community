package net.lightningsf.skBomb.logging;

import java.io.File;
import java.io.IOException;

import static java.lang.System.*;

/**
 * Created by xiurobert on 5/5/2015.
 */
public class log {

    public static void outPutLog() {
        File log = new File("skBomb.log.txt");
        try {
            log.createNewFile();
        } catch (IOException e) {
            err.println("Failed to create logs");
        }
    }

}
