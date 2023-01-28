package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {
    Boolean datasetup = false;
    
    // This won't even be recorded because it's disabled and not ready for execution
    @Test(enabled = false)
    public void skipTest1(){
        System.out.println("Skipping this test case as it's not complete");
    }

    // Forcefully skip
    @Test
    public void SkipTest2(){
        System.out.println("Skipping this test case forefully");
        throw new SkipException("Skipping this test case");
    }

    // Conditional skip
    @Test
    public void SkipTest3(){
        System.out.println("Skipping this test case based on condition");
        if(datasetup==true){
            System.out.println("Execute the test");
        }
        else{
            System.out.println("Do not execute further steps");
            throw new SkipException("Do not execute further steps");
        }
    }
}
