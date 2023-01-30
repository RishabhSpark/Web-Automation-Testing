/*

DOCUMENTATION -> https://javadoc.io/doc/org.testng/testng/latest/org/testng/ITestListener.html

*/
package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.screenshot_utils;

public class Listeners extends screenshot_utils implements ITestListener {
    public void onTestStart(ITestResult result){
        // System.out.println("Test case is starting");
        Reporter.log("Method name is - " + result.getName());
    }

    public void onTestSuccess(ITestResult result){
        Reporter.log("Status is - " + result.getStatus());
    }
    
    public void onTestFailure(ITestResult result){
        try {
            getScreenshot();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.setProperty("org.uncommons.reporting.escape-output", "false");
        Reporter.log("<a href=/"SeleniumTestNG/src/test/screenshots"> Test Results</a>");
    }

    public void onTestSkipped(ITestResult result){

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result){

    }

    public void onStart(ITestContext result){

    }

    public void onFinish(ITestContext result){

    }
}
