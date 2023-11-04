package Objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class baseclass {
    //invoking driver using single method
    public void initializeDriver() throws IOException {
        Properties prop = new Properties();
        FileInputStream file = new FileInputStream("A:\\Learn Automation\\Sample Automation Project\\src\\main\\java\\Objectrepo\\browserdata.properties");
        prop.load(file);
      String browserName =  prop.getProperty("browser");


if(browserName=="chrome"){
    //excute chrome browser
    System.setProperty("webdriver.chrome.driver","A:\\Learn Automation\\Sample Automation Project\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    } else if (browserName.equals("firefox")) {
    System.out.println("firefox");

} else if (browserName=="internetexp") {
    System.out.println("dummy");
}

}

    }
