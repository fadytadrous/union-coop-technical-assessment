package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    private WebDriver driver;  // WebDriver instance to interact with the browser

    /**
     * Constructor to initialize the LoginPage object with WebDriver instance.
     * @param driver WebDriver instance
     */
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "APjFqb")
    public WebElement searchInput;

    @FindBy(css = "div.FPdoLc input.gNO89b")
    public WebElement searchBtn;

    @FindBy(css = "div.FPdoLc input.RNmpXc")
    public WebElement FeelingLuckyBtn;

    @FindBy(css = "div.vOY7J")
    public WebElement ClearBtn;

    public void setSearchInput(String input) {
        searchInput.clear();
        searchInput.sendKeys(input);
    }


}