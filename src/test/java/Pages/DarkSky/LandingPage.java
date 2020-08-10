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


    public Integer[] timeline(){

        List<WebElement> time8= Web.getDriver().findElements(tLocator);

        int timer = 0;
        String t1="";
        List<Integer> list = new ArrayList<>();
        int[] last = new int[list.size()];
        int a=0;

        for (WebElement time: time8){
            if (time.getText().contains("pm") || time.getText().contains("am")) {
              t1 = time.getText();

            String timeline3 = t1.replace("am","");
            String timeline4=timeline3.replace("pm","");
             timer=Integer.parseInt(timeline4);
             list.add(timer);
           }
        }
        Integer[] tList = list.toArray(new Integer[list.size()]);
        return tList;

    }

    public int increment (){
        Integer[] timeline = timeline();
        int time = timeline[1]-timeline[0];

        return time;
    }


}
