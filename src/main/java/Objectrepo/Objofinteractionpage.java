package Objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Objofinteractionpage {
    WebDriver driver;
    @FindBy(xpath = "(//div[text()='One'])[1]")
    WebElement one;

    @FindBy(xpath = "(//div[text()='Four'])[1]")
    WebElement four;

    @FindBy(css = ".mt-2:nth-child(1)")
    WebElement Cras_justo_odio;

    @FindBy(css = ".mt-2:nth-child(1)")
    WebElement Dapibus_ac_facilisis_in;

    @FindBy(id = "demo-tab-grid")
    WebElement clickongrid;

    @FindBy(xpath = "//li[text()='One']")
    WebElement clickonone;

    @FindBy(xpath = "//li[text()='Three']")
    WebElement clickonthree;

    @FindBy(xpath = "//div[@class='constraint-area']")
    WebElement constraint_area;

    @FindBy(xpath = "(//span[@class='react-resizable-handle react-resizable-handle-se'])[1]")
    WebElement resizable_box_1;

    @FindBy(xpath = "//div[@id='resizable']")
    WebElement resizable;

    @FindBy(xpath = "(//span[@class='react-resizable-handle react-resizable-handle-se'])[2]")
    WebElement resizable_box_2;

    public Objofinteractionpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public WebElement getResizable_box_2() {
        return resizable_box_2;
    }

    public WebElement getResizable() {
        return resizable;
    }


    public WebElement getResizable_box_1() {
        return resizable_box_1;
    }

    public WebElement getConstraint_area() {
        return constraint_area;
    }

    public WebElement getClickongrid() {
        return clickongrid;
    }

    public WebElement getClickonone() {
        return clickonone;
    }

    public WebElement getClickonthree() {
        return clickonthree;
    }

    public WebElement getCras_justo_odio() {
        return Cras_justo_odio;
    }

    public WebElement getDapibus_ac_facilisis_in() {
        return Dapibus_ac_facilisis_in;
    }

    public WebElement getOne() {
        return one;
    }

    public WebElement getFour() {
        return four;
    }
}
