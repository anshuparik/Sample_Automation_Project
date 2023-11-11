package resources;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class baseclass {
    //invoking driver using single method
    public static WebDriver driver;

    public WebDriver initializeDriver() throws IOException {
        Properties prop = new Properties();
        FileInputStream file = new FileInputStream("A:\\Learn Automation\\Sample Automation Project\\src\\main\\java\\resources\\browserdata.properties");
        prop.load(file);
        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")) {
            //execute Chrome browser if in properties file browser is chrome
            System.setProperty("webdriver.chrome.driver", "A:\\Learn Automation\\Sample Automation Project\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.firefoxdriver", "ddrive");
            driver = new FirefoxDriver();
            System.out.println("dummyfirefox");

        } else if (browserName.equals("internetexp")) {
            System.out.println("dummyintenetexplorer");
        }
        driver.manage().window().maximize();
        return driver;
    }

    public void getScreenshot(String result) throws IOException {
        File Src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Src, new File("A://Learn Automation//myscreenshot//" + result + "photo.png"));
    }

}
