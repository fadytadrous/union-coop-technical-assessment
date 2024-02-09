package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
}
