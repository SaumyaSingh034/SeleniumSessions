package Interview2024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class InterviewPrep {
    public WebDriver driver;

    @Test
    public void selectClass() {
        WebElement element = driver.findElement(By.id("id"));
        Select select = new Select(element);
        for (WebElement el : select.getOptions()) {
            if (el.getText().contains("Selenium Data")) {
                el.click();
                break;
            }
        }
    }


    @Test(retryAnalyzer = RetryInterview.class)
    public void actionClass() {
        Actions actions = new Actions(driver);
        actions.clickAndHold().build().perform();
    }

    @Test
    public void javaScriptClass() {
        WebElement el = driver.findElement(By.id(""));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border = '3px solid red'",el);


    }
}
