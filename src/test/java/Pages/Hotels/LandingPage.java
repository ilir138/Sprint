package Pages.Hotels;

import Drivers.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LandingPage extends BasePage {
    By childrenDropDownLocator = By.xpath("//select[@id='qf-0q-room-0-children']");
    By searchButtonLocator = By.xpath("//button[@type='submit']");
    By searchBoxLocator = By.id("qf-0q-destination");
    By autoSuggestionsLocator = By.xpath("//div[@class='autosuggest-category-result']");

    public void childrenDropDown(String value){
        WebElement chDropDown = Web.getDriver().findElement(childrenDropDownLocator);
        Select chDrop = new Select (chDropDown);
        chDrop.selectByValue(value);
    }
    public int listDD (){
        List<WebElement>dDowns=Web.getDriver().findElements(By.xpath("//select[@data-os-child-age]"));
        return dDowns.size();
    }

    public void enterDestination(){
        type(searchBoxLocator,"new");
    }

    public void selectDestination (){
        selectFromAutoSuggestion(autoSuggestionsLocator, "New York, New York, United States of America");
    }

    public void clickSearchButton(){
        clickThis(searchButtonLocator);
    }
}
