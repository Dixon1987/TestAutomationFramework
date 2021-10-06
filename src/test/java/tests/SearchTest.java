package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.SearchPage;
import pages.SearchResultPage;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchTest extends BaseTest {

//    @Test
//    public void openGoogleComInChromeTest() {
//        WebElement searchField = driver.findElement(By.name("q"));
//        searchField.clear();
//        searchField.sendKeys("Selenoid");
//        searchField.sendKeys(Keys.RETURN);
//        String resultsNumber = driver.findElement(By.id("result-stats")).getText();
//        System.out.println(resultsNumber);
//    }


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
