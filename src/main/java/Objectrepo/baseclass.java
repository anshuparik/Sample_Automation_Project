package Objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class baseclass {
    //invoking driver using single method
    public WebDriver driver;
    public WebDriver initializeDriver() throws IOException {
        Properties prop = new Properties();
        FileInputStream file = new FileInputStream("A:\\Learn Automation\\Sample Automation Project\\src\\main\\java\\Objectrepo\\browserdata.properties");
        prop.load(file);
      String browserName =  prop.getProperty("browser");


if(browserName.equals("chrome")){
    //excute chrome browser
    System.setProperty("webdriver.chrome.driver","A:\\Learn Automation\\Sample Automation Project\\chromedriver.exe");
    driver = new ChromeDriver();

    } else if (browserName.equals("firefox")) {
    System.setProperty("webdriver.firefoxdriver","ddrive");
    driver = new FirefoxDriver();
    System.out.println("dummyfirefox");

} else if (browserName.equals("internetexp")) {
    System.out.println("dummyintenetexplorer");
}
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
  return driver;
}

    }
