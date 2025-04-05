package Interview2024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoad {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("src/test/resources/test.properties");
        Properties prop = new Properties();
        prop.load(file);
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("designation"));
        prop.setProperty("dynamicValue", "gotTheOffer");
        prop.setProperty("age", "30");
        System.out.println(prop.getProperty("dynamicValue"));
        System.out.println(prop.getProperty("age"));
    }
}
