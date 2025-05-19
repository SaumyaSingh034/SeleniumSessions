package Interview2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods {
    public static WebDriver driver = null;

    public static void main(String[] args){
        WebElement element = driver.findElement(By.id("data"));
        Select select = new Select(element);
        select.selectByValue("India");
        select.selectByVisibleText("test");
        select.selectByIndex(1);
        select.getOptions();
        select.getAllSelectedOptions();

        driver.switchTo().frame("name");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notification");
        driver = new ChromeDriver(options);

    }
}
