package SampleSeleniumProject;

import Objectrepo.ObjofFormspage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import resources.baseclass;

import java.io.IOException;
import java.time.Duration;


public class forms extends baseclass {

    public static Logger log = LogManager.getLogger(forms.class.getName());

    @Test
    public void practice_form() throws IOException, InterruptedException {
        driver = initializeDriver();
        log.info("driver is initialized");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demoqa.com/automation-practice-form");

        log.info("moved to url");
        ObjofFormspage myelementsofFormspage = new ObjofFormspage(driver);
        {
            myelementsofFormspage.getFirstname().sendKeys("arvind");
            log.info("name created");
        }
        {
            myelementsofFormspage.getLastname().sendKeys("pareek");
            log.info("last name created");
        }
        {
            myelementsofFormspage.getEmail().sendKeys("abc@gmai.com");
            log.error("email created");
        }
        {
            js.executeScript("arguments[0].scrollIntoView();", myelementsofFormspage.getGender());
            myelementsofFormspage.getGender().click();

        }
        {
            WebElement mobileno = myelementsofFormspage.getMobileno();
            js.executeScript("arguments[0].scrollIntoView();", mobileno);
            myelementsofFormspage.getMobileno().sendKeys("1234567890");
            log.trace("mobile no created");
        }

        {
            myelementsofFormspage.getDOB().click();
            myelementsofFormspage.getDate().click();
        }

        {

            js.executeScript("arguments[0].scrollIntoView();", myelementsofFormspage.getSubject());
            myelementsofFormspage.getSubject().sendKeys("Com");
            myelementsofFormspage.getSubject().sendKeys(Keys.ARROW_DOWN);
            myelementsofFormspage.getSubject().sendKeys(Keys.ENTER);
            myelementsofFormspage.getSubject().sendKeys("Chem");
            myelementsofFormspage.getSubject().sendKeys(Keys.ARROW_DOWN);
            myelementsofFormspage.getSubject().sendKeys(Keys.ENTER);


        }
        {
            js.executeScript("arguments[0].scrollIntoView();", myelementsofFormspage.getSports());
            myelementsofFormspage.getSports().click();
            myelementsofFormspage.getReading().click();
        }
        {
            js.executeScript("arguments[0].scrollIntoView();", myelementsofFormspage.getUploadPicture());
            String filename = "C:\\Users\\Anshu Pareek\\Downloads\\sampleFile (1).jpeg";
            myelementsofFormspage.getUploadPicture().sendKeys(filename);

        }
        {
            WebElement textarea = myelementsofFormspage.getCurrentaddress();
            js.executeScript("arguments[0].scrollIntoView();", textarea);
            myelementsofFormspage.getCurrentaddress().sendKeys("java selenium");
            log.debug("text area created");
        }

        {
            js.executeScript("document.body.style.zoom='50%'");
            // js.executeScript("arguments[0].scrollIntoView();", myelementsofFormspage.getSelect_state());
            String state = "NCR";
            String city = "Delhi";
          myelementsofFormspage.getSelect_state().click();
            driver.findElement(By.xpath("//div[@id='stateCity-wrapper']//div[text()='" + state + "']")).click();
            driver.findElement(By.id("city")).click();
            driver.findElement(By.xpath("//div[@id='stateCity-wrapper']//div[text()='" + city + "']")).click();
                   /* myelementsofFormspage.getSelect_state().click();
                    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(),'Select State')]"))));
                    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#state > div"))));
                    driver.findElement(By.xpath("//div[@id='state']//div[@class='css-1g6gooi']"));
                    driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div/div/form[@id='userForm']/div[@id='stateCity-wrapper']/div/div[@id='state']/div/div/div/div[1]"));
                    myelementsofFormspage.getSelect_state().sendKeys("NCR");
                    myelementsofFormspage.getSelect_state().sendKeys(Keys.ENTER);

                    driver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
                    driver.findElement(By.xpath("//body//div[@id='app']//div[@id='city']//div//div//div[2]"));
                    driver.findElement(By.xpath("//body/div[@id='app']/div/div/div/div/div/form[@id='userForm']/div[@id='stateCity-wrapper']/div/div[@id='city']/div/div/div/div[1]"));
//                    city.sendKeys("Delhi");
//                    city.sendKeys(Keys.ENTER);*/
        }
        {
            js.executeScript("arguments[0].scrollIntoView();", myelementsofFormspage.getSubmit());
            myelementsofFormspage.getSubmit().click();
        }


    }
}


