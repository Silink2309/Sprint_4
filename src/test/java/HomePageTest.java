
import org.junit.Before;
import peges.HomePage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.awt.event.KeyEvent;


public class HomePageTest {

    private WebDriver driver;
    private String  urlScooter= "https://qa-scooter.praktikum-services.ru/";
//
    @Before
    public void openTest(){
      //  driver =new ChromeDriver()
        driver = new SafariDriver();
        driver.get(urlScooter);

    }
    //

    @Test
    public void accordionTest0(){

        HomePage objHomePage = new HomePage(driver);
        objHomePage.clickCookieButton();//Без нкк
        objHomePage.testAccordion0();
    }
    @Test
    public void accordionTest1(){
        HomePage objHomePage = new HomePage(driver);
        objHomePage.clickCookieButton();
        objHomePage.testAccordion1();}
    @Test
    public void accordionTest2(){
        HomePage objHomePage = new HomePage(driver);
        objHomePage.clickCookieButton();
        objHomePage.testAccordion2();}
    @Test
    public void accordionTest3(){
        HomePage objHomePage = new HomePage(driver);
        objHomePage.clickCookieButton();
        objHomePage.testAccordion3();}
    @Test
    public void accordionTest4(){
        HomePage objHomePage = new HomePage(driver);
        objHomePage.clickCookieButton();
        objHomePage.testAccordion4();}
    @Test
    public void accordionTest5(){
        HomePage objHomePage = new HomePage(driver);
        objHomePage.clickCookieButton();
        objHomePage.testAccordion5();}
    @Test
    public void accordionTest6(){
        HomePage objHomePage = new HomePage(driver);
        objHomePage.clickCookieButton();
        objHomePage.testAccordion6();}
    @Test
    public void accordionTest7(){
        HomePage objHomePage = new HomePage(driver);
        objHomePage.clickCookieButton();
        objHomePage.testAccordion7();}

    @After
    public void tearDown() {
        driver.quit();
    }
}

