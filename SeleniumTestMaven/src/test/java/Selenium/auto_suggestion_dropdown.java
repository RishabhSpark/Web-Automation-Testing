package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class auto_suggestion_dropdown {

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

        driver.get("https://www.makemytrip.com");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/ul/li[4]/div[2]")).click();
        driver.findElement(By.xpath("//span[text()='From']")).click();
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Delhi");
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);

        // driver.close();
        driver.quit();

    }
}