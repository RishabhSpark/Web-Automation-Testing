package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
    // TODO Auto-generated method stub
    public static WebDriver driver;
    public static String browser = "Edge";
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
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        
        driver.close();

    }
    public static WebDriver getDriver() {
        return driver;
    }
    public static void setDriver(WebDriver driver) {
        Locators.driver = driver;
    }
    public static String getBrowser() {
        return browser;
    }
    public static void setBrowser(String browser) {
        Locators.browser = browser;
    }
}