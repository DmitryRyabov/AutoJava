package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        //Тест 4. Авторизация

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.samura.ru/");

        WebElement webElement = driver.findElement(By.xpath("//a[@href=\"/auth/\"]"));
        webElement.click();
        driver.findElement(By.xpath("//input[@name=\"USER_LOGIN\"]")).sendKeys("RyabovDmitry");
        driver.findElement(By.xpath("//input[@name=\"USER_PASSWORD\"]")).sendKeys("10133033No");
        driver.findElement(By.xpath("//input[@name=\"Login\"]")).click();

        Thread.sleep(3000);


        driver.quit();


    }
}
