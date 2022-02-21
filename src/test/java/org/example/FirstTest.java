package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class FirstTest extends AbstractTest{

// Авторизация
    @Test
    void logIn(){

        getDriver().findElement(By.xpath("//a[@href=\"/auth/\"]")).click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(5)).until(ExpectedConditions.urlContains("https://www.samura.ru/auth/"));

        Actions loginIn = new Actions(getDriver());

        loginIn.sendKeys(getDriver().findElement(By.xpath("//input[@name=\"USER_LOGIN\"]")), "RyabovDmitry")
                .click(getDriver().findElement(By.xpath("//input[@name=\"USER_PASSWORD\"]")))
                .sendKeys("10133033No")
                .click(getDriver().findElement(By.xpath("//input[@name=\"Login\"]")))
                .build()
                .perform();
        Assertions.assertTrue(getDriver().findElement(By.xpath("//a[@href=\"?out=1\"]")).getText().equals("Выйти"));
    }

    //Отслеживание посылки

    @Test
    void sendPackage(){
        getDriver().findElement(By.xpath("//div[@class=\"third_foot_block\"]//a[@href=\"/check_order/\"]")).click();

        Actions checkIn = new Actions(getDriver());
        checkIn.sendKeys(getDriver().findElement(By.id("ORDER_ID")), "1234-YD1234567")
                .click(getDriver().findElement(By.id("PROPERTY_PHONE")))
                .sendKeys("9514663559")
                .click(getDriver().findElement(By.xpath("//div[@class=\"btn_form_container\"]/input[@type=\"submit\"]")))
                .build()
                .perform();

        Assertions.assertEquals("Где мой заказ?", getDriver().getTitle());



    }

    // Добавление в корзину

    @Test
    void putInBag(){
        getDriver().findElement(By.xpath("//div[@class=\"icon_block\"]/a/img")).click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(5)).until(ExpectedConditions.urlContains("https://www.samura.ru/catalog/?s=d&q="));
        getDriver().findElement(By.xpath("//form[@method=\"get\"]/input[@type=\"text\"]")).sendKeys("damascus 67");
        getDriver().findElement(By.xpath("//input[@value=\"Искать\"]")).click();
        getDriver().findElement(By.xpath("//div[@class=\"prod_h3 h3\"]/a[@href=\"/catalog/damasskie_nozhi/damascus/sd_0021/\"]")).click();
        getDriver().findElement(By.id("bx_117848907_9298_add_basket_link")).click();
        getDriver().findElement(By.xpath("//div/span[@class=\"popup-window-close-icon popup-window-titlebar-close-icon\"]")).click();
        getDriver().findElement(By.xpath("//a[@href=\"/basket/\"]/img")).click();
        Assertions.assertEquals("Samura.ru - корзина товаров", getDriver().getTitle());


    }

// Удаление из корзины

    @Test
    void outputInBag() {
        getDriver().findElement(By.xpath("//div[@class=\"icon_block\"]/a/img")).click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(5)).until(ExpectedConditions.urlContains("https://www.samura.ru/catalog/?s=d&q="));
        getDriver().findElement(By.xpath("//form[@method=\"get\"]/input[@type=\"text\"]")).sendKeys("damascus 67");
        getDriver().findElement(By.xpath("//input[@value=\"Искать\"]")).click();
        getDriver().findElement(By.xpath("//div[@class=\"prod_h3 h3\"]/a[@href=\"/catalog/damasskie_nozhi/damascus/sd_0021/\"]")).click();
        getDriver().findElement(By.id("bx_117848907_9298_add_basket_link")).click();
        getDriver().findElement(By.xpath("//div/span[@class=\"popup-window-close-icon popup-window-titlebar-close-icon\"]")).click();
        getDriver().findElement(By.xpath("//a[@href=\"/basket/\"]/img")).click();
        getDriver().findElement(By.xpath("//header[@class=\"header\"]//div[@class=\"logo_block wide_view\"]//img[@src=\"/images/logo__slogan_white.png\"]")).click();
        getDriver().findElement(By.xpath("//a[@href=\"/basket/\"]/img")).click();
        getDriver().findElement(By.xpath("//a[@class=\"delete_row__btn\"]")).click();
        Assertions.assertEquals("Samura.ru - корзина товаров", getDriver().getTitle());


        }

        // Тест соц сетей

        @Test
    void social(){

        Actions socialBar = new Actions(getDriver());

        socialBar.pause(10)
            .click(getDriver().findElement(By.xpath("//img[@src=\"/local/media/images/social_btns_face.png\"]")))
                .click(getDriver().findElement(By.xpath("//img[@src=\"/local/media/images/social_btns_instagram.png\"]")))
                .click(getDriver().findElement(By.xpath("//img[@src=\"/local/media/images/social_btns_vk.png\"]")))
                .click(getDriver().findElement(By.xpath("//img[@src=\"/local/media/images/social_btns_utube.png\"]")))
                .pause(2000L)
                .build()
                .perform();

            System.out.println(getDriver().getWindowHandles());
            String window = getDriver().getWindowHandle();
            getDriver().switchTo().window(window);

        Assertions.assertEquals("Купить ножи с доставкой в официальном интернет-магазине Samura.", getDriver().getTitle());



    }

    // Сортировка

    @Test
    void sort(){
        getDriver().findElement(By.xpath("//a[@href=\"/catalog/\"]")).click();
        getDriver().findElement(By.xpath("//li[@class=\"parent\"]/a[@href=\"/catalog/stalnye_kukhonnye_nozhi/\"]")).click();
        getDriver().findElement(By.xpath("//a[@data-sort=\"popular\"]")).click();
        getDriver().findElement(By.xpath("//a[@data-sort=\"price\"]"));

        Assertions.assertEquals("Купить хороший японский нож для кухни. Профессиональные наборы кухонных ножей - Samura.ru", getDriver().getTitle());


    }





}





