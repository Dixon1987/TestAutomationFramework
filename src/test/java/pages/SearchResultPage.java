package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertTrue;

public class SearchResultPage extends BasePage {

    private By firstResult = By.xpath(".//h3[@class='LC20lb DKV0Md']");
    private By allResults = By.xpath(".//h3[@class='LC20lb DKV0Md']");

    public SearchResultPage() {
        super();
    }

    public void assertThatTopResultContainsText(String expectedResult) {
        WebElement firstResultElement = driver.findElement(firstResult);
        assertThat(firstResultElement.getText()).as("Wrong text!").containsIgnoringCase(expectedResult);
    }

    public void assertThatAllResultsContainsText(String expectedResult) {
        List<WebElement> elements = driver.findElements(allResults);
        boolean isContain = false;
        for(int i=0; i<elements.size(); i++) {
            if(elements.get(i).getText().contains(expectedResult)) {
                isContain = true;
            }
            else {
                isContain = false;
                System.out.println("Test Failed");
                break;
            }
        }

        assertTrue(isContain, "Not all items contain expected value");
        if(isContain) {
            System.out.println("Test Passed");
        }
    }

}