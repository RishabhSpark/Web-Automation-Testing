/*

AXES            USE                                     FORMAT
self            Indicates the node itself               //tagname[@Attribute='Value']//self::tagname
parent          Indicates the parent node               //tagname[@Attribute='Value']//parent::tagname    
child           Indicates the child node                //tagname[@Attribute='Value']//child::tagname 

*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class xpath_axes {
        driver.get("https://accounts.lambdatest.com/register");
        
        driver.findElement(By.xpath("//input[@id='name']//self::input")).sendKeys("Name???"); //self axes
        driver.findElement(By.xpath("//select[@id='country_code']//child::option[@data-countrycode='AS']")).click(); //child axes
        driver.findElement(By.xpath("//option[@data-countrycode='AF']//parent::select")).click(); //parent axes
        driver.findElement(By.xpath("//select[@id='country_code']//parent::div//child::input")).sendKeys("234567825"); //parent and child axes together
        
        // driver.close();

    }
}