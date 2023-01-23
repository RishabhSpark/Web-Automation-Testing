package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class checkboxes {

    public static WebDriver driver;
    public static String browser = "Chrome";
    public static void main(String[] args) throws InterruptedException{
        if(browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        else if(browser.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        else if(browser.equals("Edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        driver.manage().window().maximize();


        driver.findElement(By.cssSelector("a#banner-accept")).click();


        // FINDING ALL CHECKBOXES
        List<WebElement> all_checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(all_checkboxes.size());
        
        //SCROLLING DOWN TO A PARTICULAR ELEMENT
        // WebElement button = driver.findElement(By.xpath("//button[@name = 'submit']"));
        // new Actions(driver).scrollToElement(button).perform();


        // SELECTING A CHECKBOX
        WebElement rc_checkbox = driver.findElement(By.xpath("//input[@value='RC']"));
        rc_checkbox.click();
        Thread.sleep(1000);
        rc_checkbox.click();

        // driver.close();
        driver.quit();

    }
}