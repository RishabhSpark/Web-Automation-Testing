/*

DOCUMENTATION -> https://www.javadoc.io/doc/org.seleniumhq.selenium/selenium-api/3.141.59/index.html
KEYBOARD ACTIONS -> https://www.selenium.dev/documentation/webdriver/actions_api/keyboard/
KEYS LIST -> https://github.com/SeleniumHQ/selenium/blob/selenium-4.2.0/java/src/org/openqa/selenium/Keys.java#L28

*/
package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardactions {
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

        driver.get("https://extendsclass.com/text-compare.html");
        driver.manage().window().maximize();

        WebElement source_text = driver.findElement(By.xpath("//div[@id='dropZone']"));
        
        Actions action = new Actions(driver);
        action.keyDown(source_text, Keys.CONTROL).sendKeys("a");
        action.sendKeys("c");
        action.build().perform();

        WebElement destination = driver.findElement(By.xpath("//div[@id='dropZone2']"));
        action.keyDown(destination, Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE).sendKeys("v").build().perform();




        WebElement error_check_element = driver.findElement(By.xpath("//div[@id='nb-diff']"));
        String error_value = error_check_element.getText();
        System.out.println(error_value);
        driver.quit();        
    }
}
