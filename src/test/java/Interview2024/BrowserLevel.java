package Interview2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class BrowserLevel implements ITestListener {
    public WebDriver driver;


    @Parameters("browser")
    @Test
    public void getBrowserSetup(String browserName){
        System.out.println("Setting Up the browser : "+browserName);

    }

    @Test
    public void tagName(String browserName, int num){
        System.out.println("Setting Up the browser : "+browserName);
        List<WebElement> divTags = driver.findElements(By.tagName("div"));
        divTags.get(num).click();



    }
    public void onTestSuccess(ITestResult result) {
        System.out.println("✔️ Test passed: " + result.getName());
    }
}
