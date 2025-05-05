package Interview2025;

import io.cucumber.java.et.Ja;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

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
}
