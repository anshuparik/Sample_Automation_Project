package Objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Using Page Factory Annotations
public class ObjofFormspage {
    WebDriver driver;
    @FindBy(xpath = "//input[@id='firstName']")
    WebElement firstname;
    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastname;
    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement Email;

    @FindBy(xpath = "//label[text()='Female']")
    WebElement gender;

    @FindBy(xpath = "//input[@id='userNumber']")
    WebElement mobileno;
    @FindBy(xpath = "//textarea[@placeholder='Current Address']")
    WebElement currentaddress;

    @FindBy(id = "dateOfBirthInput")
    WebElement DOB;

    @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--017']")
    WebElement date;

    @FindBy(id = "subjectsInput")
    WebElement subject;


    @FindBy(css = ".custom-checkbox:nth-child(1) > .custom-control-label")
    WebElement sports;

    @FindBy(id = "uploadPicture")
    WebElement uploadPicture;

    @FindBy(id = "state")

   // @FindBy(xpath = "(//div[@class=' css-yk16xz-control'])[1]")
    WebElement select_state;

    @FindBy(xpath = "//div[text()='Select City']")
    WebElement Select_City;

    @FindBy(id = "react-select-3-option-3")
    WebElement rajasthan;

    @FindBy(id = "react-select-4-option-0")
    WebElement jaipur;

    @FindBy(css = ".custom-checkbox:nth-child(2) > .custom-control-label")
    WebElement reading;

    @FindBy(id = "submit")
    WebElement submit;

    public ObjofFormspage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getSubmit() {
        return submit;
    }

    public WebElement getSports() {
        return sports;
    }

    public WebElement getJaipur() {
        return jaipur;
    }

    public WebElement getRajasthan() {
        return rajasthan;
    }

    public WebElement getSelect_City() {
        return Select_City;
    }

    public WebElement getSelect_state() {
        return select_state;
    }

    public WebElement getUploadPicture() {
        return uploadPicture;
    }


    public WebElement getSubject() {
        return subject;
    }


    public WebElement getReading() {
        return reading;
    }

    public WebElement getDate() {
        return date;
    }

    public WebElement getDOB() {
        return DOB;
    }

    public WebElement getEmail() {
        return Email;
    }

    public WebElement getCurrentaddress() {
        return currentaddress;
    }

    public WebElement getFirstname() {
        return firstname;
    }

    public WebElement getGender() {
        return gender;
    }

    public WebElement getLastname() {
        return lastname;
    }

    public WebElement getMobileno() {
        return mobileno;
    }
}
