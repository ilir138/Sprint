package Pages.Scholastic;

import Drivers.Web;
import Pages.BasePage;
import org.openqa.selenium.By;

public class YTOPage extends BasePage {
    HomePage2 homePage2 = new HomePage2();

    By itemQuantityLocator = By.xpath("//input[@data-itemid='3Y1']");
    By item2QuantityLocator = By.xpath("//input[@data-itemid='4Y1']");
    By jumperLocator = By.xpath("//div[@class='info-modal-content']");
    By bonusPointQtyLocator = By.xpath("//tbody/tr[1]/td[7]/input");




    public void priceQty(){
        scrollByPixel(300);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(itemQuantityLocator);
    }
    public boolean jumper(){
        boolean isJumperDisplayed = Web.getDriver().findElement(jumperLocator).isDisplayed();
    return isJumperDisplayed;
    }
    public void priceQty2(){
        clickThis(item2QuantityLocator);
    }

    public void bonusPointQty(){
        scrollByPixel(300);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(bonusPointQtyLocator);
    }
    public boolean verifyBonus(){
        boolean isJumperDisplayed = Web.getDriver().findElement(jumperLocator).isDisplayed();
       return isJumperDisplayed;
    }
}
