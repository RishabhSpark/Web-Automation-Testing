/*

FORMAT BY ATTRIBUTE -> tagname[AttributeName = 'AttributeValue']
FORMAT BY MIX OF ID AND ATTRIBUTE -> tagname#IDvalue[AttributeName = 'AttributeValue']
FORMAT BY MIX OF CLASS AND ATTRIBUTE -> tagname.classValue[AttributeName = 'AttributeValue']
FORMAT BY MULTIPLE ATTRIBUTES ONLY -> tagname[Attribute1Name = 'Attribute1Value'][Attribute2name = 'Attribute2Value']

We can also use a combination of id and class and multiple attributes together, or in any order anything you get it, right?

*/

package CSSselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class cssselector_multiple_attributes {

    public static WebDriver driver;
    public static String browser = "Chrome";
    public static void main(String[] args){
        if(browser == "Chrome"){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        else if(browser == "Firefox"){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        else if(browser == "Edge"){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        
        driver.get("https://accounts.lambdatest.com/register");
        
        driver.findElement(By.cssSelector("input[id='name']")).sendKeys("First Name "); // by attribute
        driver.findElement(By.cssSelector("input#name[type='text']")).sendKeys("Second Name "); // mix of id and attribute
        driver.findElement(By.cssSelector("input.w-full[placeholder = 'Business Email*']")).sendKeys("email@test.com"); // mix of class and attribute
        driver.findElement(By.cssSelector("input[name='password'][type='password']")).sendKeys("Password"); // multiple attributes
        driver.findElement(By.cssSelector("input.w-full#phone")).sendKeys("23456765432"); // mix of id and class

        // driver.close();

    }
}
