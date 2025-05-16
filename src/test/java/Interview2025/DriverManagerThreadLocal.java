package Interview2025;

import org.openqa.selenium.WebDriver;

public class DriverManagerThreadLocal {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();


    public static void setDriver(WebDriver dr){
        driver.set(dr);
    }

    public static WebDriver getDriver(){
        return driver.get();
    }

    public void unloadDriver(){
        driver.remove();
    }
}
