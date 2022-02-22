package org.example.lesson6Test;

import org.example.lesson6.CatalogPage;
import org.example.lesson6.KnifePage;
import org.example.lesson6.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTest extends AbstractTest{

    @Test
    void sort(){

        new MainPage(getWebDriver()).goToCheckCatalog();
        new CatalogPage(getWebDriver()).goToSteelKnife();
        new KnifePage(getWebDriver()).sortPrice();
        new KnifePage(getWebDriver()).sortPopular();
        Assertions.assertEquals("Купить хороший японский нож для кухни. Профессиональные наборы кухонных ножей - Samura.ru", getWebDriver().getTitle());
    }
}
