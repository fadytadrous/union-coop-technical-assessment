package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultsPage {
    private WebDriver driver;  // WebDriver instance to interact with the browser

    /**
     * Constructor to initialize the SearchResultsPage object with WebDriver instance.
     * @param driver WebDriver instance
     */
    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String searchResultsSelector = "div.kb0PBd h3";



}
