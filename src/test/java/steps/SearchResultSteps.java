package steps;

import pages.SearchResultPage;

public class SearchResultSteps {

    private SearchResultPage searchResultPage = new SearchResultPage();

    public SearchResultSteps assertThatTopResultContainsText(String text){

        searchResultPage.assertThatTopResultContainsText(text);

        return this;
    }

    public SearchResultSteps assertThatAllResultsContainsText(String text){
        searchResultPage.assertThatAllResultsContainsText(text);

        return this;
    }


}
