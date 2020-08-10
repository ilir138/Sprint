package Pages.Hotels;

import Drivers.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultPage extends BasePage {
    By hotelStarRatingLocator = By.xpath("//span[@class='star-rating-text star-rating-text-strong']");
    By numStarTextLocator = By.xpath("//div[@class='additional-details resp-module']/span[1]");
    By emailLocator = By.xpath("//h3[contains(text(), 'Email')]");

    public void ratings(int no) {
        By filterStarLocator = By.xpath("//div[@id='filter-star-rating-contents']//child::ul//li[" + no + "]");

        scrollByPixel(200);

        if (no < 6 && no > 0) {
            clickThis(filterStarLocator);
        } else
            System.out.println("5 Star rating only");



    }
    public void scrollDown(){
        scrollToBottom();
    }

    public String hotelRatings(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String ratingText = getTextFromElement(numStarTextLocator);

        return ratingText;


    }
}
