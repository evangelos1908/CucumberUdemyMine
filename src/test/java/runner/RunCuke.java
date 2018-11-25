package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src\\test\\resources\\features"},//feature files path
        glue = {"steps"}, //step definition path. No need to give the entire path
        //dryRun = false //if true it checks the feature files have matching step in the step definition class BUT NOT execute the code within the steps
        monochrome = true, //determines the formatting of the output. without monochrome some special characters printed in the console
        tags = {"@SearchPageCars"} //run only the test with this particular @
        //generate Cucumber Reports - A target folder will be created with
        //plugin = {"pretty", "html:target/cucumber","json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
)


public class RunCuke  {

}
