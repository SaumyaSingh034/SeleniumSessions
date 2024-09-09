package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CSSValueSession {
    public WebDriver driver;

    @Test
    public void checkColorOfAnElement(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
       WebElement element =  driver.findElement(By.id("abc"));
       String color = element.getCssValue("color");
       String font = element.getCssValue("font-family");
        assertEquals("yellow", color);
        assertEquals("arial", font);
    }
}
