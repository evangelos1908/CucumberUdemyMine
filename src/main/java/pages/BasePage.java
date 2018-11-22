package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.SeleniumDriver;

public class BasePage {


    /*
    * How the driver is initiated ?
    * It's initiated in the BaseTest: driver = new ChromeDriver();
    * The by HomePage home = new HomePage(driver) we call the super() and by this we pass the value to the BasePage
    * Very Important: this.driver = driver : like this we pass the drive to all the classes extends the BasePage
     */

    //public because driver is used by subclasses
    //public WebDriver driver;

    public BasePage(){
        //this.driver = driver;
        PageFactory.initElements(SeleniumDriver.getDriver(), this);
    }

    public void clickWithJSExecutor(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) SeleniumDriver.getDriver();
        executor.executeScript("arguments[0].click()", element);
    }








}
