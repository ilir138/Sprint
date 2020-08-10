package StepDefinition.Scholastic;

import Drivers.Web;
import Pages.Scholastic.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TeacherAccSD {
    HomePage homePage = new HomePage();
@Given("^I am on the Homepage$")
    public void launchScholastic(){
    Web.initDriver("https://clubs3qa1.scholastic.com/home");
    Web.maximizeWindow();
}
@When("^I tap on 'Create an Account'$")
    public void clickCreatAcc(){
    homePage.clickCreateAcc();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
@When("^I click on Teacher radio button if not selected$")
    public void teacherRadioButton(){
    homePage.clickNext();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}
@When("^I fill out all required fields$")
    public void fillRequiredFields(){
    homePage.fillRequiredFields();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
@When("^I submit the form$")
    public void submitForm(){
    homePage.submitForm();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
@Then("^I verify successful creation of a user profile$")
    public void verifySuccess(){
    homePage.greetings();
    Assert.assertEquals(homePage.greetings(),"Hi, Mr. Doe","Incomplete sign up");
}
}
