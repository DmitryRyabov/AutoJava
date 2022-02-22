package org.example.lesson6Test;

import org.example.lesson6.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OutPutInBagTest extends AbstractTest {

    @Test
    void putIn() {
        new MainPage(getWebDriver()).goToSearch();
        new FindPage(getWebDriver()).startFind();
        new FindPage(getWebDriver()).writeSomeThing("damascus 67").startFind();
        new DamascusPage(getWebDriver()).sendIn();
        new OneKnifePage(getWebDriver()).sendToBasket();
        new OneKnifePage(getWebDriver()).closeBar();
        new OneKnifePage(getWebDriver()).goToBasket();
        new BasketPage(getWebDriver()).deleteKnife();
        Assertions.assertEquals("Samura.ru - корзина товаров", getWebDriver().getTitle());

    }
}