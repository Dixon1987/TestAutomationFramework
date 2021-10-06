package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import steps.SearchSteps;
import utils.BrowserEnum;
import utils.DriverFactory;

import java.io.File;

public abstract class BaseTest {

    private static WebDriver driver;
    SearchSteps steps;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setUp() {

        driver = DriverFactory.getdriver(BrowserEnum.FIREFOX);
        driver.get("http://www.google.com");
        steps = new SearchSteps();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void back() {
        driver.navigate().back();
    }

    @DataProvider(name = "dataForSearch")
    public Object[][] dataProviderMethod() {
        return new Object[][]{{"Selenoid"}, {"Selenium webdriver"}};
    }
}
