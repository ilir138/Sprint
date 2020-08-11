package Pages.DarkSky;

import Drivers.Web;
import Pages.BasePage;
import Utils.DateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class LandingPage extends BasePage {
    By timelineLocator = By.xpath("//*[@id='timeline']//child::div[@class='hours']");
    By locator = By.xpath("//div[@class='hours']");
    By tLocator = By.xpath("//div[@class='hours']//child::span[@class='hour']");



    public List<String> timeline() {

        List<WebElement> time8 = Web.getDriver().findElements(tLocator);

        int timer = 0;
        String t1 = "";
        List<String> list = new ArrayList<>();
        String[] last = new String[list.size()];
        int a = 0;

        for (WebElement time : time8) {
            if (time.getText().contains("pm") || time.getText().contains("am")) {
                list.add(time.getText());
            }
        }
        return list;
    }
public List<String> currentTime(int t){
    List<String> timeline = new ArrayList<>();
        t=2;
       List<String> tLine = timeline();
    Date now = new Date();
    SimpleDateFormat df = new SimpleDateFormat("ha");

    Calendar c = Calendar.getInstance();
        for (int i=0 ; i< tLine.size() ; i++) {
        c.add(Calendar.HOUR, t);
        timeline.add(df.format(c.getTime()).toLowerCase());
    }
        return timeline;
}
}
