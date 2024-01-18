package Objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Objofbookstoreaplication {
    WebDriver driver;

    @FindBy(id = "login")
    WebElement login;

    @FindBy(id = "password")
    WebElement Password;

    @FindBy(id = "userName")
    WebElement Username;

    public Objofbookstoreaplication(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLogin() {
        return login;
    }

    public WebElement getPassword() {
        return Password;
    }

    public WebElement getUsername() {
        return Username;
    }
}
