package Interview2024;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ResizeWindow {
    public WebDriver driver;

    @Test
    public void resize(){
        Dimension d = new Dimension(1045, 897);
        driver.manage().window().setSize(d);
        driver.manage().window().fullscreen();
        Select select = new Select(driver.findElement(By.id("calendler")));
        select.selectByVisibleText("April");

    }
}
