package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ModalPopUp {
    public WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/modal-dialogs");
    }

    @Test
    public void modelDialogs(){
        driver.findElement(By.id("showSmallModal")).click();
        driver.switchTo().activeElement();
        String heading = driver.findElement(By.className("modal-header")).getText();
        System.out.println("Heading------>"+heading);
        String body = driver.findElement(By.className("modal-body")).getText();
        System.out.println(body);
        driver.findElement(By.id("closeSmallModal")).click();
        driver.switchTo().defaultContent();
        String defautlText = driver.findElement(By.xpath("//div[@id='modalWrapper']/div/div")).getText();
        System.out.println(defautlText);
        driver.findElement(By.id("showLargeModal")).click();
        driver.switchTo().activeElement();
        String heading1= driver.findElement(By.className("modal-header")).getText();
        System.out.println(heading1);
        String body1 = driver.findElement(By.className("modal-body")).getText();
        System.out.println(body1);
        driver.findElement(By.id("closeLargeModal")).click();
        String defautlText2 = driver.findElement(By.xpath("//div[@id='modalWrapper']/div/div")).getText();
        System.out.println(defautlText2);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
