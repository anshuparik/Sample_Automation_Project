package SampleSeleniumProject;

import Objectrepo.Objofwidgetspage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.baseclass;

import java.io.IOException;
import java.util.List;
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
        driver.quit();

        //need to fix
    }

    @Test
    public void auto_complete() throws IOException {
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
        driver.quit();


    }

    @Test
    public void slider() throws IOException {
        driver = initializeDriver();
        Objofwidgetspage myobjofwidgetpage = new Objofwidgetspage(driver);
        driver.get("https://demoqa.com/slider");
        //Use the ActionChains class to move the slider
        myobjofwidgetpage.getSlider().click();
        Actions SliderAction = new Actions(driver);
        SliderAction.dragAndDropBy(myobjofwidgetpage.getSlider(), 70, 0).release().perform();
        //SliderAction.clickAndHold(myobjofwidgetpage.getSlider()).moveByOffset(70, 0).release().perform();
        String text = driver.findElement(By.xpath("//input[@id='sliderValue']")).getAttribute("value");
        Assert.assertEquals(text, "66");
        driver.quit();

    }

    @Test
    public void progress_bar() throws IOException, InterruptedException {
        driver = initializeDriver();
        Objofwidgetspage myobjofwidgetpage = new Objofwidgetspage(driver);
        driver.get("https://demoqa.com/progress-bar");
        myobjofwidgetpage.getStartnstop().click();
        Thread.sleep(2000);
        myobjofwidgetpage.getStartnstop().click();
        String text = driver.findElement(By.xpath("//div[@role='progressbar']")).getAttribute("aria-valuenow");
        Assert.assertEquals(text, "21");
        driver.quit();
    }

    @Test
    public void tabs() throws IOException {
        driver = initializeDriver();
        driver.get("https://demoqa.com/tabs");
        Objofwidgetspage myobjofwidgetpage = new Objofwidgetspage(driver);
        myobjofwidgetpage.getWhat().click();
        String text = driver.findElement(By.xpath("//p[@class='mt-3']")).getText();
        Assert.assertTrue(text.contains("nly five centuries"));
        myobjofwidgetpage.getUse().click();
        driver.quit();
        //need to fix

    }

    @Test
    public void tool_tips() throws IOException, InterruptedException {
        driver = initializeDriver();
        driver.get("https://demoqa.com/tool-tips");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Objofwidgetspage myobjofwidgetpage = new Objofwidgetspage(driver);
        Actions actions = new Actions(driver);

        actions.moveToElement(myobjofwidgetpage.getTooltipbutton()).perform();
        String text = myobjofwidgetpage.getTooltipbutton().getText();
        Assert.assertEquals(text, "Hover me to see");
        Thread.sleep(3000);
        actions.moveToElement(myobjofwidgetpage.getTooltiptext()).perform(); //need to fix(validation)
        Thread.sleep(2000);


        js.executeScript("arguments[0].scrollIntoView();", myobjofwidgetpage.getContrary());
        actions.moveToElement(myobjofwidgetpage.getContrary());
        Assert.assertEquals(myobjofwidgetpage.getContrary().getText(), "Contrary");

        js.executeScript("arguments[0].scrollIntoView();", myobjofwidgetpage.getTooltipofnumbers());
        actions.moveToElement(myobjofwidgetpage.getTooltipofnumbers());
        Assert.assertEquals(myobjofwidgetpage.getTooltipofnumbers().getText(), "1.10.32");
        driver.quit();

    }

    @Test
    public void menu() throws IOException, InterruptedException {

        driver = initializeDriver();
        driver.get("https://demoqa.com/menu#");
        Objofwidgetspage myobjofwidgetpage = new Objofwidgetspage(driver);
        //code for main item1
        myobjofwidgetpage.getMainitem1().click();
        Actions actions = new Actions(driver);
        //code for main item2
        actions.moveToElement(myobjofwidgetpage.getMainitem2()).click().perform();
        Thread.sleep(2000);
        myobjofwidgetpage.getMainitem2().sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        myobjofwidgetpage.getMainitem2().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        actions.moveToElement(myobjofwidgetpage.getMainitem2()).click().perform();
        // actions.moveToElement(myobjofwidgetpage.getSubsublist()).click().perform();
        Thread.sleep(2000);
        actions.moveToElement(myobjofwidgetpage.getSubsublist()).click().perform();
        actions.moveToElement(myobjofwidgetpage.getSubsubitem1()).click().perform();
        myobjofwidgetpage.getSubsubitem1().sendKeys(Keys.ARROW_DOWN);
        //code for mainitem 3
        myobjofwidgetpage.getMainitem3().click();
        driver.quit();

    }

    @Test
    public void select_menu() throws IOException, InterruptedException {
        driver = initializeDriver();
        driver.get("https://demoqa.com/select-menu");
        Objofwidgetspage myobjofwidgetpage = new Objofwidgetspage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
      //  myobjofwidgetpage.getClickondropdown1().click();
      //  myobjofwidgetpage.getClickonselectvalue().click();
      //  Select myselect = new Select(myobjofwidgetpage.getClickonselectvalue());
      //  List<WebElement> options = myselect.getOptions();
      //  System.out.println(options);
       // myselect.selectByVisibleText("Group 2, option 1");
       // myobjofwidgetpage.getClickonselectvalue().sendKeys(Keys.ENTER);
       // driver.findElement(By.id("react-select-2-option-2")).click();
        //Thread.sleep(3000);
       // myobjofwidgetpage.getClickonselectvalue().sendKeys("Group 2, option 1");
       // myobjofwidgetpage.getClickonselectvalue().sendKeys(Keys.ENTER);
      //  myobjofwidgetpage.getSelectone().click();
       // myobjofwidgetpage.getSelectone().sendKeys("ms");
       // myobjofwidgetpage.getSelectone().sendKeys(Keys.ENTER);
        js.executeScript("arguments[0].scrollIntoView();", myobjofwidgetpage.getOldstyleselectmenu());
        myobjofwidgetpage.getOldstyleselectmenu().click();
        Select myselect = new Select(myobjofwidgetpage.getOldstyleselectmenu());
        myselect.selectByVisibleText("Aqua");
        myobjofwidgetpage.getOldstyleselectmenu().click();
       // Thread.sleep(2000);
        /*js.executeScript("arguments[0].scrollIntoView();",myobjofwidgetpage.getMultiselect());
        myobjofwidgetpage.getMultiselect().click();
        myobjofwidgetpage.getMultiselect().sendKeys("Re");
        myobjofwidgetpage.getMultiselect().sendKeys(Keys.ENTER);
       // Select myselect1 = new Select(myobjofwidgetpage.getMultiselect());
        //myselect1.selectByVisibleText("Red");*/
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView();",myobjofwidgetpage.getStandardmultiselect());
        Select myselect2 = new Select(myobjofwidgetpage.getStandardmultiselect());
        myselect2.selectByIndex(1);
        myselect2.selectByIndex(2);
        myselect2.deselectAll();
        myselect2.selectByVisibleText("Audi");
        myselect2.deselectByVisibleText("Audi");




    }
}
