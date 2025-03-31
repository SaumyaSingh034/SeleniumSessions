package Interview2024;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Flipkart {
        public WebDriver driver;
        public WebDriverWait wait;
        public Actions actions;



        @BeforeMethod
        public void browserSetup(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            actions = new Actions(driver, Duration.ofSeconds(10));
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://www.flipkart.com/");
        }

        @Test
        public void searchPage(){

            driver.findElement(By.xpath("//span[text()='Login']")).click();



        }

        @AfterMethod
        public void tearDown(){
            driver.quit();
        }


    }

