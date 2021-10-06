package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    //WebElement searchField = driver.findElement(By.name("q"));

    //private By searchField = By.name("q");

    @FindBy(name = "q")
    private WebElement searchField;

    public SearchPage() {super();
    }

    public void fillSearchField(String text){
        searchField.click();
        searchField.sendKeys(text);

    }

    public void pressEnter(){
        searchField.sendKeys(Keys.RETURN);

    }
}
