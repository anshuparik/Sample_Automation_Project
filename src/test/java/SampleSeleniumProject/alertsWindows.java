package SampleSeleniumProject;

import Objectrepo.ObjofalertsWindowsPage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.baseclass;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class alertsWindows extends baseclass {
    public static Logger log = LogManager.getLogger(forms.class.getName());


    @Test
    public void browser_windows() throws IOException {
        driver = initializeDriver();
        ObjofalertsWindowsPage myelementsofbrowserwindow = new ObjofalertsWindowsPage(driver);
        log.info("driver initialized");
        driver.get("https://demoqa.com/browser-windows");
        log.info("move to url");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        myelementsofbrowserwindow.newtab().click();
        // Wait for the new tab to be present
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        //take id of all windows in set
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> its = ids.iterator(); //use iterator
        String parentid = its.next(); //as 1st id is always parent window
        String childid = its.next(); // move to child window
        driver.switchTo().window(childid); //now do operation in child window
        String childwindowtext = myelementsofbrowserwindow.msgofnewtab().getText();
        Assert.assertEquals(childwindowtext, "This is a sample page");
        driver.close();
        driver.switchTo().window(parentid);
        //code for newwindow button
        myelementsofbrowserwindow.newwindow().click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ids = driver.getWindowHandles();
        its = ids.iterator();
        parentid = its.next();
        childid = its.next();
        driver.switchTo().window(childid);
        Assert.assertEquals(childwindowtext, "This is a sample page");
        driver.close();
        driver.switchTo().window(parentid);
        //code for new window message
        //need to fix
       /* myelementsofbrowserwindow.Newwindowmessage().click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ids = driver.getWindowHandles();
        its = ids.iterator();
        parentid = its.next();
        childid = its.next();
        driver.switchTo().window(childid);
       WebElement pagetext = driver.findElement(By.xpath("//body"));
       String pg = pagetext.getText();
        Assert.assertEquals(pg,"Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");
      //  System.out.println(driver.findElement(By.xpath("//body")));
        driver.close();
        driver.switchTo().window(parentid);*/
        driver.quit();


    }

    @Test
    public void alerts() throws IOException {
        driver = initializeDriver();
        ObjofalertsWindowsPage myelementsofbrowserwindow = new ObjofalertsWindowsPage(driver);
        driver.get("https://demoqa.com/alerts");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //code for alert-button
        myelementsofbrowserwindow.getAlertbutton().click(); // Locate the button that triggers the alert
        wait.until(ExpectedConditions.alertIsPresent());
        String text = driver.switchTo().alert().getText();
        Assert.assertEquals(text, "You clicked a button");
        driver.switchTo().alert().accept();
        //code for time alert-button
        myelementsofbrowserwindow.getTimealertbutton().click();
        wait.until(ExpectedConditions.alertIsPresent());
        String text1 = driver.switchTo().alert().getText();
        Assert.assertEquals(text1, "This alert appeared after 5 seconds");
        driver.switchTo().alert().dismiss();
        //code for confirmation button
        myelementsofbrowserwindow.getConfimbutton().click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        String text3 = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
        Assert.assertEquals(text3, "You selected Ok");
        js.executeScript("arguments[0].scrollIntoView();", myelementsofbrowserwindow.getPromtbutton());
        myelementsofbrowserwindow.getPromtbutton().click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().sendKeys("arvind pareek");
        driver.switchTo().alert().accept();
        String text4 = driver.findElement(By.xpath("//span[@id='promptResult']")).getText();
        Assert.assertEquals(text4, "You entered arvind pareek");
        driver.quit();

    }

    @Test
    public void frames() throws IOException {
        driver = initializeDriver();
        ObjofalertsWindowsPage myelementsofbrowserwindow = new ObjofalertsWindowsPage(driver);
        driver.get("https://demoqa.com/frames");
        List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));//just to know no of frames not required in this test.
        System.out.println("Total number of iframes are " + iframeElements.size());
        // driver.switchTo().frame(2); //this can also we use for index of frame
        driver.switchTo().frame("frame1");
        String text = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
        Assert.assertEquals(text, "This is a sample page");
        System.out.println(text);
        driver.switchTo().defaultContent(); //move back to parent frame
        driver.switchTo().frame("frame2");
        String text2 = driver.findElement(By.id("sampleHeading")).getText();
        Assert.assertEquals(text2, "This is a sample page");
        driver.quit();

    }

    @Test
    public void nestedframes() throws IOException {
        driver = initializeDriver();
        ObjofalertsWindowsPage elementsofbrowserwindow = new ObjofalertsWindowsPage(driver);
        driver.get("https://demoqa.com/nestedframes");
        driver.switchTo().frame("frame1");
        driver.quit();
        //need to fix

    }

    @Test
    public void modal_dialogs() throws IOException, InterruptedException {
        driver = initializeDriver();
        ObjofalertsWindowsPage elementsofbrowserwindow = new ObjofalertsWindowsPage(driver);
        driver.get("https://demoqa.com/modal-dialogs");
        //code for small model
        elementsofbrowserwindow.getSmallmodal().click();
        String text = elementsofbrowserwindow.getSmallmodalbody().getText();
        Assert.assertEquals(text, "This is a small modal. It has very less content");
        elementsofbrowserwindow.getClosesmallmodal().click();
        //Code for large modal
        elementsofbrowserwindow.getLargemodal().click();
        String text1 = elementsofbrowserwindow.getLargemodalbody().getText();
        //matching only partial text
        // Assert.assertEquals(text1.contains("it to make a type specimen book"),true);
        Assert.assertTrue(text1.contains("it to make a type specimen book"));
        elementsofbrowserwindow.getCloselargemodal().click();
        driver.quit();


    }
}
