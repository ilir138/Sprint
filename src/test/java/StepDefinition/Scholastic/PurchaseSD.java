package StepDefinition.Scholastic;

import Pages.Scholastic.HomePage2;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class PurchaseSD {
    HomePage2 homePage2 = new HomePage2();

    @When("^I login$")
    public void logIn(){
        homePage2.login();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @When("^I select 'Your Teacher Order' from Enter Orders$")
    public void teacherOrder(){
        homePage2.teacherOrder();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @When("^I go to 'BY FlYER' category$")
    public void flyer(){
    homePage2.flyer();
    }
    @When("^I add quantity$")
    public void quantity(){
    homePage2.quantity();

    }
    @When("^I click on 'REVIEW CART' button$")
    public void review(){
    homePage2.review();
    }
    @When("^I proceed to checkout$")
    public void checkout(){
    homePage2.checkout();
    }
    @When("^I verify order has been placed successfully$")
    public void verification(){
    Assert.assertEquals(homePage2.verification(),homePage2.orderTotal());
    }
}
