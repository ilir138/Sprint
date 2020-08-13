package Pages.Scholastic;

import Drivers.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyAccPage extends BasePage {

By nameEditLocator = By.xpath("//a[@data-dlg-options='{\"dialogClass\":\"registration-flow name-section\", \"width\": 320, \"backdrop\":\"static\"}']");
By lastNameBoxLocator = By.xpath("//input[@id='dwfrm_profile_customer_lastname']");
By profileNameLocator = By.xpath("(//div[@class='text-blk'])[1]");
By headerNameLocator = By.xpath("//span[@class='user-data']");
By saveButtonLocator = By.xpath("//button[@name='dwfrm_profile_save']");
By addCCLocator = By.xpath("//a[@class='reading-club add-creditcardtoaccount']");
By cardNumberLocator = By.xpath("//div[@class='form-row newnumber cc-num required']//child::input");
By expMonthLocator = By.xpath("(//div[starts-with(@class, 'selected-option input-select exp-date ')])[1]");
By mayLocator = By.xpath("//li[@data-label='05']");
By expYearLocator = By.xpath("(//div[starts-with(@class, 'selected-option input-select exp-date ')])[2]");
By expYear24locator = By.xpath("//li[@data-label='2024']");
By securityCodeLocator = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_newcreditcard_cvn']");
By fNameLocator = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_address_firstname']");
By lNameLocator = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_address_lastname']");
By addressLocator = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_address_address1']");
By zipLocator = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_address_postal']");
By phoneLocator = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_address_phone']");
By saveButtonLocator2 = By.xpath("//button[@id='applyBtn']");
By myCardLocator = By.xpath("//div[@class='block cardlength']");
By continueCheckoutLocator = By.xpath("//button[@name='dwfrm_rewardscoupons_continueCheckout']");
By selectPaymentMethLocator = By.xpath("//div[@class='selected-option']");
By ccDropDownLocator = By.xpath("//li[@data-label='credit card']");
By cardTypeLocator = By.xpath("(//div[@class='selected-option input-select selected-active'])[2]");
By searchMainBoxLocator = By.xpath("//input[@id='q']");
By searchButtonLocator = By.xpath("//i[@class='fa fa-search']");
By myListsLocator = By.xpath("//span[contains(text(), 'My Lists')]");
By starIconLocator = By.xpath("(//div[@class='product-tile-icons']//child::i[@class='icon-a fa-tcool-star tooltipstered'])[1]");
By itemNameLocator = By.xpath("//div[@id='5e1d68d85c43f4117e13552d36']/div[2]/div[1]");
By recommendedListLocator = By.xpath("//li[@class='recommend']");
By productNameLocator = By.xpath("//div[@class='product-list-item']/div[1]");

public void updateName(){
    clickThis(nameEditLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    Web.getDriver().findElement(lastNameBoxLocator).clear();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    type(lastNameBoxLocator,"Update");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(saveButtonLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
    public String verifyAccName(){
    return getTextFromElement(profileNameLocator);
    }
    public String verifyPageHeaderName(){
    return getTextFromElement(headerNameLocator);
    }
    public void addCC(){
    clickThis(addCCLocator);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    scrollByPixel(500);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        type(cardNumberLocator,"378282246310005");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(expMonthLocator);
        clickThis(mayLocator);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(expYearLocator);
        clickThis(expYear24locator);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        type(securityCodeLocator,"4392");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        type(fNameLocator,"John");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        type(lNameLocator,"Doe");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        type(addressLocator,"20 W 34th St");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        type(zipLocator,"10001");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        type(phoneLocator,"9876543211");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(saveButtonLocator2);

    }
    public String verifyAddedCC(){
    return getTextFromElement(myCardLocator);
    }
    public void verifyDisplay(){
    clickThis(continueCheckoutLocator);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(selectPaymentMethLocator);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scrollByPixel(200);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(ccDropDownLocator);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public boolean ccType(){
    boolean isDisplayed = Web.getDriver().findElement(cardTypeLocator).isDisplayed();
    return isDisplayed;
    }
    public void searchItem(){
    type(searchMainBoxLocator,"Harry");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     clickThis(searchButtonLocator);
    }
    public void myLists(){
    clickThis(myListsLocator);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(starIconLocator);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(myListsLocator);
        clickThis(recommendedListLocator);

    }

    public String productName(){
    return getTextFromElement(productNameLocator);
    }
}
