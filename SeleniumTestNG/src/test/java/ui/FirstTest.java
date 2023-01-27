/*

DOCUMENTATION -> https://testng.org/doc/documentation-main.html
We don't need main(psvm) method in TestNG, we usually need class, and methods within class. And methods mostly will be test cases.

TestNG runs the tests in Alphabetically. To change that, we need add "priority" attribute to the testcase.

@Test
priority                The priority for this test method. Lower priorities will be scheduled first.
description	            The description for this method.
 
*/
package ui;

import org.testng.annotations.Test;

public class FirstTest {
    @Test(priority = 1, description = "This is the first test")
    public void BTest(){
        System.out.println("Test1");
    }
    
    @Test(priority = 2, description = "This is the second test")
    public void ATest(){
        System.out.println("Test2");
    }
}
