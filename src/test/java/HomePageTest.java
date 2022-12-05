
import org.junit.Before;
import peges.HomePage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;



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
    public void orderDown(){

       HomePage objHomePage = new HomePage(driver);
       objHomePage.clickOrderButtonDown();
    }
    @Test
    public void cookieTest(){
        HomePage objHomePage = new HomePage(driver);
        objHomePage.clickCookieButton();
    }
    @Test
    public void accordionTest(){
        HomePage objHomePage = new HomePage(driver);
        objHomePage.testAccordionFull();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}

