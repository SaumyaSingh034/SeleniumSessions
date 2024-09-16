package javaSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

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
}
