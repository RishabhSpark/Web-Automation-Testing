package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class xpath_functions {

    public static WebDriver driver;
    public static String browser = "Chrome";
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
        
        // driver.get("http://www.saucedemo.com/");
        // driver.findElement(By.xpath("//input[starts-with(@id,'user')]")).sendKeys("standard_user"); // starts-with function for fining Username field
        // driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("secret_sauce"); // contains function for fining Password field
        

        // driver.get("http://www.google.com/");
        // driver.findElement(By.xpath("//a[text()='Images']")).click();   // text() function for finding text "Images" in the webpage
        
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@autocorrect='off' and @type='text']")).sendKeys("standard_user"); // one AND the other
        driver.findElement(By.xpath("//input[@type='oofs what am I even doing' or @id='password']")).sendKeys("secret_sauce");  // one OR the other

        // driver.close();

    }
}