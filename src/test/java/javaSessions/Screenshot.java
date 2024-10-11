package javaSessions;

import com.aventstack.extentreports.reporter.FileUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    static WebDriver driver;

    public static void main(String[] args){
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File(""));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
