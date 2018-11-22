package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sun.security.util.PendingException;

public class SearchCarsSteps {

    @Given("^User is on the home page \"([^\"]*)\" of Carsguide website$")
    public void user_is_on_the_home_page_of_Carsguide_website(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user moves to the Menu$")
    public void user_moves_to_the_Menu(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }

    @And("^user clicks on \"([^\"]*)\" link$")
    public void user_clicks_on_link(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user selects car brand \"([^\"]*)\" from anymake dropdown list$")
    public void user_selects_car_brand_from_anymake_dropdown_list(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user selects car morel \"([^\"]*)\" from select model drop down list$")
    public void user_selects_car_morel_from_select_model_drop_down_list(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user selects location as \"([^\"]*)\" from select location drop down list$")
    public void user_selects_location_as_from_select_location_drop_down_list(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user selects price as \"([^\"]*)\" from price drop down list$")
    public void user_selects_price_as_from_price_drop_down_list(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user clicks on Find_My_Next_Car button$")
    public void user_clicks_on_Find_My_Next_Car_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
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
