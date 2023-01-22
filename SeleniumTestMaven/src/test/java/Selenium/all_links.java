package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class all_links {

    public static WebDriver driver;
    public static String browser = "Chrome";
    public static void main(String[] args){
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

        driver.get("https://accounts.lambdatest.com/register");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        
        for(int i=0; i<links.size(); i++){
            System.out.println(links.get(i).getAttribute("href"));
            System.out.println(links.get(i).getText()+"\n");
        }


        // driver.close();
        driver.quit();

    }
}