package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchPage {

    private WebDriver driver;  // WebDriver instance to interact with the browser

    /**
     * Constructor to initialize the SearchPage object with WebDriver instance.
     * @param driver WebDriver instance
     */
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements representing search elements on the page

    @FindBy(id = "APjFqb")
    public WebElement searchInput;

    @FindBy(css = "div.FPdoLc input.gNO89b")
    public WebElement searchBtn;

    @FindBy(css = "div.FPdoLc input.RNmpXc")
    public WebElement feelingLuckyBtn;

    @FindBy(css = "div.vOY7J")
    public WebElement clearBtn;

    public String suggestionsCssSelector =  "div.wM6W7d "; //css element for search suggestions

    /**
     * Method to set the search input text.
     * @param input Text to be entered into the search input field
     */
    public void setSearchInput(String input) {
        searchInput.clear();
        searchInput.sendKeys(input);
    }

    /**
     * Method to perform a search by clicking the search button.
     * @return SearchResultsPage object representing the search results page
     */
    public SearchResultsPage clickSearch(){
        searchBtn.click();
        return new SearchResultsPage(driver);
    }

    /**
     * Method to perform a search by pressing the Enter key.
     * @return SearchResultsPage object representing the search results page
     */
    public SearchResultsPage searchUsingEnter(){
        searchInput.sendKeys(Keys.RETURN);
        return new SearchResultsPage(driver);
    }

    /**
     * Checks if the specified search input is found in the titles of the search results.
     *
     * @param searchInput The search input to be checked.
     * @param ElementCss   The CSS selector of the elements containing search results titles.
     * @return {@code true} if the search input is found in any of the search results titles, {@code false} otherwise.
     */
    public boolean isResultFound(String searchInput, String ElementCss) {
        // Preprocess the search input
        String searchEntry = searchInput.toLowerCase().replaceAll("\\s", "");

        // Wait until search results are visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ElementCss)));

        // Find elements once
        List<WebElement> resultsTitle = driver.findElements(By.cssSelector(ElementCss));

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
