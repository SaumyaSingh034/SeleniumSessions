package Interview2024;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowas {
    public static WebDriver driver;

    public static void main(String[] args){
       String currentWindow =  driver.getWindowHandle();
       Set<String> windows = driver.getWindowHandles();
       Iterator<String> iterator = windows.iterator();
       iterator.next();
       iterator.hasNext();


       for(String window : windows){
           driver.switchTo().window(window).getTitle();
       }
    }
}
