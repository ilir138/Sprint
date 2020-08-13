package StepDefinition.Scholastic;

import Pages.Scholastic.HomePage2;
import Pages.Scholastic.YTOPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class JumperSD {
    HomePage2 homePage2 = new HomePage2();
    YTOPage YTOPage = new YTOPage();

    @When("^I go to YTO page$")
    public void YTO(){
        homePage2.teacherOrder();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @When("^I go to By Flyer tab$")
    public void flyer(){
        homePage2.flyer();
    }
    @When("^I click on Price-Qty$")
    public void priceQty(){
        YTOPage.priceQty();
    }
    @When("^I verify jumper with text is displayed$")
    public void verify(){

        Assert.assertTrue(YTOPage.jumper());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @When("^I click on Price-Quantity$")
    public void priceQuantity(){
        YTOPage.priceQty2();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("^I verify jumper is NOT displayed$")
    public void verify2(){

        Assert.assertFalse(YTOPage.jumper());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
