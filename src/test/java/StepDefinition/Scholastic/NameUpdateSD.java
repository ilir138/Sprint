package StepDefinition.Scholastic;

import Pages.Scholastic.HomePage2;
import Pages.Scholastic.MyAccPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class NameUpdateSD {
    HomePage2 homePage2 = new HomePage2();
    MyAccPage myAccPage = new MyAccPage();

    @When("^I go to My Accounts page$")
    public void myAcc(){
        homePage2.myProfile();
    }
    @When("^I update the name$")
    public void updateName(){
        myAccPage.updateName();
    }
    @When("^I verify name is updated successfully in My Accounts$")
    public void verifyAccName(){
        String expectedName = "Mr. John Update";
        Assert.assertEquals(expectedName,myAccPage.verifyAccName(),"Wrong name");
    }
    @Then("^I verify name is updated successfully in Page Header$")
    public void verifyPageHeaderName(){
        String expectedName = "Hi, Mr. Update";
        Assert.assertEquals(expectedName,myAccPage.verifyPageHeaderName(),"Wrong name");
    }
}
