package Interview2024;

import io.cucumber.java.it.Data;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

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

    @Test(dataProvider = "testData")
    public void javaScriptClass(String name, String des, String age) {
        System.out.println(name);
        System.out.println(des);
        System.out.println(age);
        WebElement el = driver.findElement(By.id(""));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border = '3px solid red'",el);


    }

    @Test(groups ={"smoke"})
    public void waits(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id"))).click();

        Wait fWait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        fWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id")));
    }


    @DataProvider
    public Object[][] testData(){
        return new Object[][]
                {
                        {"Saumya", "Test Automation Engineer", "29"},
                        {"Diksha", "Test Automation Engineer", "29"},
                        {"Romi", "Test Automation Engineer", "29"},
                };
    }
}
