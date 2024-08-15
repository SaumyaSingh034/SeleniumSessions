package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Frames {
    public WebDriver driver;
    Alert alert;

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/frames");
    }

    @Test
    public void frameTesting()  {
        driver.findElement(By.id("frame1Wrapper"));
        driver.switchTo().frame("frame1");
        String text = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(text);
        driver.switchTo().defaultContent();
        String text1 = driver.findElement(By.xpath("//div[@id='framesWrapper']/div[1]")).getText();
        System.out.println(text1);


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
