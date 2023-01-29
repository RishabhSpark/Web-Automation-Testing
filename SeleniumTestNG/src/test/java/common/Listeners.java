/*

DOCUMENTATION -> https://javadoc.io/doc/org.testng/testng/latest/org/testng/ITestListener.html

*/
package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;

import utilities.screenshot_utils;

public class Listeners extends screenshot_utils implements ITestListener {
    public void onTestStart(ITestListener result){
        System.out.println("Test case is starting");
    }

    public void onTestSuccess(ITestListener result){
    }
    
    public void onTestFailure(ITestListener result){
        try {
            getScreenshot();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Test failed - screenshot captured");
    }

    public void onTestSkipped(ITestListener result){

    }

    public void onTestFailedButWithinSuccessPercentage(ITestListener result){

    }

    public void onStart(ITestContext result){

    }

    public void onFinish(ITestContext result){

    }
}
