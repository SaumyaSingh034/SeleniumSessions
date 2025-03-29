package Interview2024;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HdfcAutomation {

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
        driver.get("https://www.hdfcbank.com/");
    }

    @Test
    public void validateLandingPage(){
        WebElement LoginBtn = driver.findElement(By.xpath("//button[@ng-mouseover='mainctrl.login();']")) ;
        System.out.println("Executed SuccessFully amd landed on "+driver.getTitle());
        driver.findElement(By.xpath("//button[@class='onetrust-close-btn-handler banner-close-button ot-close-icon']")).click();
        actions.moveToElement(LoginBtn).perform();
        //LoginBtn.click();

        //wait.until(ExpectedConditions.alertIsPresent()).dismiss();


    }

    @AfterMethod
    public void tearDown(){
      //  driver.quit();
    }
}
