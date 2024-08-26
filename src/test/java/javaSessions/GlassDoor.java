package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
    }
}
