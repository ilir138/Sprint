package StepDefinition.Scholastic;

import Pages.Scholastic.HomePage2;
import Pages.Scholastic.MyAccPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CreditCardSD {
    MyAccPage myAccPage = new MyAccPage();
    HomePage2 homePage2 = new HomePage2();

    @When("^I add credit card$")
    public void addCC(){
        myAccPage.addCC();
    }
    @When("^I verify credit card is added successfully in My Accounts$")
    public void verifyMyCC(){
        String expectedText = "Amex Ending In 0005";
        Assert.assertEquals(expectedText,myAccPage.verifyAddedCC(),"Credit card not added successfully");
    }
    @Then("^I verify added card is displayed when shopping using credit card$")
    public void verifyCCisDisplayed(){
    homePage2.teacherOrder();
    homePage2.quantity();
    homePage2.review();
    homePage2.checkout();
    myAccPage.verifyDisplay();

    Assert.assertTrue(myAccPage.ccType());
    }

}
