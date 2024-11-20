package Brightly;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

import java.time.Duration;

public class Waits {

    public WebDriver driver;

    @Test
    public void waitTest(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id")));
        //Fluent wait

        Wait<WebDriver> fWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        fWait.until(ExpectedConditions.presenceOfElementLocated(By.id("")));

    }

}
