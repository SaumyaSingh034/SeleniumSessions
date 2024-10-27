package javaSessions;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Cookies {
    public WebDriver driver;
    @Test
    public void cookiesTest(){
        Cookie cookie = null;
        Set<Cookie> cookiesSet = driver.manage().getCookies();
        driver.manage().getCookieNamed("Name");
        driver.manage().addCookie(cookie);
        driver.manage().deleteAllCookies();
        //driver.manage().deleteCookie();
        //driver.manage().deleteCookieNamed(names);
    }
}
