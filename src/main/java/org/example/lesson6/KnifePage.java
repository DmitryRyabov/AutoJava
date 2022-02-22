package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KnifePage extends AbstractPage{

    @FindBy(xpath = "//a[@data-sort=\"popular\"]")
    private WebElement sortPop;
    @FindBy(xpath = "//a[@data-sort=\"price\"]")
    private WebElement sortPr;

    public KnifePage(WebDriver driver) {
        super(driver);
    }

    public void sortPopular(){
        sortPop.click();
    }

    public void sortPrice(){
        sortPr.click();
    }
}
