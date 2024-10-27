package vimoFitment;

import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class JavaScriptScrollBy {
    public WebDriver driver;

    @Test
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.id("q"));
        element.sendKeys("SoftwareTestingPractice");
        element.sendKeys(Keys.ENTER);
        js.executeScript("window.scrollBy(0,1000)");

    }
}
