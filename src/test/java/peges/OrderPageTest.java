package peges;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;



public  class OrderPageTest {
    private WebDriver driver;
    private static String  urlScooter= "https://qa-scooter.praktikum-services.ru/";
//
        @Before
        public void openTest() {
            //  driver =new ChromeDriver()
            driver = new SafariDriver();
            driver.get(urlScooter);

        }

        @Test
        public void testOrderUp() {
            OrderPage objOrderPage = new OrderPage(driver);

            HomePage objHomePage = new HomePage(driver);
           objHomePage.clickCookieButton();
            objOrderPage.chooseOrderButtonAndClick("upper");
            objOrderPage.fillForm("Василий","Пупкин","Москва","89998887766","Сокольники");
            objOrderPage.rentFill("пиу пиу ");
            objOrderPage.checkOrderStatusCompleted();

        }

        @Test
        public void testOrderDown() {
            OrderPage objOrderPage = new OrderPage(driver);

            HomePage objHomePage = new HomePage(driver);
            objOrderPage.chooseOrderButtonAndClick("lower");
            objOrderPage.fillForm("Петр","Тыгов","Москва","89998887766","Котельники");
            objOrderPage.rentFill("Тра та та ");
            objOrderPage.checkOrderStatusCompleted();
        }


        @After
        public void tearDown() {
            driver.quit();
        }
    }
