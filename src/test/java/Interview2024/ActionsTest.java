package Interview2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsTest {
    WebDriver driver;
    @Test
    public void actionsTest(){
        Actions actions = new Actions(driver);
//        Action a = new Action() {
//            @Override
//            public void perform() {
//
//            }
//        }
        actions.dragAndDrop(driver.findElement(By.xpath("//*[text(),'Hello']")),
                driver.findElement(By.xpath("//*[starts-with,'data']"))).build();
    }


    @Test
    public void testIsDisplayed(){
        driver.findElement(By.id("data")).isDisplayed();

    }
}
