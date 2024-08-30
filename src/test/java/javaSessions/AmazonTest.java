package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AmazonTest {
    public WebDriver driver;
    public Actions action;
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

    }

    @Test
    public void getListOfAccounts(){
        action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("nav-link-accountList")));
        List<WebElement> element = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a/span"));
        for (WebElement el : element) {
            System.out.println(el.getText());
        }

        List<WebElement> element1 = driver.findElements(By.xpath("//div[@id='nav-al-your-account']/a/span"));
        for (WebElement el1 : element1){
            System.out.println(el1.getText());
        }

    }
}
