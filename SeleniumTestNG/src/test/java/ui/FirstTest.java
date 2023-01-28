/*

DOCUMENTATION -> https://testng.org/doc/documentation-main.html
We don't need main(psvm) method in TestNG, we usually need class, and methods within class. And methods mostly will be test cases.

TestNG runs the tests in Alphabetically. To change that, we need add "priority" attribute to the testcase.

@Test                   Marks a class or a method as part of the test.
priority                The priority for this test method. Lower priorities will be scheduled first.
description	            The description for this method.


@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.

@BeforeMethod: The annotated method will be run before each test method.
@AfterMethod: The annotated method will be run after each test method.


*/
package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
    @BeforeTest
    public void beforeTest(){
        System.out.println("Runs before all tests");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Runs after all tests");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Runs before each test");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Runs after each test");
    }

    @Test(priority = 1, description = "This is the first test")
    public void BTest(){
        System.out.println("Test1");
    }
    
    @Test(priority = 2, description = "This is the second test")
    public void ATest(){
        System.out.println("Test2");
    }
}
