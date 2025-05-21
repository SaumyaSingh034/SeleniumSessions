package Interview2025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverThreads {
    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public void setDriver(String browser){
        if(browser.equals("chrome")){
            tlDriver.set(new ChromeDriver());
        }
    }

    public WebDriver getDriver(){
        return tlDriver.get();
    }

    public void removeDriver(){
        tlDriver.remove();
    }
}
