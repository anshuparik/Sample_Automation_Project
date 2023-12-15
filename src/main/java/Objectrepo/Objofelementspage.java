package Objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objofelementspage {
    WebDriver driver;
    By Fullname = By.id("userName");
    By Email = By.id("userEmail");
    By Currentaddress = By.id("currentAddress");
    By PermanentAddress = By.id("permanentAddress");
    By Submit = By.id("submit");
    By homecheckbox = By.xpath("//span[@class='rct-checkbox']");
    By name = By.xpath("//p[@id='name']");

    By yes = By.xpath("//label[contains(.,'Yes')]");
    By impressive = By.xpath("//label[contains(.,'Impressive')]");
    By noradio = By.cssSelector("input[id='noRadio']");

    public Objofelementspage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement yes() {
        return driver.findElement(yes);
    }

    public WebElement impressive() {
        return driver.findElement(impressive);
    }

    public WebElement noradio() {
        return driver.findElement(noradio);
    }

    public WebElement Fullname() {
        return driver.findElement(Fullname);
    }

    public WebElement Email() {
        return driver.findElement(Email);
    }

    public WebElement Currentaddress() {
        return driver.findElement(Currentaddress);
    }

    public WebElement PermanentAddress() {
        return driver.findElement(PermanentAddress);
    }

    public WebElement Submit() {
        return driver.findElement(Submit);
    }

    public WebElement homecheckbox() {
        return driver.findElement(homecheckbox);
    }

    public WebElement name() {
        return driver.findElement(name);
    }


}
