package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Locale;

public class SearchResultsPage {
    private WebDriver driver;  // WebDriver instance to interact with the browser

    /**
     * Constructor to initialize the SearchResultsPage object with WebDriver instance.
     * @param driver WebDriver instance
     */
    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }



    public boolean isResultFound(String searchInput) {
        // Preprocess the search input
        String searchEntry = searchInput.toLowerCase().replaceAll("\\s", "");

        // Wait until search results are visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2)); 
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.kb0PBd h3")));

        // Find elements once
        List<WebElement> resultsTitle = driver.findElements(By.cssSelector("div.kb0PBd h3"));

        // Flag to indicate if result is found
        boolean found = false;

        // Iterate through the results
        for (WebElement element : resultsTitle) {
            // Preprocess the title
            String title = element.getText().toLowerCase().replaceAll("\\s", "");

            // Check for a match
            if (title.contains(searchEntry)) {
                found = true;
                // Exit early if a match is found
                break;
            }
        }
        return found;
    }



}
