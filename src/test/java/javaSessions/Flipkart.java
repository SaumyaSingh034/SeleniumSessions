package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Flipkart {
    public WebDriver driver;

    @BeforeMethod
    public void openFlipkart(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

    }

    @Test
    public void validationOnFlipkart(){
        driver.get("https://www.flipkart.com/");
        String title = driver.getTitle();
        System.out.println(title);
        Wait<WebDriver> fWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(ElementNotInteractableException.class);
        fWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='Pke_EE']")));
        driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Iphone 15 pro max");

        driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys(Keys.ENTER);
    }

    @AfterMethod
    public void shutDownFlipkart(){
        driver.quit();
    }
}
