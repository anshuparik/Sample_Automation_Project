package SampleSeleniumProject;

import org.testng.ITestListener;
import org.testng.ITestResult;
import resources.baseclass;

import java.io.IOException;

public class listeners implements ITestListener {

    baseclass mybase = new baseclass();

    public void onTestFailure(ITestResult result) {
        try {
            mybase.getScreenshot(result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
