package Interview2025;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropDataFile {

    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(new File("src/test/resources/test.properties"));
        prop.load(fis);

        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("designation"));
    }
}
