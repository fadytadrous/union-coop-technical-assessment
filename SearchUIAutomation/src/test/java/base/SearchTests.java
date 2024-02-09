package base;

import org.testng.annotations.Test;

public class SearchTests extends base {

    @Test
    public void testSuccessfulSearch(){
        searchPage.setSearchInput("union corps");
        searchPage.searchBtn.click();
    }
}
