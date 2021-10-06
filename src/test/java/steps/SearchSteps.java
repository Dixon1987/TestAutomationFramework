package steps;

import pages.SearchPage;

public class SearchSteps {

    SearchPage searchPage = new SearchPage();

    public SearchResultSteps executeSearch(String keyword) throws InterruptedException{
        searchPage.fillSearchField(keyword);
        searchPage.pressEnter();
        Thread.sleep(3000); //nice

        return new SearchResultSteps();

    }


}
