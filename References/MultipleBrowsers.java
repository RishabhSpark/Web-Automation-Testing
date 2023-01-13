// IMPORT MAVEN OR DRIVERS EXE FILE THINGY OR ELSE NOTHING'S GONNA WORK, YOU'LL BREAK YOUR HEART AND GIVEUP AND CRY.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MultipleBrowsers {

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
        // YOU CAN DIRECTLY USE driver NOW 
        driver.get();
        
        // driver.close();

    }
}