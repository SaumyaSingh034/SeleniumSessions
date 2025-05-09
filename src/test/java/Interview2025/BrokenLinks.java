package Interview2025;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.DriverManager;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args){
         WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        for(WebElement link : linkElements){
            String url = link.getAttribute("href");

            if(url==null || url.isEmpty()){
                System.out.println("url is null or empty");
                continue;
            }
            try{
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("GET");
                connection.connect();
                int responseCode = connection.getResponseCode();
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
