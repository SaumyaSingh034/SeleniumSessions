package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BookStoreApplication {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void bookStoreApplicationLogin(){
        //driver.get("https://demoqa.com/login");
        driver.get("https://www.flipkart.com/");
//        driver.findElement(By.id("userName")).sendKeys("SaumTest");
//        driver.findElement(By.id("password")).sendKeys("Test@123456789");
//        driver.findElement(By.id("login")).click();
        WebElement login = driver.findElement(By.xpath("//*[text()='Login']"));
        Actions action = new Actions(driver);
        action.moveToElement(login).perform();
    }
}
