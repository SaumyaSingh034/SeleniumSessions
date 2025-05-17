package Interview2025.ScenarioCoding;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
    public static WebDriver driver;
    LoginPage lPage = new LoginPage(driver);
    DashBoardPage dashBoardPage;

    @Test(dataProvider = "setUpData")
    public void loginTestFunctionality(String name, String pass){
        dashBoardPage = lPage.loginToThePage(name, pass);
    }

    @DataProvider(name="setUpData")
    public Object[][] setData(){
        return new Object[][]
                {
                        {"Saumya","Test@123"},
                        {"Roshan", "Test@123"},
                        {"Ram", "Auto@123"
                        }
                };
    }
}
