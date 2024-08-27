package javaSessions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FacebookDataProvider {
    public WebDriver driver;

    @Parameters({"URL"})


    @Test
    public void setdata(String URL){
        driver.get(URL);
    }

    @DataProvider(name="DataSet")
    public Object[][] setMyData(){
        return new Object[][]{
                {"user1","pass1"},
                {"user2","pass2"},
        };
    }

    @Test(dataProvider = "DataSet")
    public void dataFromDataProvider(String userName, String password){
        driver.get("");
        driver.navigate().to("");
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("")));

        //DesiredCapabilities For HTTPS Certification
        DesiredCapabilities ds = new DesiredCapabilities();
        ds.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);




    }


}
