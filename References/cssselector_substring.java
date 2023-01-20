/*

Substring search type       FORMAT
Prefix(begins with)         tagname[Attributename ^= 'AttributeValue']
Suffix(ends with)           tagname[Attributename $= 'AttributeValue']
Any sub-string              tagname[Attributename *= 'AttributeValue']

*/


import org.openqa.selenium.By;


public class cssselector_substring {
    public static void main(String[] args){        
        driver.get("https://accounts.lambdatest.com/register");
        
        driver.findElement(By.cssSelector("input[placeholder^='Full']")).sendKeys("First Name "); // by prefix
        driver.findElement(By.cssSelector("input[placeholder$='Name*']")).sendKeys("Second Name "); // by suffix
        driver.findElement(By.cssSelector("input[placeholder*='ll Na']")).sendKeys("Third Name "); // by sub-string

        // driver.close();

    }
}
