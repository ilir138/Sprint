package StepDefinition.Hotels;

import Drivers.Web;
import Pages.Hotels.LandingPage;
import Pages.Hotels.ResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class StarRatingSD {
    LandingPage landingPage = new LandingPage();
    ResultPage resultPage = new ResultPage();

    @Given("I am on default locations search result screen$")
    public void launchResultPage(){
        Web.initDriver("https://www.hotels.com");
        Web.maximizeWindow();

        landingPage.enterDestination();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        landingPage.selectDestination();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        landingPage.clickSearchButton();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @When("^I click on (\\d+) star$")
    public void star(int star){

    resultPage.ratings(star);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("^I verify hotels are (\\d+) star rating$")
    public void verify(int starR){
        resultPage.scrollDown();

        String f = resultPage.hotelRatings();
       String fd = f.replace("-star"," ").trim();
       String fd2 = fd.replace(".5","");
       int actualResult = Integer.parseInt(fd2);


        Assert.assertEquals(actualResult,starR,"Not a "+starR+" star hotel");
    }
}
