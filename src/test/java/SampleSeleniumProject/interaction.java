package SampleSeleniumProject;

import Objectrepo.Objofinteractionpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import resources.baseclass;

import java.io.IOException;


public class interaction extends baseclass {

    @Test

    public void sortable() throws IOException {
        driver = initializeDriver();
        Objofinteractionpage myobjofinteractionpage = new Objofinteractionpage(driver);
        driver.get("https://demoqa.com/sortable");
        {
            Actions builder = new Actions(driver);
            builder.clickAndHold(myobjofinteractionpage.getOne()).perform();
            builder.moveToElement(myobjofinteractionpage.getFour()).perform();
            builder.release(myobjofinteractionpage.getOne());
            //need to fix
        }
        {
            //grid
            driver.findElement(By.id("demo-tab-grid")).click();
            Actions builder = new Actions(driver);
            WebElement source = driver.findElement(By.xpath("(//div[text()='One'])[2]"));
            WebElement target = driver.findElement(By.xpath("(//div[text()='Four'])[2]"));
            builder.dragAndDrop(source, target).release().perform();
            //need to fix
        }


    }

    @Test
    public void selectable() throws IOException {
        driver = initializeDriver();
        Objofinteractionpage myObjofinteractionpage = new Objofinteractionpage(driver);
        driver.get("https://demoqa.com/selectable");
        {
            myObjofinteractionpage.getCras_justo_odio().click();
            boolean isenabled = myObjofinteractionpage.getCras_justo_odio().isEnabled();
            if (isenabled) {
                System.out.println("test passed");
            } else {
                System.out.println("test failed");
            }

            myObjofinteractionpage.getDapibus_ac_facilisis_in().click();
            boolean isenabled1 = myObjofinteractionpage.getDapibus_ac_facilisis_in().isEnabled();
            if (isenabled1) {
                System.out.println("test passed");
            } else {
                System.out.println("test failed");
            }


        }

        {
            //grid
            myObjofinteractionpage.getClickongrid().click();
            myObjofinteractionpage.getClickonone().click();
            boolean enabled = myObjofinteractionpage.getClickonone().isEnabled();
            if (enabled) {
                System.out.println("test passed");
            } else {
                System.out.println("test failed");
            }

            myObjofinteractionpage.getClickonthree().click();
            boolean enabled1 = myObjofinteractionpage.getClickonthree().isEnabled();
            if (enabled1) {
                System.out.println("test passed");
            } else {
                System.out.println("test failed");
            }

        }
        driver.quit();
    }

    @Test
    public void resizable() throws IOException {
        driver = initializeDriver();
/*
     {
       //  WebElement element = driver.findElement(By.xpath("(//span[@class='react-resizable-handle react-resizable-handle-se'])[1]"));
         WebElement element3 = driver.findElement(By.xpath("//div[@id='resizable']//span[@class='react-resizable-handle react-resizable-handle-se']"));
         Actions builder = new Actions(driver);
         builder.clickAndHold(element3).moveByOffset(50,50).release().build().perform();
     }
     {
         WebElement element = driver.findElement(By.xpath("(//span[@class='react-resizable-handle react-resizable-handle-se'])[1]"));
         Actions builder = new Actions(driver);
         builder.moveToElement(element).perform();
     }
     {
         WebElement element = driver.findElement(By.xpath("(//span[@class='react-resizable-handle react-resizable-handle-se'])[1]"));
         Actions builder = new Actions(driver);
         builder.moveToElement(element).release().perform();
     }*/

        //Need to fix

    }


}
