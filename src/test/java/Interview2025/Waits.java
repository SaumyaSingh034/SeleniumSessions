package Interview2025;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Waits {

    public WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void waits(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(""))).click();

        Wait<WebDriver> fWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
    }


    @Test
    public void shadowRoot(){
       WebElement shadowHost =  driver.findElement(By.cssSelector("custom-component"));
        JavascriptExecutor shadowJS = (JavascriptExecutor) driver;
        WebElement shadowRoot = (WebElement) shadowJS.executeScript("return arguments[0].shadowRoot", shadowHost);
        shadowRoot.findElement(By.id("input")).sendKeys("data");


        shadowJS.executeScript("arguments[0].scrollIntoView(true);",shadowHost);


    }

    @Test
    public void scenarios(){
        driver.get("");
        driver.findElement(By.xpath("//a[@input='data']")).click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("elemenet"))).build().perform();
        WebElement options = driver.findElement(By.linkText("Option Text"));
        action.sendKeys(Keys.SHIFT).click(options);

    }

    @Test
    public void highLightElement(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style','background:yellow; border: 2px solid red;');", element);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for(WebElement link : links){
            if(link.getText().contains("Brightly")){
                System.out.println();
            }
        }
    }



}
