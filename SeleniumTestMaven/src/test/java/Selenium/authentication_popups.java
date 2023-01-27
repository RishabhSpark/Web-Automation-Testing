/*

url -> https://the-internet.herokuapp.com/basic_auth
change it to -> https://[username]:[password]@restOfTheURL

*/

package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class authentication_popups {
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
        // driver.get("https://the-internet.herokuapp.com/basic_auth"); 
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

    }
}
