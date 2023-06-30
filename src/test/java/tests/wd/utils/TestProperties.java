package tests.wd.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    private static Properties properties;

    private TestProperties() {
    }

    public static String getProperty(String propName) throws IOException {
        if (properties == null) {
            properties = new Properties();
            properties.load(new FileReader(new File("src/test/resources/test.properties")));
        }

        return properties.getProperty(propName);
    }

}

