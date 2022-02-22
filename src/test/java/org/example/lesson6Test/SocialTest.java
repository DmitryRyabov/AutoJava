package org.example.lesson6Test;

import org.example.lesson6.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SocialTest extends AbstractTest {

    @Test
    void social() throws InterruptedException {

        new MainPage(getWebDriver()).navigateToFacebook();
        Thread.sleep(1000);
        new MainPage(getWebDriver()).navigateToInstagram();
        Thread.sleep(1000);
        new MainPage(getWebDriver()).navigateToVk();
        Thread.sleep(1000);
        new MainPage(getWebDriver()).navigateToYoutube();
        Thread.sleep(1000);
        Assertions.assertEquals("Купить ножи с доставкой в официальном интернет-магазине Samura.", getWebDriver().getTitle());



//        Actions socialBar = new Actions(getDriver());
//
//        socialBar.pause(10)
//                .click(getDriver().findElement(By.xpath("//img[@src=\"/local/media/images/social_btns_face.png\"]")))
//                .click(getDriver().findElement(By.xpath("//img[@src=\"/local/media/images/social_btns_instagram.png\"]")))
//                .click(getDriver().findElement(By.xpath("//img[@src=\"/local/media/images/social_btns_vk.png\"]")))
//                .click(getDriver().findElement(By.xpath("//img[@src=\"/local/media/images/social_btns_utube.png\"]")))
//                .pause(2000L)
//                .build()
//                .perform();
//
//        System.out.println(getDriver().getWindowHandles());
//        String window = getDriver().getWindowHandle();
//        getDriver().switchTo().window(window);
//
//        Assertions.assertEquals("Купить ножи с доставкой в официальном интернет-магазине Samura.", getDriver().getTitle());
    }
}


