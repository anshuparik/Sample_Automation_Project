package SampleSeleniumProject;

import Objectrepo.ObjofalertsWindowsPage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.baseclass;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class alertsWindows extends baseclass {
    public static Logger log = LogManager.getLogger(forms.class.getName());

    @Test
    public void browser_windows() throws IOException {
        driver = initializeDriver();
        log.info("driver intlized");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demoqa.com/browser-windows");
        log.info("move to url");
        ObjofalertsWindowsPage myelementsofbrowserwindow = new ObjofalertsWindowsPage(driver);
        myelementsofbrowserwindow.newtab().click();
        // Wait for the new tab to be present
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        //take id of all windows in set
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> its = ids.iterator(); //use iterator
        String parentid = its.next(); //as 1st id is always parent window
        String childid = its.next(); // move to child window
        driver.switchTo().window(childid); //now do operation in child window
        String childwindowtext =  myelementsofbrowserwindow.msgofnewtab().getText();
        Assert.assertEquals(childwindowtext,"This is a sample page");
        driver.close();
        driver.switchTo().window(parentid);

    }


}
