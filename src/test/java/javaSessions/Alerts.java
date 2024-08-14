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

public class Alerts {

    public  WebDriver driver;
    Alert alert;

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/alerts");
    }

    @Test
    public void checkingAlert() throws InterruptedException {


        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(5000);
         alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        String text = alert.getText();
        if (text.equalsIgnoreCase("You clicked a button")) {
            System.out.println("correct alert messg");
        } else {
            System.out.println("in-correct alert messg");
        }
        alert.accept();
    }

    @Test(priority = 1)
    public void checkalertAfter5Sec() throws InterruptedException {
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(5000);
        alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);
        if (text.equalsIgnoreCase("This alert appeared after 5 seconds")) {
            System.out.println("correct alert messg");
        } else {
            System.out.println("in-correct alert messg");
        }
        alert.accept();

    }

    @Test(priority = 2)
    public void promptAlert(){
        driver.findElement(By.id("promtButton")).click();
        alert = driver.switchTo().alert();
        alert.sendKeys("Saumya Singh");
        alert.accept();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
