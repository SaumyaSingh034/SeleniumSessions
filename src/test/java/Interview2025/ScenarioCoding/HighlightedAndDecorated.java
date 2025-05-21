package Interview2025.ScenarioCoding;

import Interview2025.RetryTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HighlightedAndDecorated {
    private static WebDriver driver;

    @Test
    public void testDecoration(){
       WebElement element =  driver.findElement(By.id("elemenet"));
        String bgColor = element.getCssValue("background-color");
        String decoration = element.getCssValue("text-decoration-line");
        if(!bgColor.equals("transparent") && !bgColor.equals("rgba(0,0,0,0)")){
            System.out.println("Highlighted");
        }

        if(decoration.equals("underline")){
            System.out.println("Underline");
        }
    }

    @Test(retryAnalyzer = RetryTest.class)
    public void shiftDown(){
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).perform();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollheight);");
    }

}
