package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.SearchPage;
import pages.SearchResultsPage;

public class base {

    protected WebDriver driver;

    protected SearchPage searchPage;

    @BeforeMethod
    public void setup(){
        // Setup WebDriver using WebDriverManager for Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Navigate to the application URL and maximize the window
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        searchPage = new SearchPage(driver);
    }

    /**
     * Method to tear down the WebDriver instance after executing tests.
     * Quits the WebDriver session.
     */
    @AfterMethod
    public void tearDown(){
        // Quit the WebDriver session
        driver.quit();
    }


}
