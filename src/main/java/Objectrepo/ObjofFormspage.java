package Objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Using Page Factory Annotations
public class ObjofFormspage {
    WebDriver driver;

    public ObjofFormspage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement firstname;
    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastname;
    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement Email;
    @FindBy(xpath = "label[@for='gender-radio-1']")
    WebElement gender;
    @FindBy(xpath = "//input[@id='userNumber']")
    WebElement mobileno;
    @FindBy(xpath = "//textarea[@placeholder='Current Address']")
    WebElement currentaddress;

    public WebElement firstname() {
        return firstname;
    }

    public WebElement lastname() {
        return lastname;
    }

    public WebElement Email() {
        return Email;
    }

    public WebElement gender() {
        return gender;
    }

    public WebElement mobileno() {
        return mobileno;
    }

    public WebElement currentaddress() {
        return currentaddress;
    }
}
