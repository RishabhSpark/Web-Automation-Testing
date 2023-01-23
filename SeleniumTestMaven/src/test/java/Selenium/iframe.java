/*

switchTo() frame by index ->  driver.switchTo().frame(index);
Frame's index starts from 0

switchTo() frame by name or id ->  driver.switchTo().frame(nameOrId);

switchTo() frame by WebElement ->  driver.switchTo().frame(WebElement webelement);

IMPORTANT: Once the control is on another frame, we need to switch back to the parent frame
           switchTo() to parent frame -> switchTo().parentFrame();


*/
package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class iframe {

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

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

        // driver.switchTo().frame(0); // By index
        // driver.switchTo().frame("iframeResult"); // By name or Id
        WebElement results_frame = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(results_frame); // By webelement
        driver.findElement(By.xpath("/html/body/button")).click();

        // BUT BEFORE THIS, IN THIS CASE, WE NEED TO HANDLE THE JAVASCRIPT ALERT FIRST!
        // driver.switchTo().parentFrame();
        // System.out.println(driver.getTitle());

        // driver.close();
        // driver.quit();

    }
}