package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends AbstractPage {

    @FindBy(xpath = "//a[@href=\"/auth/\"]")
    private WebElement signIn;
    @FindBy(xpath = "//div[@class=\"third_foot_block\"]//a[@href=\"/check_order/\"]")
    private WebElement sendPack;
    @FindBy(xpath = "//div[@class=\"icon_block\"]/a/img")
    private WebElement find;
    @FindBy(xpath = "//img[@src=\"/local/media/images/social_btns_face.png\"]")
    private WebElement faceBook;
    @FindBy(xpath = "//img[@src=\"/local/media/images/social_btns_instagram.png\"]")
    private WebElement instagram;
    @FindBy(xpath = "//img[@src=\"/local/media/images/social_btns_vk.png\"]")
    private WebElement vk;
    @FindBy(xpath = "//img[@src=\"/local/media/images/social_btns_utube.png\"]")
    private WebElement youTube;
    @FindBy(xpath = "//a[@href=\"/catalog/\"]")
    private WebElement catalog;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void goToLoginPage(){
        signIn.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.samura.ru/auth/"));
    }

    public void goToCheckPackage(){
        sendPack.click();
//        new WebDriverWait(getDriver(), Duration.ofSeconds(5)).until(ExpectedConditions.urlContains())
    }

    public void goToCheckCatalog() {
        catalog.click();
    }

    public void goToSearch(){
        find.click();
    }

    public void navigateToFacebook () {
            this.faceBook.click();
        }
    public void navigateToInstagram () {
            this.instagram.click();
        }

        public void navigateToVk () {
            this.vk.click();
        }

        public void navigateToYoutube () {
            this.youTube.click();
        }

}
