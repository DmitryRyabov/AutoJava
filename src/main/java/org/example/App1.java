package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        //Тест 3. Отслеживание посылки

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.samura.ru/");

        WebElement webElement = driver.findElement(By.xpath("//div[@class=\"third_foot_block\"]//a[@href=\"/check_order/\"]"));
        webElement.click();
        driver.findElement(By.id("ORDER_ID")).sendKeys("1234-YD1234567");
        driver.findElement(By.id("PROPERTY_PHONE")).sendKeys("9514663559");
        driver.findElement(By.xpath("//div[@class=\"btn_form_container\"]/input[@type=\"submit\"]")).click();

        Thread.sleep(3000);


        driver.quit();

    }
}
