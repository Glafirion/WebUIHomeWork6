package org.example.HomeWork6;

import HomeWork6.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectTest {
    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeAll
    static void registerDiver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
       driver = new ChromeDriver();
       driver.get("https://www.moscowbooks.ru/");
    }

    @Test
    void buyABookTest() throws InterruptedException {
       new MainPage(driver).clickArticlesButton();
       new MainMenuBlock(driver).clickCloseIconButton();
       new NovaPage(driver).clickFirstCardBook();
       new FirstCardBook(driver).clickBasketButton();
       new BuyingButton(driver).checkTotalSumma("1 038");


      Thread.sleep(3000);

    }

    @AfterEach
    void killBrowser() {
        driver.quit();
    }


}
