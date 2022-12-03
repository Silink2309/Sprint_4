package Peges;


import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;


public  class OrderPageTest {
    private WebDriver driver;

    @Test
    public void Test() {
        // driver =new ChromeDriver() ; //Тестировал на Safari , в конце проверил на Chrome

        driver = new SafariDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        HomePage objHomePage = new HomePage(driver);
        objHomePage.clickCookieButton();


       OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.fillForm();
        objOrderPage.rentFill();


    }

    @After
    public void tearDown() {
        driver.quit();
    }
}