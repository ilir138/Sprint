package Pages.Scholastic;

import Drivers.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage2 extends BasePage {
By signInLocator = By.xpath("//ul/child::li[1]/a[@class='signin']");
By emailLocator = By.xpath("//input[@class='input-text email-input email no-mouseflow required']");
By passwordLocator = By.xpath("//input[@class='input-text password-input validatepassword no-mouseflow required']");
By signInButtonLocator = By.xpath("//button[@class='home-page-login-btn  sign-in-mod']");
By eOrdersLocator = By.xpath("//body/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[1]/a");
By yourTeacherOrderL= By.xpath("//body/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul/li[1]/div[1]/div[1]/div[1]/ul/li[3]");

    public void scrollByPixel(int x, int y){
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("scrollBy("+x+","+y+")");
    }


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
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}
public void teacherOrder(){
    mouseHoverOnElement(eOrdersLocator);
    try {
        Thread.sleep(7000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(yourTeacherOrderL);
}
public void flyer(){

}

}

