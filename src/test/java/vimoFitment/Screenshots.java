package vimoFitment;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Screenshots {
    public WebDriver driver;

    @Test
    public void screenshot() throws IOException {
        File files = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File des = new File("/screenshot.png");
        FileUtils.copyFile(files, des);

    }
}
