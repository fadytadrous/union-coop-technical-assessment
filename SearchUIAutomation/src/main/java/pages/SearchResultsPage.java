package pages;

import org.openqa.selenium.WebDriver;

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
