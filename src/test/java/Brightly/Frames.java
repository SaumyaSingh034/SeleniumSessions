package Brightly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Frames {

    public WebDriver driver;

    @Test
    public void frames(){
        driver.switchTo().frame(1);
        driver.switchTo().frame("saumya");
        driver.switchTo().frame(driver.findElement(By.id("")));
        driver.switchTo().defaultContent();
    }

}
