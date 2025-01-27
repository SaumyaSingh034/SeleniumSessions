package Interview2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CSSValue {
    public WebDriver driver;

    @Test
    public void testing(){
        WebElement el = driver.findElement(By.id("id"));
        String bgColor = el.getCssValue("backgroundColor");
    }
}
