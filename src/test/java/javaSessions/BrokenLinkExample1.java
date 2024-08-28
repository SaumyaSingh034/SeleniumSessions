package javaSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class BrokenLinkExample1 {
    public WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
    }

    @Test
    public void checkLink(){
        driver.get("https://bstackdemo.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for(WebElement link : links){
            String url = link.getAttribute("href");
            verifyUrl(url);
        }
    }

    private void verifyUrl(String url) {
        try {
            URL link = new URL(url);
            HttpURLConnection http = (HttpURLConnection) link.openConnection();
            http.setConnectTimeout(3000);
            http.connect();
            if(http.getResponseCode()==200){
                System.out.println(url+" -----> "+http.getResponseMessage());
            }
            else{
                System.out.println(url+" -----> "+http.getResponseMessage()+" --- is broken----");
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
