package SampleSeleniumProject;

import Objectrepo.Objofelementspage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Elements {
    @Test
    public void Textbox() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        Objofelementspage myobjofelement = new Objofelementspage(driver);
        myobjofelement.Fullname().sendKeys("arvind");
        myobjofelement.Email().sendKeys("abc@gmail.com");
        myobjofelement.Currentaddress().sendKeys("mira road");
        myobjofelement.PermanentAddress().sendKeys("mumbai");
        WebElement myelement = myobjofelement.Submit();
        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", myelement);
        myobjofelement.Submit().click();
        driver.quit();
    }
    @Test
    public void Checkbox() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
        driver.quit();
    }
}
