package Interview2024;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GenericInterview {

    public WebDriver driver;

    @Test
    public void ifRames()
    {
        driver.switchTo().frame("");
        driver.switchTo().defaultContent();
    }

    @Test
    public void actionsItem(){
        Actions actions = new Actions(driver);
        actions.sendKeys(driver.findElement(By.id("")), Keys.ENTER);

        actions.click(driver.findElement(By.id(""))).keyDown(Keys.SHIFT)
                .sendKeys("Selenium").keyUp(Keys.SHIFT).build().perform();
    }



}


