package Interview2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class BrowserLevel implements ITestListener {
    public WebDriver driver;


    @Parameters("browser")
    @Test
    public void getBrowserSetup(String browserName){
        System.out.println("Setting Up the browser : "+browserName);

    }

    @Test
    public void tagName(String browserName, int num){
        System.out.println("Setting Up the browser : "+browserName);
        List<WebElement> divTags = driver.findElements(By.tagName("div"));
        divTags.get(num).click();



    }
    public void onTestSuccess(ITestResult result) {
        System.out.println("✔️ Test passed: " + result.getName());
    }

    @Test
    public void waits(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(""))).click();

        Wait fWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        fWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
    }
}
