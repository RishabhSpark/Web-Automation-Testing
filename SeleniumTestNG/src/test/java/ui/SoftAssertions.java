/*

In normal assertion, the code stops as soon as one assertion fails.
To avoid this we use SoftAssert. Here, even if one test fails, the rest will run. We usually use SoftAssert more. 

*/
package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertions {
    public static WebDriver driver;
    public static String browser = "Chrome";

    // PROBLEM WITH HARD ASSERT
    // Script stopped working as soon as one assert failed. To fix that we use SoftAssert.
    @Test
    public void hardAssertTest(){
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
        String expected_title = "Electronics, Cars, Fashion, Collectibles & More | eBaydfg";
        System.out.println("Title verification");
        Assert.assertEquals(expected_title, actual_title);
        
        
        String actual_button_value = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
        String expected_button_value = "Search";
        System.out.println("Button text vertification");
        Assert.assertEquals(actual_button_value, expected_button_value, "Wrong button text");

        driver.quit();
    }


    // SoftAssert example
    @Test
    public void softAssertTest(){
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

        SoftAssert softassert = new SoftAssert(); // Creating object of SoftAssert

        driver.get("https://www.ebay.com");
        
        String actual_title = driver.getTitle();
        String expected_title = "Electronics, Cars, Fashion, Collectibles & More | eBaydfg";
        System.out.println("Title verification");
        softassert.assertEquals(expected_title, actual_title);
        
        
        String actual_button_value = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
        String expected_button_value = "Search";
        System.out.println("Button text vertification");
        softassert.assertEquals(actual_button_value, expected_button_value, "Wrong button text");
        driver.quit();


        softassert.assertAll(); // Used for reporting errors in the script
    }
}
