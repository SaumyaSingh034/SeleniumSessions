package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CricketBuzz {
    WebDriver driver;
    @Test
    public void cricketBuzz(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/");
        Actions actions = new Actions(driver);
        WebElement team = driver.findElement(By.xpath("//div[@id='teamDropDown']"));
        actions.moveToElement(team);
        driver.findElement(By.xpath("//*[text()='India']")).click();
    }
}
