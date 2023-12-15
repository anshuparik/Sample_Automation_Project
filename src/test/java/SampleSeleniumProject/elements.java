package SampleSeleniumProject;

import Objectrepo.Objofelementspage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.baseclass;

import java.io.IOException;

public class elements extends baseclass {
    //Used Java inheritance concept here
    @Test
    public void Textbox() throws IOException {
        driver = initializeDriver();
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
        Assert.assertEquals(myobjofelement.name().getText(), "Name:arvind");
        driver.quit();
    }

    @Test
    public void Checkbox() throws IOException {
        driver = initializeDriver();
        Objofelementspage myobjofelement = new Objofelementspage(driver);
        driver.get("https://demoqa.com/checkbox");
        myobjofelement.homecheckbox().click();
        driver.quit();
        //we can also more cases here
    }

    @Test
    public void radio_button() throws IOException {
        driver = initializeDriver();
        Objofelementspage myobjofelement = new Objofelementspage(driver);
        driver.get("https://demoqa.com/radio-button");

        {
            boolean select = myobjofelement.yes().isSelected();
            if (!select) {
                myobjofelement.yes().click();
            }
        }

        {


            boolean select = myobjofelement.impressive().isEnabled();
            if (select) {
                myobjofelement.impressive().click();
            }

        }

        {

            boolean select = myobjofelement.noradio().isEnabled();
            if (select) {
                myobjofelement.noradio().click();
            }
        }

        driver.quit();

    }


}




