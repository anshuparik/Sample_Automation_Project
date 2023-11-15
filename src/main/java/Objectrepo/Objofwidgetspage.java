package Objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Objofwidgetspage {

    WebDriver driver;
    @FindBy(xpath = "//div[@id='section1Heading']")
    WebElement section1;

    @FindBy(xpath = "//div[@id='section2Heading']")
    WebElement section2;

    @FindBy(xpath = "//div[@id='section3Heading']")
    WebElement section3;

    @FindBy(id = "autoCompleteMultipleInput")
    WebElement selectmultiple;

    @FindBy(id = "autoCompleteSingleInput")
    WebElement selectsingle;

    @FindBy(xpath = "//input[@type='range']")
    WebElement slider;

    @FindBy(xpath = "//button[@id='startStopButton']")
    WebElement startnstop;

    @FindBy(xpath = "//a[@id='demo-tab-what']")
    WebElement what;

    @FindBy(xpath = "//a[@id='demo-tab-origin']")
    WebElement origin;

    @FindBy(xpath = "//a[@id='demo-tab-use']")
    WebElement use;

    @FindBy(xpath = "//button[@id='toolTipButton']")
    WebElement tooltipbutton;

    @FindBy(xpath = "//input[@placeholder='Hover me to see']")
    WebElement tooltiptext;

    @FindBy(xpath = "//a[text()='Contrary']")
    WebElement contrary;

    @FindBy(xpath = "//a[text()='1.10.32']")
    WebElement tooltipofnumbers;

    public Objofwidgetspage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTooltipofnumbers() {
        return tooltipofnumbers;
    }

    public WebElement getContrary() {
        return contrary;
    }

    public WebElement getTooltiptext() {
        return tooltiptext;
    }

    public WebElement getTooltipbutton() {
        return tooltipbutton;
    }

    public WebElement getStartnstop() {
        return startnstop;
    }

    public WebElement getOrigin() {
        return origin;
    }

    public WebElement getUse() {
        return use;
    }

    public WebElement getWhat() {
        return what;
    }

    public WebElement getSlider() {
        return slider;
    }

    public WebElement getSelectsingle() {
        return selectsingle;
    }

    public WebElement getSelectmultiple() {
        return selectmultiple;
    }

    public WebElement getSection3() {
        return section3;
    }

    public WebElement getSection2() {
        return section2;
    }

    public WebElement getSection1() {
        return section1;
    }
}
