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

    @FindBy(xpath = "//a[text()='Main Item 1']")
    WebElement mainitem1;

    @FindBy(xpath = "//a[text()='Main Item 2']")
    WebElement mainitem2;

    @FindBy(xpath = "//a[text()='SUB SUB LIST »']")
    WebElement subsublist;

    @FindBy(xpath = "//a[text()='Sub Sub Item 1']")
    WebElement subsubitem1;

    @FindBy(xpath = "//a[text()='Main Item 3']")
    WebElement mainitem3;

    @FindBy(xpath = "//div[@class=' css-1wy0on6']")
    WebElement clickondropdown1;

    @FindBy(xpath = "(//div[@class=' css-1wa3eu0-placeholder'])[1]")
    WebElement clickonselectvalue;

    @FindBy(xpath = "(//div[@class=' css-1wa3eu0-placeholder'])[1]")
    WebElement selectone;

    @FindBy(id = "oldSelectMenu")
    WebElement oldstyleselectmenu;

    @FindBy(xpath = "(//div[@class=' css-2b097c-container'])[3]")
    WebElement multiselect;

    @FindBy(id = "cars")
    WebElement Standardmultiselect;



    public Objofwidgetspage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getStandardmultiselect() {
        return Standardmultiselect;
    }

    public WebElement getMultiselect() {
        return multiselect;
    }

    public WebElement getOldstyleselectmenu() {
        return oldstyleselectmenu;
    }

    public WebElement getSelectone() {
        return selectone;
    }

    public WebElement getClickonselectvalue() {
        return clickonselectvalue;
    }

    public WebElement getClickondropdown1() {
        return clickondropdown1;
    }

    public WebElement getMainitem3() {
        return mainitem3;
    }

    public WebElement getSubsubitem1() {
        return subsubitem1;
    }

    public WebElement getSubsublist() {
        return subsublist;
    }

    public WebElement getMainitem2() {
        return mainitem2;
    }

    public WebElement getMainitem1() {
        return mainitem1;
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
