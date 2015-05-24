package net.lightningsf.skBomb.dependencyMgt;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.io.FileUtils;

import net.lightningsf.skBomb.addonMgt.DownloadException;

import static java.lang.System.*;

/**
 * Created by xiurobert on 5/4/2015.
 */
public class fetchMainJAR {
    public static void main(String[] args) throws Exception {

        String sep = File.separator;

        File deps = new File("Skript-JarFiles");
        if (!deps.exists()) {
            deps.createNewFile();
        }

        URL skloc = new URL("https://dl.dropbox.com/u/48570304/Skript/Skript.jar");
        File mainjarfile = new File("Skript-JarFiles" + sep + "skript.jar");

        if (!mainjarfile.exists()) {
            mainjarfile.createNewFile();
            out.println("[CONSOLE] Dependencies are not available, downloading");
            try {
                FileUtils.copyURLToFile(skloc, mainjarfile);
            } catch (IOException e) {
                throw new DownloadException("Could not download jar file");
            }
        }
    }
}
