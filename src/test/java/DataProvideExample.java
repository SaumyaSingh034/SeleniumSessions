import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideExample {
    public WebDriver driver;

    @DataProvider(name="setUpData")
    public Object[][] testData(){
        return new Object[][]{
                {"Saumya","TestAutomation Engineer"},
                {"Rahul","Director"},
                {"Tryaksh", "Astronaut"}
        };
    }


    @Test(dataProvider = "setUpData")
    public void loginData(String name, String desg){
        driver.findElement(By.id("username")).sendKeys(name);
        driver.findElement(By.id("designation")).sendKeys(desg);
    }
}
