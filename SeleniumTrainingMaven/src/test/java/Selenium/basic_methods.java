package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class basic_methods {

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
        
        driver.get("http://www.saucedemo.com/");


        System.out.println(driver.manage().window().getSize());
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());


        String current_url;
        current_url = driver.getCurrentUrl();
        System.out.println(current_url);
        

        String current_title;
        current_title = driver.getTitle();
        System.out.println(current_title);
        

        String page_source;
        page_source = driver.getTitle();
        System.out.println(page_source);


        driver.navigate().to("https://www.google.com/");

        // driver.close();
        driver.quit();

    }
}