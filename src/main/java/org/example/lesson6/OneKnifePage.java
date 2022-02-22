package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OneKnifePage extends AbstractPage{

    @FindBy(id = "bx_117848907_9298_add_basket_link")
    private WebElement basket;
    @FindBy(xpath = "//div/span[@class=\"popup-window-close-icon popup-window-titlebar-close-icon\"]")
    private WebElement closePopUp;
    @FindBy(xpath = "//a[@href=\"/basket/\"]/img")
    private WebElement goBasket;

    public OneKnifePage(WebDriver driver) {
        super(driver);
    }

    public void sendToBasket(){
        basket.click();
    }

    public void closeBar(){
        closePopUp.click();
    }

    public void goToBasket(){
        goBasket.click();
    }
}
