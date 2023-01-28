/*

Assertions documentation -> https://javadoc.io/doc/org.testng/testng/latest/org/testng/asserts/Assertion.html

*/
package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
    public static WebDriver driver;
    public static String browser = "Chrome";

    // We need to verify title
    @Test
    public void titleTest1(){
        if(browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        if(browser.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        if(browser.equals("Edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.get("https://www.ebay.com");
        
        String actual_title = driver.getTitle();
        String expected_title = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        Assert.assertEquals(expected_title, actual_title);
        

        driver.quit();
    }


    @Test
    public void titleTest2(){
        if(browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        if(browser.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        if(browser.equals("Edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.get("https://www.ebay.com");
        
        String actual_title = driver.getTitle();
        String expected_title = "Electronics, Cars, Fashion, Collectibles & More | eBayasdfghgfd";
        Assert.assertEquals(expected_title, actual_title);
        

        driver.quit();
    }

}
