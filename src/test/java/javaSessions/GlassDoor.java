package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class GlassDoor {
    public WebDriver driver;

    @BeforeMethod
    public void browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.glassdoor.co.in/index.htm");
    }

    @Test
    public void test() {
        driver.findElement(By.id("SignInButton")).click();
        driver.findElement(By.xpath("//button[@class='CloseButton']"));
        String text = driver.findElement(By.xpath("//h1[@class='HeroBannerTNG_center__01NJH py-md-xxl HeroBannerTNG_headerText___YEuP']")).getText();
        System.out.println(text);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));


        //Fluent
        Wait<WebDriver> fwait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        fwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
    }
}
