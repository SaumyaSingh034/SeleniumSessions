package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class LearningSessions {
    public WebDriver driver;

    @BeforeMethod
    public void browserSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void learningTest() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

    }

    @Test
    public void learnScreeshot() {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File des = new File("screenshot.png");
        try {
            FileUtils.copyFile(src, des);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        @Test
        public void learnCheckBoxorRadioButn () {
           WebElement e =  driver.findElement(By.id("checkbox"));
           if(!e.isSelected())
               e.click();
           WebElement radio = driver.findElement(By.xpath("radioBtn"));
                   if(!radio.isSelected())
                       radio.click();
        }

        @Test
    public void learnWaits(){
        //Waits --> Implicit Wait and Explicit Wait ---> WebDriverWait and FluentWait
            //implicit wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


            //WebDriverWait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("value")));

            //Fluent Wait
            Wait<WebDriver> fWait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(15))
                    .pollingEvery(Duration.ofSeconds(2))
                    .ignoring(ElementClickInterceptedException.class);
        }

        @Test
    public void KeyBoardActios(){
        driver.findElement(By.id("value")).sendKeys(Keys.ENTER);

        Actions a = new Actions(driver);
        a.keyDown(Keys.ARROW_DOWN);
        }

        @DataProvider(name = "SetParametersData")
    public Object[][] setdata(){
        return new Object[][]{
                {"saumya1","passwo1"},
                {"tryaksh","pass2"},
        };
        }

        @Test(dataProvider = "SetParametersData")
    public void parameterization(String userName, String password){
            driver.findElement(By.id("value")).sendKeys(userName);
        }
    }

