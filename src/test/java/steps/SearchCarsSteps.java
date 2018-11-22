package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CarsGuideHomePage;
import pages.CarsSearchPage;
import sun.security.util.PendingException;
import utilities.SeleniumDriver;

import java.util.List;

public class SearchCarsSteps {

    CarsGuideHomePage carsGuideHomePage = new CarsGuideHomePage();
    CarsSearchPage carsSearchPage = new CarsSearchPage();

    //whatever String I have added
    @Given("^User is on the home page \"([^\"]*)\" of Carsguide website$")
    public void user_is_on_the_home_page_of_Carsguide_website(String websiteURL) throws Throwable {
        SeleniumDriver.openPage(websiteURL);
    }

    //we need to mouse over to Buy + Sell
    @When("^user moves to the Menu$")
    public void user_moves_to_the_Menu(List<String> list) throws Throwable {
        String menu = list.get(1);
        System.out.println("menu selected: " + menu);
        carsGuideHomePage.moveToBuyPlusSellMenu();
    }

    @And("^user clicks on \"([^\"]*)\" link$")
    public void user_clicks_on_link(String searchCars) throws Throwable {
        carsGuideHomePage.clickOnSearchCarsMenu();
    }

    @And("^user selects car brand \"([^\"]*)\" from anymake dropdown list$")
    public void user_selects_car_brand_from_anymake_dropdown_list(String carMake) throws Throwable {
        carsSearchPage.selectCarMake(carMake);
    }

    @And("^user selects car morel \"([^\"]*)\" from select model drop down list$")
    public void user_selects_car_morel_from_select_model_drop_down_list(String carModel) throws Throwable {
        carsSearchPage.selectCarModel(carModel);
    }

    @And("^user selects location as \"([^\"]*)\" from select location drop down list$")
    public void user_selects_location_as_from_select_location_drop_down_list(String carLocation) throws Throwable {
        carsSearchPage.selectCarLocation(carLocation);
    }

    @And("^user selects price as \"([^\"]*)\" from price drop down list$")
    public void user_selects_price_as_from_price_drop_down_list(String carPrice) throws Throwable {
        carsSearchPage.selectCarPrice(carPrice);
    }

    @And("^user clicks on Find_My_Next_Car button$")
    public void user_clicks_on_Find_My_Next_Car_button() throws Throwable {
        carsSearchPage.clickOnFindMyNextCarButton();
    }

    @Then("^user should see list of returned car$")
    public void user_should_see_list_of_returned_car() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the page tile should be \"([^\"]*)\"$")
    public void the_page_tile_should_be(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
