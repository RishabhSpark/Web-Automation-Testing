package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
    public static WebDriver driver;
    public static String browser = "Chrome";
    /**
     * @param args
     */
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
        
        // driver.findElement(By.className("form_input")).sendKeys("standard_user");
        // driver.findElement(By.cssSelector("#user-name")).sendKeys("standard-user");
        // driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // driver.findElement(By.name("user-name")).sendKeys("standard_user");
        // driver.findElement(By.tagName("input")).sendKeys("standard_user");
        // driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input")).sendKeys("standard_user");
               
        // driver.findElement(By.linkText("Overview")).click();
        driver.findElement(By.partialLinkText("Getting")).click();
        
        driver.close();
        
    }
}