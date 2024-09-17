package javaSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PracticeSession {
    public WebDriver driver;

    @Test
    public void testCookiees(){
        Cookie cookieNameWithValue = driver.manage().getCookieNamed("cookieeName");
        cookieNameWithValue.getName();

       Set<Cookie> cookieDara =  driver.manage().getCookies();

    }

    @Test
    public void testFrames(){
        driver.switchTo().frame("frame webelement");
        WebElement el = driver.findElement(By.cssSelector("tag[@attribute='value']"));
        el.click();
        driver.switchTo().defaultContent();
    }

    @Test
    public void explicitWait(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @Test
    public void fluentWait(){
        Wait<WebDriver> wait1 = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
        wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
    }
}
