package ui;

import org.testng.annotations.Test;

@Test(groups = "User registeration")
public class TestGroups {
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