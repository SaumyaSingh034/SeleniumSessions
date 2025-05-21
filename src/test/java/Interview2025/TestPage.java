package Interview2025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestPage {
    private final WebDriver driver;
    private WebDriverWait wait;

    /*
        1. Constructor
        2. Page Elements/Locators
        3. Public actions
         */
    public TestPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "testID")
    private WebElement userId;

    public void enterUserName(String name){
        wait.until(ExpectedConditions.visibilityOf(userId)).sendKeys(name);
    }

}
