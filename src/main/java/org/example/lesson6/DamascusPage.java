package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DamascusPage extends AbstractPage{

    @FindBy(xpath = "//div[@class=\"prod_h3 h3\"]/a[@href=\"/catalog/damasskie_nozhi/damascus/sd_0021/\"]")
    private WebElement oneKnife;

    public DamascusPage(WebDriver driver) {
        super(driver);
    }

    public void sendIn(){
        oneKnife.click();
    }

}
