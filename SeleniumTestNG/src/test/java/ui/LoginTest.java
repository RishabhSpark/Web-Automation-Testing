/*

We don't need main(psvm) method in TestNG, we usually need class, and methods within class. And methods mostly will be test cases.

*/
package ui;

import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void loginTest(){
        System.out.println("Login is successful");
    }
}
