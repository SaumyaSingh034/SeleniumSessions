package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alerts {

    public static WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @Test
    public void checkingAlert() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        String text = alert.getText();
        if (text.equalsIgnoreCase("You clicked a button")) {
            System.out.println("correct alert messg");
        } else {
            System.out.println("in-correct alert messg");
        }
        alert.accept();
    }
}
