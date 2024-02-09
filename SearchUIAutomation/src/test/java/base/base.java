/*
 * This class serves as a base class for test classes in the test suite.
 * It provides setup and teardown methods for WebDriver initialization and cleanup.
 */
package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import pages.SearchPage;


public class base {

    protected WebDriver driver;

    protected SearchPage searchPage;

    /**
     * Method to set up the WebDriver instance and navigate to the application URL before each test method.
     * It initializes the WebDriver using WebDriverManager for Chrome, navigates to the application URL,
     * maximizes the browser window, and initializes the SearchPage object.
     * For the sake of making all tests in one run under searchTest Class BeforeMethod was used
     */
    @BeforeMethod
    public void setup(){
        // Setup WebDriver using WebDriverManager for Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Navigate to the application URL and maximize the window
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        // Initialize the SearchPage object
        searchPage = new SearchPage(driver);
    }

    /**
     * Method to tear down the WebDriver instance after executing tests.
     * Quits the WebDriver session.
     * For the sake of making all tests in one run under searchTest Class AfterMethod was used
     */
    @AfterMethod
    public void tearDown(){
        // Quit the WebDriver session
        driver.quit();
    }


}
