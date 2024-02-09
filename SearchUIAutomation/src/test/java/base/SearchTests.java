package base;

import org.testng.annotations.Test;
import pages.SearchResultsPage;

import static org.testng.Assert.*;

public class SearchTests extends base {

    @Test
    public void testSuccessfulSearchUsingClick(){
        String searchInput = "union coop";

        searchPage.setSearchInput(searchInput);
        SearchResultsPage searchResultsPage = searchPage.clickSearch();

        assertTrue(searchResultsPage.isResultFound(searchInput),
                "Search results using Click don't match with input");
    }

    @Test
    public void testSuccessfulSearchUsingEnter(){
        String searchInput = "union coop";

        searchPage.setSearchInput(searchInput);
        SearchResultsPage searchResultsPage = searchPage.clickSearch();

        assertTrue(searchResultsPage.isResultFound(searchInput),
                "Search results using Enter Button  don't match with input");
    }

    @Test
    public void testClearBtn(){
        String searchInput = "union coop";

        searchPage.setSearchInput(searchInput);
        searchPage.clearBtn.click();

        assertTrue(searchPage.searchInput.getText().isEmpty(),
                "Clear Button  isn't working properly");
    }

    @Test
    public void testFeelingLuckyBtn(){
        String searchInput = "unioncoop";

        searchPage.setSearchInput(searchInput);
        searchPage.feelingLuckyBtn.click();

        assertTrue(driver.getCurrentUrl().contains(searchInput),
                "Feeling lucky button gets the right url");
    }
}
