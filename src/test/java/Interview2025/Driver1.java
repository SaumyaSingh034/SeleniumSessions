package Interview2025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver1 {

        private static  ThreadLocal<WebDriver> tDriver = new ThreadLocal<>();

        public static WebDriver initializeDriver(String browser){
            if(browser.equals("chrome")){
                tDriver.set(new ChromeDriver());
            }
            return getDriver();
        }
        public static WebDriver getDriver(){
            return tDriver.get();
        }

        public void quitDriver(){
            getDriver().quit();
            tDriver.remove();
        }

}
