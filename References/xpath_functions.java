/*

FUNCTION NAME       FORMAT
starts-with         //tagname[starts-with(@Attribute, 'Value')]
contains            //tagname[contains-(@Attribute, 'Value')]
text()              //tagname[text()='ActualText']
and                 //tagname[@Attribute='Value' and @Attribute='Value']
or                  //tagname[@Attribute='Value' or @Attribute='Value']

*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class xpath_functions {
        driver.get("http://www.saucedemo.com/");

        driver.findElement(By.xpath("//input[starts-with(@id,'user')]")).sendKeys("Testing"); // starts-with function for fining Username
        driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("secret_sauce"); // contains function for fining Password field



        driver.get("http://www.google.com/");
        driver.findElement(By.xpath("//a[text()='Images']")).click();   // text() function for finding text "Images" in the webpage
        
        
        driver.get("http://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@autocorrect='off' and @type='text']")).sendKeys("standard_user"); // one AND the other
        driver.findElement(By.xpath("//input[@type='oofs what am I even doing' or @id='password']")).sendKeys("secret_sauce");  // one OR the other

        

        // driver.close();

    }
}