/*

MODIFIER AND TYPE   METHOD                                                      DESCRIPTION
Actions	            moveByOffset(int xOffset, int yOffset)                      Moves the mouse from its current position (or 0,0) by the given offset.
Actions	            moveToElement(WebElement target)                            Moves the mouse to the middle of the element.
Actions	            moveToElement(WebElement target, int xOffset, int yOffset)  Moves the mouse to an offset from the top-left corner of the element.

*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehover{
    public static void main(String[] args) {
        driver.get("https://www.ebay.com");

        WebElement collectibles_and_art = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[6]/a"));
        
        Actions action = new Actions(driver);
        action.moveToElement(collectibles_and_art, 0, 0).perform();
        
        // driver.quit();
    }
}