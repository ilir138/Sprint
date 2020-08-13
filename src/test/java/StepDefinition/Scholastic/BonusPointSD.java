package StepDefinition.Scholastic;

import Pages.Scholastic.HomePage2;
import Pages.Scholastic.YTOPage;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BonusPointSD {
    HomePage2 homePage2 = new HomePage2();
    YTOPage YTOPage = new YTOPage();


    @When("^I click on BonusPoint-Qty box$")
    public void bonusPointQty(){
    YTOPage.bonusPointQty();
    }
    @When("^I verify jumper is not displayed$")
    public void verifyJumperNotDisplay(){
        Assert.assertFalse(YTOPage.verifyBonus());
    }
    @When("^I click on Price-Qty box$")
    public void priceQtyBox(){
        YTOPage.priceQty2();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @When("^I verify jumper is displayed$")
    public void verifyJumperDisplay(){
        Assert.assertTrue(YTOPage.verifyBonus());
    }

}
