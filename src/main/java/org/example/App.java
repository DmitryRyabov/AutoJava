package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class App 
{
    public static void main( String[] args )
    {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.samura.ru/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Тест 1. Добавление товара в корзину

        WebElement webElement = driver.findElement(By.xpath("//div[@class=\"icon_block\"]/a/img"));
        webElement.click();
        driver.findElement(By.xpath("//form[@method=\"get\"]/input[@type=\"text\"]")).sendKeys("damascus 67");
        driver.findElement(By.xpath("//input[@value=\"Искать\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"prod_h3 h3\"]/a[@href=\"/catalog/damasskie_nozhi/damascus/sd_0021/\"]")).click();
        driver.findElement(By.id("bx_117848907_9298_add_basket_link")).click();
        driver.findElement(By.xpath("//div/span[@class=\"popup-window-close-icon popup-window-titlebar-close-icon\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"/basket/\"]/img")).click();

        //Тест 2. Удаление товара из корзины


        driver.findElement(By.xpath("//header[@class=\"header\"]//div[@class=\"logo_block wide_view\"]//img[@src=\"/images/logo__slogan_white.png\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"/basket/\"]/img")).click();
        driver.findElement(By.xpath("//a[@class=\"delete_row__btn\"]")).click();




        driver.quit();



    }
}
