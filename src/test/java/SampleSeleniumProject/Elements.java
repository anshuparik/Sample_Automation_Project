package SampleSeleniumProject;

import Objectrepo.Objofelementspage;
import org.testng.Assert;
import resources.baseclass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

public class Elements extends baseclass {
    //Used Java inheritance concept here
    @Test
    public void Textbox() throws IOException {
        driver=initializeDriver();
        driver.get("https://demoqa.com/text-box");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Objofelementspage myobjofelement = new Objofelementspage(driver);
        myobjofelement.Fullname().sendKeys("arvind");
        myobjofelement.Email().sendKeys("abc@gmail.com");
        myobjofelement.Currentaddress().sendKeys("mira road");
        myobjofelement.PermanentAddress().sendKeys("mumbai");
        WebElement myelement = myobjofelement.Submit();
        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", myelement);
        myobjofelement.Submit().click();
        //Validating actual vs expected text using assert method
        Assert.assertEquals(myobjofelement.name().getText(),"Name:arvind");
        driver.quit();
    }
    @Test
    public void Checkbox() throws IOException {
        driver = initializeDriver();
        Objofelementspage myobjofelement = new Objofelementspage(driver);
        driver.get("https://demoqa.com/checkbox");
        myobjofelement.homecheckbox().click();
        driver.quit();
    }
}
