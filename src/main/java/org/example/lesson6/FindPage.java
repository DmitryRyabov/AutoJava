package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindPage extends AbstractPage{

    @FindBy(xpath = "//form[@method=\"get\"]/input[@type=\"text\"]")
    private WebElement find;
    @FindBy(xpath = "//input[@value=\"Искать\"]")
    private WebElement submit;


    public FindPage(WebDriver driver) {
        super(driver);
    }

    public FindPage writeSomeThing(String name){
        this.find.click();
        this.find.sendKeys(name);
        return this;
    }

    public void startFind(){
        submit.click();
    }
}
