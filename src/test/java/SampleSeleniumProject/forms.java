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
        log.info("driver is initialized");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://demoqa.com/automation-practice-form");
        log.info("moved to url");
        ObjofFormspage myelementsofFormspage = new ObjofFormspage(driver);
        myelementsofFormspage.firstname().sendKeys("arvind");
        log.info("name created");
        myelementsofFormspage.lastname().sendKeys("pareek");
        log.info("last name created");
        myelementsofFormspage.Email().sendKeys("abc@gmai.com");
        log.error("email created");
      //myelementsofFormspage.gender().click();
        WebElement mobileno = myelementsofFormspage.mobileno();
        js.executeScript("arguments[0].scrollIntoView();", mobileno);
        myelementsofFormspage.mobileno().sendKeys("1234567890");
        log.trace("mobile no created");
        WebElement textarea = myelementsofFormspage.currentaddress();
        js.executeScript("arguments[0].scrollIntoView();",textarea);
        myelementsofFormspage.currentaddress().sendKeys("java selenium");
        log.debug("text area created");

    }
}
