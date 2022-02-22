package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends AbstractPage{

    @FindBy(xpath = "//li[@class=\"parent\"]/a[@href=\"/catalog/stalnye_kukhonnye_nozhi/\"]")
    private WebElement steelKnife;



    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    public void goToSteelKnife(){
        steelKnife.click();
    }
}
