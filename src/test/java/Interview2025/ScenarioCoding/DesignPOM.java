package Interview2025.ScenarioCoding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesignPOM {

    @FindBy(id="dosa")
    private WebElement id;

    @FindBy(xpath = "//*[contains(text(),'Saumya')]")
    private WebElement nameSearch;

    public DesignPOM(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickOnId(){
        id.click();
    }
}
