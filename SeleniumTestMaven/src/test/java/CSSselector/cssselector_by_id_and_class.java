/*

FORMAT BY ID-> tagname#elementID
FORMAT BY CLASS NAME -> tagname.elementID

*/

package CSSselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class cssselector_by_id_and_class {

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
        
        driver.get("https://accounts.lambdatest.com/register");
        
        driver.findElement(By.cssSelector("#name")).sendKeys("First Name "); // Copied cssSelector
        driver.findElement(By.cssSelector("input#name")).sendKeys("Second Name "); // Self written cssSelector with ID
        driver.findElement(By.cssSelector("input.w-full")).sendKeys("Third Name "); // cssSelector with class
        
        // driver.close();

    }
}
