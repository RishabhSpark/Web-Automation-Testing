/*

@BeforeGroups   The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.
@AfterGroups    The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.
@BeforeClass    The annotated method will be run before the first test method in the current class is invoked.
@AfterClass     The annotated method will be run after all the test methods in the current class have been run.

*/


package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import common.CommonDataSetup;

public class Class_Group_Annotations extends CommonDataSetup {
    // Runs before the each class
    @BeforeClass
    public void beforeClass(){
        System.out.println("Runs before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Runs after class");
    }

    @BeforeGroups(value="FirstGroup")
    public void beforeGroups(){
        System.out.println("Runs before FirstGroup");
    }

    @AfterGroups(value="SecondGroup")
    public void afterGroups(){
        System.out.println("Runs after SecondGroup");
    }

    @Test(priority = 1, groups = "FirstGroup")
    public void ATest(){
        System.out.println("Test1");
    }
    
    @Test(priority = 2, groups = "FirstGroup")
    public void BTest(){
        System.out.println("Test2");
    }
    
    @Test(priority = 3, groups = {"FirstGroup", "SecondGroup"})
    public void CTest(){
        System.out.println("Test3");
    }
    
    @Test(priority = 4, groups = "SecondGroup")
    public void DTest(){
        System.out.println("Test4");
    }
}
