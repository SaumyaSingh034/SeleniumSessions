package Interview2025;

import org.openqa.selenium.WebDriver;

public class DriverManager1 {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static WebDriver getDriver(){
        return driver.get();
    }

    public static void setDriver(WebDriver dr){
        driver.set(dr);
    }

    public static void unload(){
        driver.remove();
    }
}
