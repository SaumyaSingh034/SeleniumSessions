package Interview2025;

import io.cucumber.java.et.Ja;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class ScenarioBased {

    public WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    public void highlightElement(WebDriver driver, WebElement el){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid ref'",el);
    }

    public void flash(WebElement el){
        String background = el.getCssValue("backgroundColor");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'",el);
    }

    public void clickOnAndElement(By locator , int timeOutSeconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutSeconds));
        try{
            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(locator));
            el.click();
        }catch (ElementNotInteractableException e){
            System.out.println("Element is not clicable");
        }
    }

    public void clickOnElementWithPossibleTestCases(WebDriver driver, By locator, int timeouts){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
        try{
           WebElement el =  wait.until(ExpectedConditions.elementToBeClickable(locator));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true)", el);
            el.click();
        }catch (ElementNotInteractableException e){
            System.out.println("Exception occu");
        }
    }
}
