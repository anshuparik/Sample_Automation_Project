package SampleSeleniumProject;

import Objectrepo.Objofelementspage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    @Test
    public void buttons() throws IOException {
        driver = initializeDriver();
        Objofelementspage myobjofelement = new Objofelementspage(driver);
        driver.get("https://demoqa.com/buttons");
        Actions builder = new Actions(driver);

        {
            builder.doubleClick(myobjofelement.doubleclick()).perform();
            String message = myobjofelement.doubleClickMessage().getText();
            Assert.assertEquals(message, "You have done a double click");
        }
        {
            builder.contextClick(myobjofelement.rightclick()).perform();
            String message = myobjofelement.rightClickMessage().getText();
            Assert.assertEquals(message, "You have done a right click");
        }
        {

            builder.click(myobjofelement.clickme()).perform();
            String message = myobjofelement.dynamicClickMessage().getText();
            Assert.assertEquals(message, "You have done a dynamic click");
        }

        driver.quit();
    }

    @Test
    public void links() throws IOException {
        driver = initializeDriver();
        Objofelementspage myobjofelement = new Objofelementspage(driver);
        driver.get("https://demoqa.com/links");

        { // Get the handle of the parent window
            String parentWindowHandle = driver.getWindowHandle();

            // Click on the first link ("simpleLink") which opens a new tab
            myobjofelement.Home().click();

            // Switch to the new tab
            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(parentWindowHandle)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }

            // Verify the URL of the new tab
            String url1 = driver.getCurrentUrl();
            Assert.assertEquals(url1, "https://demoqa.com/");

            // Close the new tab (optional)
            driver.close();

            // Switch back to the parent window
            driver.switchTo().window(parentWindowHandle);

            // Click on the second link ("dynamicLink") which opens another new tab
            myobjofelement.DynamicHomecheckbox().click();

            // Switch to the new tab
            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(parentWindowHandle)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }

            // Verify the URL of the second new tab
            String url2 = driver.getCurrentUrl();
            Assert.assertEquals(url2, "https://demoqa.com/");

            // Close the second new tab (optional)
            driver.close();

            // Switch back to the parent window
            driver.switchTo().window(parentWindowHandle);

            driver.quit();
        }

//        {
//            // Initialize DevTools for the existing driver
//            DevTools devtools = ((ChromeDriver) driver).getDevTools();
//            devtools.createSession();
//            devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
//
//            // EVENT will be triggered
//            devtools.addListener(Network.responseReceived(), responseReceived -> {
//                Response myresponse = responseReceived.getResponse();
//                System.out.println(myresponse.getStatus());
        //need to fix
//            });


        // Click on the link using the existing driver instance
        // myobjofelement.created().click();

        // Add any additional test logic or assertions here


    }

}

















