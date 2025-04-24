package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "username")
    WebElement userName;

    @FindBy(id = "password")
    WebElement passWord;

    @FindBy(xpath = "//*[text()='signIn]")
    WebElement loginBtn;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void loginWithValidCredentials(String name, String pass){

    }
}
