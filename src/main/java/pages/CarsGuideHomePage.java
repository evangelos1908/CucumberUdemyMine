package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.SeleniumDriver;

import javax.swing.*;

public class CarsGuideHomePage extends BasePage {

    @FindBy(how = How.XPATH, using = "//a[text()='buy + sell']")
    public WebElement buyAndSell;

    @FindBy(how = How.XPATH, using = "//a[text()='reviews']")
    public WebElement reviews;

    @FindBy(how = How.LINK_TEXT, using = "Search Cars")
    public WebElement searchCars;

    @FindBy(how = How.LINK_TEXT, using = "Used")
    public WebElement usedCarsSearch;


    //Constructor - Initializing the HomePage object - so no need for driver.findby etc
    public CarsGuideHomePage() {
        super();
    }

    public void moveToBuyPlusSellMenu(){
        Actions action = new Actions(SeleniumDriver.getDriver());
        action.moveToElement(buyAndSell).build().perform();
    }

    public void clickOnSearchCarsMenu(){

        searchCars.click();

    }

    public void clickOnUsedCarsMenu(){

    }







}
