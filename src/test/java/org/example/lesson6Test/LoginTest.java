package org.example.lesson6Test;

import org.example.lesson6.LoginPage;
import org.example.lesson6.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginTest extends AbstractTest {

    @Test
    void logIn(){

        new MainPage(getWebDriver()).goToLoginPage();
        new WebDriverWait(getWebDriver(), Duration.ofSeconds(5)).until(ExpectedConditions.urlContains("https://www.samura.ru/auth/"));
        new LoginPage(getWebDriver()).setLogin("RyabovDmitry").setPassword("10133033No").loginIn();
        Assertions.assertTrue(getWebDriver().findElement(By.xpath("//a[@href=\"?out=1\"]")).getText().equals("Выйти"));


    }

}
