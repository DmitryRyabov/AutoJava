package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PackagePage extends AbstractPage{

    @FindBy(id = "ORDER_ID")
    private WebElement id;
    @FindBy(id = "PROPERTY_PHONE")
    private WebElement phone;
    @FindBy(xpath = "//div[@class=\"btn_form_container\"]/input[@type=\"submit\"]")
    private WebElement submit;

    public PackagePage(WebDriver driver) {
        super(driver);
    }

    public PackagePage sendId(String id){
        this.id.click();
        this.id.sendKeys(id);
        return this;
    }

    public PackagePage sendPhone(String phone){
        this.phone.click();
        this.phone.sendKeys(phone);
        return this;
    }

    public void checkPackage(){
        submit.click();
    }


}
