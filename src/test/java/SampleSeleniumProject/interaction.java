package SampleSeleniumProject;

import Objectrepo.Objofinteractionpage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
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
        Objofinteractionpage myObjofinteractionpage = new Objofinteractionpage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions builder = new Actions(driver);
        driver.get("https://demoqa.com/resizable");
        {
            // Resizable_box
            js.executeScript("arguments[0].scrollIntoView();", myObjofinteractionpage.getConstraint_area());
            builder.dragAndDropBy(myObjofinteractionpage.getResizable_box_1(), 500, 300).perform();
            builder.dragAndDropBy(myObjofinteractionpage.getResizable_box_1(), 150, 150).perform();
        }
        {
            //resizable
            js.executeScript("arguments[0].scrollIntoView();", myObjofinteractionpage.getResizable());
            builder.dragAndDropBy(myObjofinteractionpage.getResizable_box_2(), 728, 186).perform();
            builder.dragAndDropBy(myObjofinteractionpage.getResizable_box_2(), 50, 50).perform();

        }

        driver.quit();

    }

    @Test
    public void droppable() throws IOException {
        driver = initializeDriver();
        driver.get("https://demoqa.com/droppable");
        Objofinteractionpage myObjofinteractionpage = new Objofinteractionpage(driver);
        Actions builder = new Actions(driver);

       {
            //simple
            builder.dragAndDrop(myObjofinteractionpage.getDraggable(), myObjofinteractionpage.getDroppable_1()).perform();
         String text =   myObjofinteractionpage.getDroppable_1().getText();
            Assert.assertEquals("Dropped!",text);

        }

        {
            //accept
            myObjofinteractionpage.getClickonaccept().click();
            builder.dragAndDrop(myObjofinteractionpage.getNotAcceptable(), myObjofinteractionpage.getDroppable_2()).perform();
            //obtain color in rgb
            String color_1 = myObjofinteractionpage.getDroppable_2().getCssValue("color");
            String text_1 = myObjofinteractionpage.getDroppable_2().getText();
            Assert.assertEquals(color_1, "rgba(33, 37, 41, 1)");
            Assert.assertEquals(text_1, "Drop here");
            builder.dragAndDrop(myObjofinteractionpage.getAcceptable(), myObjofinteractionpage.getDroppable_2()).perform();
            String color_2 = myObjofinteractionpage.getDroppable_2().getCssValue("background-color");
            String text_2 = myObjofinteractionpage.getDroppable_2().getText();
            Assert.assertEquals(color_2, "rgba(70, 130, 180, 1)");
            Assert.assertEquals(text_2, "Dropped!");

        }

        {
            //prevent Propogation
            myObjofinteractionpage.getPreventPropogation().click();
            //need to fix


        }

    }


}
