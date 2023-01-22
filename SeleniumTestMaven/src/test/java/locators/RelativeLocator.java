package locators;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RelativeLocator {
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

        driver.get("http://www.saucedemo.com/");
        WebElement password_field = driver.findElement(By.id("password"));
        driver.findElement(with(By.tagName("input")).above(password_field)).sendKeys("standard_user");

        
        WebElement username_field = driver.findElement(By.id("user-name"));
        driver.findElement(with(By.tagName("input")).below(username_field)).sendKeys("secret_sauce");
        driver.close();
    }
}
