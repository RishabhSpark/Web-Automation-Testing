package ui;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report {
    @Test
    public void test1(){
        System.out.println("Test 1");
    }

    @Test
    public void test2(){
        Reporter.log("Testing");
        System.out.println("Test 2");
    }

    @Test
    public void test3(){
        System.out.println("Test 3");
    }

    @Test
    public void test4(){
        System.out.println("Test 4");
    }
}
