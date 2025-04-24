package Interview2024;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserLevel implements ITestListener {
    public WebDriver driver;


    @Parameters("browser")
    @Test
    public void getBrowserSetup(String browserName){
        System.out.println("Setting Up the browser : "+browserName);

    }
    public void onTestSuccess(ITestResult result) {
        System.out.println("✔️ Test passed: " + result.getName());
    }
}
