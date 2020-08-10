package StepDefinition.Hotels;

import Drivers.Web;
import Pages.Hotels.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ChildrenDropDownSD {
    LandingPage landingPage = new LandingPage();
    @Given("^I am on hotels landing page$")
    public void launchHotels(){
        Web.initDriver("https://www.hotels.com");
        Web.maximizeWindow();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @When("^I select (.*) in children dropdown$")
    public void selectChDrop(String value) {
        landingPage.childrenDropDown(value);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("^I see (\\d+) child age dropdowns$")
    public void dropDowns(int chCount){
        int actualCount = landingPage.listDD();

        Assert.assertEquals(actualCount,chCount,"Incorrect dropdown number");
    }

}
