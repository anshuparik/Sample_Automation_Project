package SampleSeleniumProject;

import Objectrepo.Objofwidgetspage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import resources.baseclass;

import java.io.IOException;
import java.util.Objects;

public class widgets extends baseclass {

    @Test

    public void accordion() throws IOException {
        driver = initializeDriver();
        Objofwidgetspage myobjofwidgetpage = new Objofwidgetspage(driver);
        driver.get("https://demoqa.com/accordian");
       // myobjofwidgetpage.getSection1().click();
        // Verify the state of the accordion after the click action
        String accordian1 = myobjofwidgetpage.getSection2().getAttribute("class");
        System.out.println(accordian1);
        if (Objects.equals(accordian1, "section1Heading")) {
            System.out.println("accordion is expanded");

        } else {
            System.out.println("accordion is collapsed");
        }

        //need to fix
    }

    @Test
    public void auto_complete() throws IOException, InterruptedException {
        driver = initializeDriver();
        Objofwidgetspage myobjofwidgetpage = new Objofwidgetspage(driver);
        driver.get("https://demoqa.com/auto-complete");
        //code for multi select
        myobjofwidgetpage.getSelectmultiple().sendKeys("Re");
        myobjofwidgetpage.getSelectmultiple().sendKeys(Keys.ENTER);
        myobjofwidgetpage.getSelectmultiple().sendKeys("b");
        myobjofwidgetpage.getSelectmultiple().sendKeys(Keys.ARROW_DOWN);
        myobjofwidgetpage.getSelectmultiple().sendKeys(Keys.ENTER);
        //code for single select
        myobjofwidgetpage.getSelectsingle().sendKeys("re");
        myobjofwidgetpage.getSelectsingle().sendKeys(Keys.ENTER);


    }

}
