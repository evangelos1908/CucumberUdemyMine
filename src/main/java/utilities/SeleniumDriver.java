package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumDriver {

    //Singleton pattern is used
    //all the variables and the methods of a Singleton class should be static
    /*why static variables ? because only 1 object of the class can be created at a given time, so the variables
    will be shared
    * Why Static methods: to be able to call them without an object of the current class to be required
    * Definition of static: A static variable is common to all the instances (or objects) of the class because it is a class level variable.
    In other words you can say that only a single copy of static variable is created and shared among all the instances of the class.
    */

    private static SeleniumDriver seleniumDriver;

    private static WebDriver driver;

    private static WebDriverWait waitDriver;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 30;

    private SeleniumDriver(){

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        waitDriver = new WebDriverWait(driver, TIMEOUT);
        /*
        implicitlyWait means that we can tell Selenium that we would like it to wait for a certain amount of time before throwing an exception
        that it cannot find the element on the page. We should note that implicit waits will be in place for the entire time the browser is open.
        This means that any search for elements on the page could take the time the implicit wait is set for.
        */
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        /*
        Sets the amount of time to wait for a page load to complete before throwing an error.
        If the timeout is negative, page loads can be indefinite.
         */
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

    }

    public static void openPage(String url){
        driver.get(url);
    }

    public static WebDriver getDriver(){
        return driver;
    }


    /*
    when the setUpDriver method is called, it will check if seleniumDriver = null
    If yes, then the constructor will be called and a new driver instance will b ecreated
     */
    public static void setUpDriver(){

        if(seleniumDriver == null){
            seleniumDriver = new SeleniumDriver();
        }

    }

    /*
        * quit(): Quits this driver, closing every associated window that was open.
        * close() : Close the current window, quitting the browser if it's the last window currently open.
     */

    public static void tearDown(){

        if(driver != null){
            driver.close();
            driver.quit();
        }

        seleniumDriver = null;
    }


}
