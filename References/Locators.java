/*
DOCUMENTATION LINK -> https://www.selenium.dev/documentation/webdriver/elements/locators/

Locator             Description
class name	        Locates elements whose class name contains the search value (compound class names are not permitted)
css selector	    Locates elements matching a CSS selector
id	                Locates elements whose ID attribute matches the search value
name	            Locates elements whose NAME attribute matches the search value
link text	        Locates anchor elements whose visible text matches the search value
partial link text	Locates anchor elements whose visible text contains the search value. If multiple elements are matching, only the first one will be selected.
tag name	        Locates elements whose tag name matches the search value
xpath	            Locates elements matching an XPath expression

*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
    // TODO Auto-generated method stub
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
        
        // driver.get("http://www.saucedemo.com/");
        driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
        
        // ALL THE LOCATORS HERE WO GO REEEEEEEEEEEEEEEEEEEEEE        
        driver.findElement(By.className("form_input")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard-user");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("user-name")).sendKeys("standard_user");        
        driver.findElement(By.tagName("input")).sendKeys("standard_user");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input")).sendKeys("standard_user");
        driver.findElement(By.linkText("Overview")).click();
        driver.findElement(By.partialLinkText("Getting")).click();
        
        driver.close();
        
    }
}