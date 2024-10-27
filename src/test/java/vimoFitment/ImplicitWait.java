package vimoFitment;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitWait {
    public WebDriver driver;
    @Test
    public void test(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

}
