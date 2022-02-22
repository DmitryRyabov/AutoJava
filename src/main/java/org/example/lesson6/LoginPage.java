package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends AbstractPage{

    @FindBy(xpath = "//input[@name=\"USER_LOGIN\"]")
    private WebElement login;
    @FindBy(xpath = "//input[@name=\"USER_PASSWORD\"]")
    private WebElement password;
    @FindBy(xpath = "//input[@name=\"Login\"]")
    private WebElement submit;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setLogin(String login) {
        this.login.sendKeys(login);
        return this;
    }

    public LoginPage setPassword(String password) {
        this.password.click();
        this.password.sendKeys(password);
        return this;
    }

    public void loginIn(){
        this.submit.click();
    }





}
