package steps;

import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.InchcapeHomePage;
import utils.DriverFactory;

import static org.junit.Assert.assertTrue;

public class CucumberSteps
{

    WebDriver driver = DriverFactory.driver;
    InchcapeHomePage inchcapeHomePage = PageFactory.initElements(driver, InchcapeHomePage.class);

    @Given("^I navigate to home page$")
    public void i_navigate_to(){
        driver.get("https://Google.com");
    }

    @Then("^I should see text (.*)$")
    public void i_see_a_browser_title_containing(String text){
        assertTrue(inchcapeHomePage.getHeader().contentEquals(text));
    }

}