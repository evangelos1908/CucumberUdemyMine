package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CarsSearchPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//select[@id='makes']")
    public WebElement carMakeDropDown;


    @FindBy(how = How.XPATH, using = "//select[@id='models']")
    public WebElement carModelDropDown;


    @FindBy(how = How.XPATH, using = "//select[@id='locations']")
    public WebElement carLocationDropDown;


    @FindBy(how = How.XPATH, using = "//select[@id='price-max']")
    public WebElement carPriceDropDown;

    @FindBy(how = How.XPATH, using = "//input[@id='search-submit']")
    public WebElement carSearchButton;

    //Constructor - Initializing the HomePage object - so no need for driver.findby etc
    public CarsSearchPage() {
        super();
    }


    public void selectCarMake(String carMake){
        Select ocarMake = new Select(carMakeDropDown);
        ocarMake.selectByValue(carMake);
    }

    public void selectCarModel(String carModel){
        Select ocarModel = new Select(carModelDropDown);
        ocarModel.selectByValue(carModel);
    }

    public void selectCarLocation(String carLocation){
        Select ocarLocation = new Select(carLocationDropDown);
        ocarLocation.selectByValue(carLocation);
    }

    public void selectCarPrice(String carPrice){
        Select ocarPrice = new Select(carPriceDropDown);
        ocarPrice.selectByValue("1000");
    }

    public void clickOnFindMyNextCarButton(){
        carSearchButton.click();
    }






}
