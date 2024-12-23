package Interview2024;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertsFrames {

    WebDriver driver;
     @Test
    public void alertTest(){
        Alert al =  driver.switchTo().alert();
        al.accept();
        al.getText();
        al.dismiss();
        al.sendKeys("Hello");
     }

     @Test
    public void Frames(){
         WebElement el = driver.findElement(By.id(""));
         driver.switchTo().frame(el);
         driver.switchTo().frame("name");
         driver.switchTo().frame(9);
         driver.switchTo().defaultContent();

     }
}
