/*

Prefix(begins with) -> tagname[Attributename ^= 'AttributeValue']
Suffix(ends with) -> tagname[Attributename $= 'AttributeValue']
Any sub-string -> tagname[Attributename *= 'AttributeValue']

*/

package CSSselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class cssselector_substring {

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
        
        driver.findElement(By.cssSelector("input[placeholder^='Full']")).sendKeys("First Name "); // by prefix
        driver.findElement(By.cssSelector("input[placeholder$='Name*']")).sendKeys("Second Name "); // by suffix
        driver.findElement(By.cssSelector("input[placeholder*='ll Na']")).sendKeys("Third Name "); // by sub-string

        // driver.close();

    }
}
