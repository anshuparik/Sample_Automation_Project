package Objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objofelementspage {
WebDriver driver;
public Objofelementspage(WebDriver driver) {
    this.driver=driver;
}
    By Fullname = By.id("userName");
    By Email = By.id("userEmail");
    By Currentaddress = By.id("currentAddress");
    By PermanentAddress = By.id("permanentAddress");
    By Submit = By.id("submit");
    By homecheckbox = By.xpath("//span[@class='rct-checkbox']");

    By name = By.xpath("//p[@id='name']");


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

    public WebElement homecheckbox(){
      return  driver.findElement(homecheckbox);
    }

    public WebElement name(){
      return  driver.findElement(name);}
    }
