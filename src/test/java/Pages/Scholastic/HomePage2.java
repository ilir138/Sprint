package Pages.Scholastic;

import Drivers.Web;
import Pages.BasePage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage2 extends BasePage {
By signInLocator = By.xpath("//ul/child::li[1]/a[@class='signin']");
By emailLocator = By.xpath("//input[@class='input-text email-input email no-mouseflow required']");
By passwordLocator = By.xpath("//input[@class='input-text password-input validatepassword no-mouseflow required']");
By signInButtonLocator = By.xpath("//button[@class='home-page-login-btn  sign-in-mod']");
By eOrdersLocator = By.xpath("(//*[@id='enter-orders'])[2]");
By yourTeacherOrderL= By.xpath("//body/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[1]/div[1]/div[1]/div[1]/ul/li[3]");
By byFlyerLocator = By.xpath("//div[@id='digimag-allfyer']/ul[1]/li[1]");
By quantityLocator = By.xpath("//input[@data-itemid='1Y1']");
By reviewCartLocator = By.xpath("//button[contains(text(), 'Review Cart')]");
By pCheckoutLocator = By.xpath("//button[@id='dwfrm_cart_checkoutCart']");
By p2CheckoutLocator = By.xpath("(//button[@name='dwfrm_cart_checkoutCart'])[2]");
By orderTotalLocator = By.xpath("//span[@id='order_total']");
By notificationCloseLocator = By.xpath("//span[@class='notification-close']");
By itemPriceLocator = By.xpath("//tr[@data-product-id='1Y1']/td[4]");
By rewardOrderLocator = By.xpath("//span[@id='rewardsTotal']");
By myAccLocator = By.xpath("//a[@class='user-account toggle-item']");
By profileLocator = By.xpath("//a[@title='Profile']");

public void login(){
    clickThis(signInLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    type(emailLocator,"tester0@gmail.com");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    type(passwordLocator,"test123+");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(signInButtonLocator);
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(notificationCloseLocator);
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
public void teacherOrder(){
    mouseHoverOnElement(eOrdersLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(yourTeacherOrderL);
}
public void flyer(){
    clickThis(byFlyerLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
public void quantity(){
/*    clearField(quantityLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }*/
    type(quantityLocator,"1");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

    public void review(){
    clickThis(reviewCartLocator);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void checkout(){
    scrollByPixel(550);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    clickThis(pCheckoutLocator);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    clickThis(p2CheckoutLocator);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String verification(){
    return getTextFromElement(rewardOrderLocator);
    }
    public String orderTotal(){
        return getTextFromElement(orderTotalLocator);
    }

    public void myProfile(){
        clickThis(myAccLocator);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(profileLocator);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

