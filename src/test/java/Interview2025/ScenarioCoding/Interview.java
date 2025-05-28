package Interview2025.ScenarioCoding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Interview {
    public WebDriver driver;
    public LoginPage lp;
    public DashBoardPage dp;
    public WebDriverWait wait;

    @BeforeMethod
    public void initalSetUp(){
        driver = new ChromeDriver();
        driver.get("https://mock-login.nab.com");
        lp = new LoginPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void loginTest() {
        dp =  lp.loginToThePage("username", "password");
        String welcome = lp.getTextOfWelcomePage();
        Assert.assertEquals(welcome, "Welcome Admin");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();

    }
}
