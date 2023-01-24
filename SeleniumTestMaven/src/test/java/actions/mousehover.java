/*

MODIFIER AND TYPE   METHOD                                                      DESCRIPTION
Actions	            moveByOffset(int xOffset, int yOffset)                      Moves the mouse from its current position (or 0,0) by the given offset.
Actions	            moveToElement(WebElement target)                            Moves the mouse to the middle of the element.
Actions	            moveToElement(WebElement target, int xOffset, int yOffset)  Moves the mouse to an offset from the top-left corner of the element.

*/

package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehover{
    public static WebDriver driver;
    public static String browser = "Chrome";
    public static void main(String[] args) {
        if(browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        if(browser.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        if(browser.equals("Edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.get("https://www.ebay.com");
        
        WebElement collectibles_and_art = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[6]/a"));
        
        Actions action = new Actions(driver);
        action.moveToElement(collectibles_and_art, 0, 0).perform();
        
        // driver.quit();
    }
}