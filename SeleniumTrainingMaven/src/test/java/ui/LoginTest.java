package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest {

    public static WebDriver driver;
    public static String browser = "Edge";
    public static void main(String[] args){
        if(browser == "Chrome"){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        else if(browser =="Firefox"){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        else if(browser =="Edge"){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        
        driver.get("http://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
        
        driver.close();

    }
}