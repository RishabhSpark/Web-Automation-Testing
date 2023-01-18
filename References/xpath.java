/*

**Absolute XPath**
Contains the complete path from the root element of the page to the desired element
Absolute XPath starts with a root node - Single forward slash (/)
Drawback of using absolute XPath - Any slight changes in the DOM(Document Object Model) makes the XPath invalid 

**Relative XPath**
With relative XPath, the XPath starts from the mid of the HTML DOM structure
It begins with double forward slash (//)
It is less brittle and mostly recommended
Relative XPath format -> //tagname[@attribute='value']

*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class xpath {
    public static void main(String[] args){
        driver.get("http://www.saucedemo.com/");

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("Testing"); // Relative xpath
        
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div[2]/input")).sendKeys("Testing");// Absolute xpath(Written by me)
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[2]/input")).sendKeys("Testing");// Absolute xpath(Copied from inspect element)
        
        
        // driver.close();

    }
}