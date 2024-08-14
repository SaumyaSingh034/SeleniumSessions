package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserWindow {

    public WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/browser-windows");

    }

    @Test
    public void browserWindow() throws InterruptedException {

       driver.findElement(By.id("windowButton")).click();
       Set<String> window = driver.getWindowHandles();
       Iterator<String> it = window.iterator();
       String parentWindow = it.next();
       System.out.println(driver.getTitle()+" --> Parent: "+parentWindow);
       String childWindow = it.next();
        System.out.println(driver.getTitle()+" --> Child: "+childWindow);
       driver.switchTo().window(childWindow);
       Thread.sleep(2000);

       System.out.println(driver.getTitle());
      String text = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
      System.out.println(text);
      driver.close();
      driver.switchTo().window(parentWindow);
      Thread.sleep(2000);
      System.out.println(driver.getTitle());
    }

    @Test
    public void browserMessage(){
        driver.findElement(By.id("messageWindowButton")).click();
        Set<String> window = driver.getWindowHandles();
        Iterator<String> it = window.iterator();
        String parent = it.next();
        String child = it.next();

        driver.switchTo().window(child);
       System.out.println( driver.findElement(By.tagName("body")).getText());
       driver.close();

       driver.switchTo().defaultContent();
       System.out.println(driver.getTitle());

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
