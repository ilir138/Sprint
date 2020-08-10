package StepDefinition.Scholastic;

import Pages.Scholastic.HomePage2;
import cucumber.api.java.en.When;

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
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
   /* @When("^I go to 'BY FlYER' category$")
    public void flyer(){

    }*/
}
