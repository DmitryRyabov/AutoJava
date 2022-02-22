package org.example.lesson6Test;

import org.example.lesson6.MainPage;
import org.example.lesson6.PackagePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PackageTest extends AbstractTest{

    @Test
    void checkPackage(){
        new MainPage(getWebDriver()).goToCheckPackage();
        new PackagePage(getWebDriver()).sendId("1234-YD1234567").sendPhone("9514663559").checkPackage();
        Assertions.assertEquals("Где мой заказ?", getWebDriver().getTitle());

    }
}
