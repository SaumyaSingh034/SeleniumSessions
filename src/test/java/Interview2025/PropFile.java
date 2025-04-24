package Interview2025;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropFile
{
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(new File(" "));
        Properties prop = new Properties();
        prop.load(file);
        prop.getProperty("");
    }
}
