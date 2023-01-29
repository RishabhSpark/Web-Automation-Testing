/*

DOCUMENTATION -> https://javadoc.io/doc/org.testng/testng/latest/org/testng/ITestListener.html

*/
package common;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class Listeners implements ITestListener {
    public void onTestStart(ITestListener result){
        System.out.println("Test case is starting");
    }

    public void onTestSuccess(ITestListener result){
    }
    
    public void onTestFailure(ITestListener result){
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
