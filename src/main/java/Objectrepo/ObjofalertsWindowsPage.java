package Objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjofalertsWindowsPage {
    WebDriver driver;
    @FindBy(xpath = "//button[@id='tabButton']")
    WebElement newtab;
    @FindBy(xpath = "//button[@id='windowButton']")
    WebElement newwindow;
    @FindBy(xpath = "//button[@id='messageWindowButton']")
    WebElement newwindowmessage;
    @FindBy(xpath = "//h1[@id='sampleHeading']")
    WebElement msgofnewtab;
    @FindBy(xpath = "//button[@id='alertButton']")
    WebElement alertbutton;
    @FindBy(xpath = "//button[@id='timerAlertButton']")
    WebElement timealertbutton;
    @FindBy(xpath = "//button[@id='confirmButton']")
    WebElement confimbutton;
    @FindBy(xpath = "//button[@id='promtButton']")
    WebElement promtbutton;
    @FindBy(xpath = "//button[@id='showSmallModal']")
    WebElement smallmodal;
    @FindBy(xpath = "//button[@id='closeSmallModal']")
    WebElement closesmallmodal;
    @FindBy(xpath = "//div[@class='modal-body']")
    WebElement smallmodalbody;
    @FindBy(xpath = "//button[@id='showLargeModal']")
    WebElement largemodal;
    @FindBy(xpath = "//button[@id='closeLargeModal']")
    WebElement closelargemodal;
    @FindBy(xpath = "//div[@class='modal-body']")
    WebElement largemodalbody;

    public ObjofalertsWindowsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLargemodalbody() {
        return largemodalbody;
    }

    public WebElement getCloselargemodal() {
        return closelargemodal;
    }

    public WebElement getLargemodal() {
        return largemodal;
    }

    public WebElement getSmallmodal() {
        return smallmodal;
    }

    public WebElement getClosesmallmodal() {
        return closesmallmodal;
    }

    public WebElement getSmallmodalbody() {
        return smallmodalbody;
    }


    public WebElement newtab() {
        return newtab;
    }

    public WebElement newwindow() {
        return newwindow;
    }

    public WebElement Newwindowmessage() {
        return newwindowmessage;
    }

    public WebElement msgofnewtab() {
        return msgofnewtab;
    }

    public WebElement getAlertbutton() {
        return alertbutton;
    }

    public WebElement getTimealertbutton() {
        return timealertbutton;
    }

    public WebElement getConfimbutton() {
        return confimbutton;
    }

    public WebElement getPromtbutton() {
        return promtbutton;
    }


}



