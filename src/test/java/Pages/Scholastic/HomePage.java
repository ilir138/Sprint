package Pages.Scholastic;

import Drivers.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {

By createAccLocator = By.xpath("//ul/child::li[2]/a[@class='create-account-trigger']");
By nextButtonLocator = By.xpath("//p/a[@id='linkChooseAcount']");
By dropDownLocator = By.xpath("//div[@class='selected-option input-select profile-title required']");
By mrLocator = By.xpath("//li[@data-label='mr.']");
By firstNameLocator = By.xpath("//input[@id='dwfrm_profile_customer_firstname']");
By lastNameLocator = By.xpath("//input[@id='dwfrm_profile_customer_lastname']");
By emailLocator = By.xpath("//input[@id='dwfrm_profile_customer_email']");
By passwordLocator = By.xpath("//input[@id='dwfrm_profile_login_password']");
By phoneLocator = By.xpath("//input[@id='dwfrm_profile_customer_phone']");
By termsCheckBoxLocator = By.xpath("//input[@id='dwfrm_registration_termsofuseteacher']");
By confirmNextButtonLocator = By.xpath("//button[@name='dwfrm_profile_confirm']");
By homeSchoolerLocator = By.xpath("//button[@name='dwfrm_myschool_home']");
By schoolNameLocator = By.xpath("//input[@id='dwfrm_homeschool_name']");
By schoolAddressLocator = By.xpath("//input[@id='dwfrm_homeschool_streetAddress']");
By zipCodeLocator = By.xpath("//input[@id='dwfrm_homeschool_postalCode']");
By schoolPhoneLocator = By.xpath("//input[@id='dwfrm_homeschool_schoolPhone']");
By next2Button = By.xpath("//button[@name='dwfrm_homeschool_homeSchool']");
By roleLocator = By.xpath("//div[@class='selected-option input-select primaryrole required']");
By gradeTeacherLocator = By.xpath("//li[@data-label='teacher (by grade)']");
By gradeLocator = By.xpath("//div[@class='selected-option input-select noscroll']");
By multiGradeLocator = By.xpath("//li[@data-label='multi-grade']");
By next3ButtonLocator = By.xpath("//button[@name='dwfrm_myrole_findgrade']");
By studentNumberLocator = By.xpath("//input[@id='dwfrm_multigrade_eighth']");
By next4ButtonLocator = By.xpath("//button[@name='dwfrm_multigrade_nextstep']");
By readingLevelL = By.xpath("//div[@class='selected-option input-select required']");
By naLocator = By.xpath("//li[@data-label='not applicable']");
By firstYearLocator = By.xpath("//input[@id='dwfrm_profileselection_teaching__firstyear-0']");
By readingClubLocator = By.xpath("//input[@id='dwfrm_profileselection_readingclub-0']");
By enterWebLocator = By.xpath("//button[@name='dwfrm_profileselection_confirmed']");
By greetingsMsg = By.xpath("//span[@class='teacher-name-with-salutation']");

int i=0;
public void doMethod() {
        i++;

    }

public void clickCreateAcc(){
    clickThis(createAccLocator);
}
public void clickNext(){
    clickThis(nextButtonLocator);
}
public void fillRequiredFields(){
    clickThis(dropDownLocator);
    clickThis(mrLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    type(firstNameLocator,"John");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    type(lastNameLocator,"Doe");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    type(emailLocator,"tester"+i+"@gmail.com");
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
    type(phoneLocator,"9876543210");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(termsCheckBoxLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(confirmNextButtonLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(homeSchoolerLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    type(schoolNameLocator, "Technosoft");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    type(schoolAddressLocator,"20 W 34th St, New York");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    type(zipCodeLocator,"10001");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    type(schoolPhoneLocator,"9876543211");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(next2Button);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(roleLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(gradeTeacherLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(gradeLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(multiGradeLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(next3ButtonLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    type(studentNumberLocator,"9");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(next4ButtonLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(readingLevelL);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(naLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(firstYearLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    clickThis(readingClubLocator);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

  }

  public void submitForm(){
      clickThis(enterWebLocator);

  }
  public String greetings(){
   return getTextFromElement(greetingsMsg);
  }
}
