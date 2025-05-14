package Interview2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectManipulation {
    public static WebDriver driver;
    @Test
    public void checkingSelectClass(){
        Select select = new Select(driver.findElement(By.id("")));
        select.getOptions();
    }
}
