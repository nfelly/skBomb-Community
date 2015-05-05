package net.lightningsf.skBomb.dependencyMgt;

import java.io.File;

import java.io.IOException;

import java.net.URL;

import org.apache.commons.io.FileUtils;

import static java.lang.System.*;
/**
 * Created by xiurobert on 5/4/2015.
 */
public class fetchMainJAR {
    public static void main(String[] args) throws Exception {
        File deps = new File("Skript-JarFiles");

        URL skloc = new URL("https://dl.dropbox.com/u/48570304/Skript/Skript.jar");
        if (!deps.exists()) {
            File mainjarfile = new File("skript.jar");
            out.println("[CONSOLE] Dependencies are not available, downloading");
            try {
                FileUtils.copyURLToFile(skloc, mainjarfile);
            } catch (IOException e) {
                err.println("[IDE] IDE Internal Error Occured while trying to fetch a dependency");
                err.println("[IDE] Found Java Error IOException");
                err.println("[IDE] Sending Information to LoggingAPI");
                e.printStackTrace();
            }
        }
    }
}
