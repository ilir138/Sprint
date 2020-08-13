package StepDefinition.Scholastic;

import Pages.Scholastic.MyAccPage;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class RecommendedListSD {
    MyAccPage myAccPage = new MyAccPage();

    @When("^I search 'Harry' using search box$")
    public void search(){
        myAccPage.searchItem();
    }
    @When("^I click on 'star' icon$")
    public void starIcon(){
        myAccPage.myLists();


    }
    @When("^I verify item is added to recommended list$")
    public void recommendedItem(){
        Assert.assertEquals("Harry Potter and the Deathly Hallows",myAccPage.productName());
    }
}
