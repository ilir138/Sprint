package StepDefinition.Darksky;

import Drivers.Web;
import Pages.DarkSky.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.Arrays;

public class TimelineSD {
    LandingPage landingPage = new LandingPage();

    @Given("^I am on Darksky home page$")
    public void launchDarkSky(){
        Web.initDriver("https://www.darksky.net");
        Web.maximizeWindow();
    }
    @When("^I verify timeline is displayed with (\\d+) hours increment$")
    public void verifyIncrement(int increment){
    Assert.assertEquals(landingPage.timeline(),landingPage.currentTime(increment));

    }
}
