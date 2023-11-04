package SampleSeleniumProject;

import Objectrepo.ObjofFormspage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Forms {
    @Test
    public void practice_form() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://demoqa.com/automation-practice-form");
        ObjofFormspage myelementsofFormspage = new ObjofFormspage(driver);
        myelementsofFormspage.firstname().sendKeys("arvind");
        myelementsofFormspage.lastname().sendKeys("pareek");
        myelementsofFormspage.Email().sendKeys("abc@gmai.com");
        myelementsofFormspage.gender().click();
        WebElement mobileno = myelementsofFormspage.mobileno();
        js.executeScript("arguments[0].scrollIntoView();", mobileno);
        myelementsofFormspage.mobileno().sendKeys("1234567890");
        WebElement textarea = myelementsofFormspage.currentaddress();
        js.executeScript("arguments[0].scrollIntoView();",textarea);
        myelementsofFormspage.currentaddress().sendKeys("java selenium");

    }
}
