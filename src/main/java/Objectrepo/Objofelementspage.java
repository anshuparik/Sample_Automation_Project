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

    By doubleClickBtn = By.id("doubleClickBtn");

    By rightClickBtn = By.id("rightClickBtn");

    By clickbtn = By.xpath("//div[3]/button");

    By dynamicClickMessage = By.id("dynamicClickMessage");

    By rightClickMessage = By.id("rightClickMessage");

    By doubleClickMessage = By.id("doubleClickMessage");

    By clickonhome = By.id("simpleLink");

    By clickondynamichome = By.id("dynamicLink");

    By created = By.id("created");
    By No_Content = By.id("no-content");
    By Moved = By.id("moved");
    By Bad_Request = By.id("bad-request");
    By Unauthorized = By.id("unauthorized");
    By Forbidden = By.id("linkWrapper");
    By Not_Found = By.id("invalid-url");

    public Objofelementspage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement No_Content() {
        return driver.findElement(No_Content);
    }

    public WebElement Moved() {
        return driver.findElement(Moved);
    }

    public WebElement Bad_Request() {
        return driver.findElement(Bad_Request);
    }

    public WebElement Unauthorized() {
        return driver.findElement(Unauthorized);
    }

    public WebElement Forbidden() {
        return driver.findElement(Forbidden);
    }

    public WebElement Not_Found() {
        return driver.findElement(Not_Found);
    }

    public WebElement created() {
        return driver.findElement(created);
    }

    public WebElement DynamicHomecheckbox() {
        return driver.findElement(clickondynamichome);
    }

    public WebElement Home() {
        return driver.findElement(clickonhome);
    }

    public WebElement dynamicClickMessage() {
        return driver.findElement(dynamicClickMessage);
    }

    public WebElement rightClickMessage() {
        return driver.findElement(rightClickMessage);
    }

    public WebElement doubleClickMessage() {
        return driver.findElement(doubleClickMessage);
    }

    public WebElement clickme() {
        return driver.findElement(clickbtn);
    }

    public WebElement rightclick() {
        return driver.findElement(rightClickBtn);
    }

    public WebElement doubleclick() {
        return driver.findElement(doubleClickBtn);
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
