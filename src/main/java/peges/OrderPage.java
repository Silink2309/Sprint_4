package peges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class OrderPage {
//
    private WebDriver driver;

    private final By buttonOrder = By.className("Button_Button__ra12g");
    private By orderStatusCompleted = By.xpath("//*[contains(text(), 'Заказ оформлен')]");
    private final By buttonOrderD = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    private final By nameField = By.xpath(".//div/div[2]/div[2]/div[1]/input");
    private final By surName = By.xpath(".//div/div[2]/div[2]/div[2]/input");
    private final By addressField = By.xpath(".//div/div[2]/div[2]/div[3]/input");
    private final By metroStationField = By.xpath(".//input[@placeholder='* Станция метро']");
    private final By phoneField = By.xpath(".//div/div[2]/div[2]/div[5]/input");
    private final By buttonNext =  By.xpath("//div/div[2]/div[3]/button");
    private final By dateField = By.xpath(".//div/div[2]/div[2]/div[1]/div/div/input");
    private final By periodField = By.xpath("//div/div[2]/div[2]/div[2]/div");
   private final By isBlackCheckbox = By.xpath(".//input[@id='black']");
    private final By isGreyCheckbox = By.xpath("//input[@id='grey']");
    private final By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private final By buttonOrd = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");

//Объединение заполненя 1- ой формы ,верхння кнопка Заказать

    public void fillForm(String name,String sName,String address,String phone,String metro){
       // clickOrderButtonUp();
        fillName(name);
        fillSurName(sName);
        fillAddress(address);
        fillStationMetro(metro);
        fillPhone(phone);
        clickButtonNext();

    }

//Объединение заполнение 2-ой формы
    public void rentFill(String comment){
        dataFill();
        periodFill();
        clickBox();
        commentFill(comment);
        order();
        willIssue();

    }


    public OrderPage(WebDriver driver) {

        this.driver = driver;


    }
//1 я страница
    public void clickOrderButtonUp(){
        driver.findElement(buttonOrder).click();
    }

    public void fillName(String name){
        driver.findElement(nameField).sendKeys(name);
    }
    public void fillSurName(String sName){
        driver.findElement(surName).sendKeys(sName);

    } //Адрес
    public void fillAddress(String address){
        driver.findElement(addressField).sendKeys(address);

    }
    //Выбор станции метро
    public void fillStationMetro(String metro) {


        driver.findElement(metroStationField).click();
        WebElement elementStationMetro = driver.findElement(metroStationField);
        elementStationMetro.sendKeys(metro);
        driver.findElement(By.xpath("//div/div[2]/div[2]/div[4]/div/div[2]")).click();


    }
    //Номер телефона
    public void fillPhone(String phone){
        driver.findElement(phoneField).sendKeys(phone);
    }
    //Кнопка далее
    public void clickButtonNext(){
        driver.findElement(buttonNext).click();
    }

   //2-я страница

    //Заполнение даты
    public void dataFill(){
        driver.findElement(dateField).click();
        driver.findElement(By.xpath("//div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[4]")).click();
    }
    //На какой период заказ
    public void periodFill(){
        driver.findElement(periodField).click();
        driver.findElement(By.xpath("//div/div[2]/div[2]/div[2]/div[2]/div[1]")).click();

    }
    //Цвет самоката
   public void clickBox( ){
        driver.findElement(isBlackCheckbox).click();
    }
    //Коментарий курьеру
    public void commentFill(String comment){
        driver.findElement(commentField).sendKeys(comment);
    }
    //Конечная кнопка оформить заказ
    public void  order(){
        driver.findElement(buttonOrd).click();
    }
    public void willIssue(){
        driver.findElement(By.xpath("//div/div[2]/div[5]/div[2]/button[2]")).click();
    }
    //Проверка появление окна Заказ оформлен
    public void checkOrderStatusCompleted(){
        driver.findElement(orderStatusCompleted).isEnabled();
    }


}
