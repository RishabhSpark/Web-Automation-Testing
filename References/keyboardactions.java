/*

DOCUMENTATION -> https://www.javadoc.io/doc/org.seleniumhq.selenium/selenium-api/3.141.59/index.html
KEYBOARD ACTIONS -> https://www.selenium.dev/documentation/webdriver/actions_api/keyboard/
KEYS LIST -> https://github.com/SeleniumHQ/selenium/blob/selenium-4.2.0/java/src/org/openqa/selenium/Keys.java#L28

*/

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardactions {
    public static void main(String[] args) {
        driver.get("https://extendsclass.com/text-compare.html");
        driver.manage().window().maximize();

        WebElement source_text = driver.findElement(By.xpath("//div[@id='dropZone']"));
        
        Actions action = new Actions(driver);
        action.keyDown(source_text, Keys.CONTROL).sendKeys("a");
        action.sendKeys("c");
        action.build().perform();

        WebElement destination = driver.findElement(By.xpath("//div[@id='dropZone2']"));
        action.keyDown(destination, Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE).sendKeys("v").build().perform();

        // driver.quit();        
    }
}
