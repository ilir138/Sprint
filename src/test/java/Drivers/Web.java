package Drivers;

import Utils.ScreenShotHelper;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
    private static WebDriver driver;

    public static void initDriver(String url){
        System.setProperty("webdriver.chrome.driver","./DriverExecFiles/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }
    public static void maximizeWindow(){
        driver.manage().window().maximize();
    }
    public static void closeDriver(){
        driver.close();
    }
    public static WebDriver getDriver(){
        return driver;
    }
    @After
    public static void quitDriver(Scenario scenario){
        if(scenario.isFailed()){
            ScreenShotHelper.takeWebScreenShot(scenario.getName());
        }
        driver.quit();
    }
}
