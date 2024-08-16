package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class makeMyTrip {
    public WebDriver driver;
    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.makemytrip.com/");
    }

    @Test
    public void makeMyTripTest() throws InterruptedException {
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
        WebElement from = driver.findElement(By.id("fromCity"));
        WebElement to = driver.findElement(By.id("toCity"));
        Thread.sleep(5000);
        from.sendKeys("Mumbai");



    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
