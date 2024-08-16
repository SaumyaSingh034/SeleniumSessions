package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Widgets {
    public WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @Test
    public void widgetAccordian() throws InterruptedException {
        driver.get("https://demoqa.com/accordian");
        driver.findElement(By.id("section1Heading")).click();
        String content1 = driver.findElement(By.xpath("//div[@id='section1Content']/p")).getText();
        System.out.println(content1);
        Thread.sleep(5000);
        driver.findElement(By.id("section2Heading")).click();
        String content2 = driver.findElement(By.xpath("//div[@id='section2Content']/p")).getText();
        System.out.println(content2);
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)","");
        driver.findElement(By.id("section3Heading")).click();
        String content3 = driver.findElement(By.xpath("//div[@id='section3Content']/p")).getText();
        System.out.println(content3);
        System.out.println(driver.findElement(By.xpath("//div[@id='accordianContainer']/h1")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@id='accordianContainer']/h1")).getAttribute("class"));


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
