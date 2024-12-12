package Interview2024;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ScreenshotData {
    public static WebDriver driver;
    public static void main(String[] args){
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srec = ts.getScreenshotAs(OutputType.FILE);


    }
}
