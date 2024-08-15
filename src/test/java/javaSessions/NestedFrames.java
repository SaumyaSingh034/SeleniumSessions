package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NestedFrames {
    public WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/nestedframes");
    }

    @Test
    public void nestedFrameTesting() {
        String parentFrameId = "frame1";
       driver.switchTo().frame(parentFrameId);
       System.out.println(driver.getTitle());
         driver.switchTo().frame("<p>Child Iframe</p>");
        System.out.println(driver.getTitle());

    }



    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    }
