package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends AbstractPage{

    @FindBy(xpath = "//a[@class=\"delete_row__btn\"]")
    private WebElement delete;

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public void deleteKnife(){
        delete.click();
    }
}
