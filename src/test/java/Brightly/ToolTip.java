package Brightly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTip {

    public WebDriver driver;

    @Test
    public void tooltip(){
        WebElement element = driver.findElement(By.cssSelector("tooltip.selector"));
        String toolTipText = element.getAttribute("title");
        Assert.assertEquals(toolTipText, "Expected ToolTip");
    }
}
