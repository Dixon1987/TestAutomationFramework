package tests;


import org.testng.annotations.Test;
import pages.SearchPage;
import pages.SearchResultPage;


public class SearchTest extends BaseTest {


    @Test(dataProvider = "dataForSearch")
    public void openGoogleComInChromeTest2(String text) throws InterruptedException{
        SearchPage searchPage = new SearchPage();

        searchPage.fillSearchField(text);
        searchPage.pressEnter();

        Thread.sleep(3000);

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.assertThatTopResultContainsText("Selenium");

    }

    @Test
    public void searchSeleniumResults () throws InterruptedException{
        SearchPage searchPage = new SearchPage();

        searchPage.fillSearchField("Selenium");
        searchPage.pressEnter();

        Thread.sleep(3000);

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.assertThatAllResultsContainsText("Selenium");
    }

}
