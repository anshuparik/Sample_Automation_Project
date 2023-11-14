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


    public Objofwidgetspage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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
