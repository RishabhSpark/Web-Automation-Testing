package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class radiobutton {

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

        // driver.findElement(By.cssSelector("a#banner-accept")).click();
        
        System.out.println(driver.findElement(By.xpath("//input[@type='radio' and @value='Male']")).isSelected());
        driver.findElement(By.xpath("//input[@type='radio' and @value='Male']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@type='radio' and @value='Male']")).isSelected());

        List<WebElement> sex_radio = driver.findElements(By.xpath("//input[@type='radio' and @name='sex']"));
        System.out.println(sex_radio.size());

        // driver.close();
        driver.quit();

    }
}