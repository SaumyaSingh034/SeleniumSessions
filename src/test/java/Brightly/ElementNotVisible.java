package Brightly;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ElementNotVisible {

    public WebDriver driver;

    @Test
    public void findElement(){
        WebElement element = driver.findElement(By.xpath("//a[@name='value']"));
        JavascriptExecutor js =
                (JavascriptExecutor) driver;
        js.executeScript("argument[0].click();", element);
    }
}
