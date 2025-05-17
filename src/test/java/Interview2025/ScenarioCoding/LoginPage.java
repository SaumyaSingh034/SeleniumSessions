package Interview2025.ScenarioCoding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
  //  public WebDriver driver;

    @FindBy(id = "username")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement pass;

    @FindBy(id="submitBtn")
    private WebElement btn;


    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public DashBoardPage loginToThePage(String uName, String pWd){
        userName.sendKeys(uName);
        pass.sendKeys(pWd);
        btn.click();
        return new DashBoardPage();
    }
}
