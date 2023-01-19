/*

FORMAT BY ID-> tagname#elementID
FORMAT BY CLASS NAME -> tagname.elementID

*/

import org.openqa.selenium.By;

public class cssselector_by_id_and_class {
    public static void main(String[] args){
        
        driver.get("https://accounts.lambdatest.com/register");
        
        driver.findElement(By.cssSelector("#name")).sendKeys("First Name "); // Copied cssSelector
        driver.findElement(By.cssSelector("input#name")).sendKeys("Second Name "); // Self written cssSelector with ID
        driver.findElement(By.cssSelector("input.w-full")).sendKeys("Third Name "); // cssSelector with class
        
        // driver.close();

    }
}
