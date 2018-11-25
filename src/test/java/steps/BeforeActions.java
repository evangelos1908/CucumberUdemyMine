package steps;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.SeleniumDriver;

public class BeforeActions {

    @Before
    public static void setUp(){
        SeleniumDriver.setUpDriver();
    }
}
