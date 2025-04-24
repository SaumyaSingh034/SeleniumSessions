package Interview2024;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class GenericInterview {

    public WebDriver driver;

    @Test(groups = {"regression"})
    public void ifRames()
    {
        driver.switchTo().frame("");
        driver.switchTo().defaultContent();
    }

    @Test(groups = {"smoke"})
    public void actionsItem(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(""))).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Wait<WebDriver> fWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
        Actions actions = new Actions(driver);
        actions.sendKeys(driver.findElement(By.id("")), Keys.ENTER);

        actions.click(driver.findElement(By.id(""))).keyDown(Keys.SHIFT)
                .sendKeys("Selenium").keyUp(Keys.SHIFT).build().perform();
    }


    @Test(groups = {"regression"})
    public void interview(){
        String background = driver.findElement(By.id("")).getCssValue("background-color");
        String underline  = driver.findElement(By.id("")).getCssValue("text-decoration-line");
        if(underline.contains("underline")){
            System.out.println("It Contains Underline");
        }

        if(!background.equals("rgba(0,0,0,0)") && !background.equals("transparent")){


        }
    }



}


