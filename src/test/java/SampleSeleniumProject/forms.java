package SampleSeleniumProject;

import Objectrepo.ObjofFormspage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import resources.baseclass;

import java.io.IOException;

public class forms extends baseclass {

    public static Logger log = LogManager.getLogger(forms.class.getName());
    @Test
    public void practice_form() throws IOException {
        driver= initializeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://demoqa.com/automation-practice-form");
        ObjofFormspage myelementsofFormspage = new ObjofFormspage(driver);
        myelementsofFormspage.firstname().sendKeys("arvind");
        myelementsofFormspage.lastname().sendKeys("pareek");
        myelementsofFormspage.Email().sendKeys("abc@gmai.com");
      //myelementsofFormspage.gender().click();
        WebElement mobileno = myelementsofFormspage.mobileno();
        js.executeScript("arguments[0].scrollIntoView();", mobileno);
        myelementsofFormspage.mobileno().sendKeys("1234567890");
        WebElement textarea = myelementsofFormspage.currentaddress();
        js.executeScript("arguments[0].scrollIntoView();",textarea);
        myelementsofFormspage.currentaddress().sendKeys("java selenium");

    }
}
