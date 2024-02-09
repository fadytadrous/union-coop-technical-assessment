/*
 * This class contains test methods for testing different functionalities related to search.
 * It extends the Base class to inherit setup and teardown methods for WebDriver initialization and cleanup.
 */

package base;

import org.testng.annotations.Test;
import pages.SearchResultsPage;

import static org.testng.Assert.*;

public class SearchTests extends base {

    /**
     * Test method to verify successful search using the click action.
     * It sets the search input, clicks the search button, and verifies if the expected result is found.
     */
    @Test
    public void testSuccessfulSearchUsingClick(){
        String searchInput = "union coop";

        searchPage.setSearchInput(searchInput);
        SearchResultsPage searchResultsPage = searchPage.clickSearch();

        assertTrue(searchResultsPage.isResultFound(searchInput),
                "Search results using Click don't match with input");
    }

    /**
     * Test method to verify successful search using the Enter button.
     * It sets the search input, presses the Enter key, and verifies if the expected result is found.
     */
    @Test
    public void testSuccessfulSearchUsingEnter(){
        String searchInput = "union coop";

        searchPage.setSearchInput(searchInput);
        SearchResultsPage searchResultsPage = searchPage.clickSearch();

        assertTrue(searchResultsPage.isResultFound(searchInput),
                "Search results using Enter Button don't match with input");
    }

    /**
     * Test method to verify the functionality of the Clear button.
     * It sets the search input, clicks the Clear button, and verifies if the search input field is empty.
     */
    @Test
    public void testClearBtn(){
        String searchInput = "union coop";

        searchPage.setSearchInput(searchInput);
        searchPage.clearBtn.click();

        assertTrue(searchPage.searchInput.getText().isEmpty(),
                "Clear Button isn't working properly");
    }

    /**
     * Test method to verify the functionality of the Feeling Lucky button.
     * It sets the search input, clicks the Feeling Lucky button, and verifies if the current URL contains the search input.
     */
    @Test
    public void testFeelingLuckyBtn(){
        String searchInput = "unioncoop";

        searchPage.setSearchInput(searchInput);
        searchPage.feelingLuckyBtn.click();

        assertTrue(driver.getCurrentUrl().contains(searchInput),
                "Feeling lucky button gets the right url");
    }
}
