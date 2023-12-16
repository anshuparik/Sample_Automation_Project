package SampleSeleniumProject;

import Objectrepo.Objofelementspage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.baseclass;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;

import java.net.HttpURLConnection;
import java.net.URL;

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

        }

        {  //need to fix
            List<WebElement> allurl = driver.findElements(By.tagName("p"));
            System.out.println(allurl.size());
            for (int i =0; i<allurl.size(); i++) {
                WebElement link = allurl.get(i);
                String urlname = link.getText();
                System.out.println(urlname);
                verifyLinkStatus(urlname);

            }

}              driver.quit();
    }

    private void verifyLinkStatus(String urlname) {
        try {
            URL url = new URL(urlname);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            int statusCode = connection.getResponseCode();
            System.out.println("Status Code for " + urlname + ": " + statusCode);

            connection.disconnect();

            // You can add additional logic based on the status code if needed
            if (statusCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Link is reachable.");
            } else {
                System.out.println("Link is not reachable. Check the status code.");
            }

        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + urlname);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void broken() throws IOException {
        driver = initializeDriver();
        Objofelementspage myobjofelement = new Objofelementspage(driver);
        driver.get("https://demoqa.com/broken");


        // Storing all elements with img tag in a list of WebElements
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total number of Images on the Page are " + images.size());

        //checking the links fetched.
        for(int index=0;index<images.size();index++)
        {
            WebElement image= images.get(index);
            String imageURL= image.getAttribute("src");
            System.out.println("URL of Image " + (index+1) + " is: " + imageURL);
            verifyLinks(imageURL);

            //Validate image display using JavaScript executor
            try {
                boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", image);
                if (imageDisplayed) {
                    System.out.println("DISPLAY - OK");
                }else {
                    System.out.println("DISPLAY - BROKEN");
                }
            }
            catch (Exception e) {
                System.out.println("Error Occured");
            }
        }


        driver.quit();
    }

    public static void verifyLinks(String linkUrl)
    {
        try
        {
            URL url = new URL(linkUrl);

            //Now we will be creating url connection and getting the response code
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()>=400)
            {
                System.out.println("HTTP STATUS - " + httpURLConnect.getResponseMessage() + "is a broken link");
            }

            //Fetching and Printing the response code obtained
            else{
                System.out.println("HTTP STATUS - " + httpURLConnect.getResponseMessage());
            }
        }catch (Exception ignored) {
        }
    }


}

















