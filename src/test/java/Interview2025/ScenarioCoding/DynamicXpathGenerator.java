package Interview2025.ScenarioCoding;

import org.openqa.selenium.WebDriver;

public class DynamicXpathGenerator {
    public static WebDriver driver;

    public String generateDynamicXpath(String tag, String attribute, String value){
        String xpath = "//"+tag+"[@"+attribute+"='"+value+"'"+"]";
        System.out.println(xpath);

        return String.format("//%s[@%s='%s']", tag, attribute, value);
    }
}
