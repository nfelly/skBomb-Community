package net.lightningsf.skBomb.syntax;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

/**
 * Created by xiurobert on 5/19/2015.
 */
public class getTheme {
    public void loadFromStream() {
        /*
        Fix this problem
        http://www.mytechnotes.biz/2012/07/maven-how-to-access-filesdata-in.html
        */
        InputStream input = getTheme.class.getResourceAsStream("synHighlight.yml");

        // Load up SnakeYAML
        Yaml yaml = new Yaml();

        // Put data into an Object
        Object dats = yaml.load(input);

    }



}
