/*

CONSTRUCTOR                                                                             DESCRIPTION
WebDriverWait​(WebDriver driver, java.time.Duration timeout)                             Wait will ignore instances of NotFoundException that are encountered (thrown) by default in the 'until' condition, and immediately propagate all others.
WebDriverWait​(WebDriver driver, java.time.Duration timeout, java.time.Duration sleep)	 Wait will ignore instances of NotFoundException that are encountered (thrown) by default in the 'until' condition, and immediately propagate all others.
WebDriverWait​(WebDriver driver, java.time.Duration timeout, java.time.Duration sleep, java.time.Clock clock, Sleeper sleeper)	 

*/

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class explicit_wait {
    public static void main(String[] args){
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();
        
        WebDriverWait explicit_wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement element = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/a"));

        Actions action = new Actions(driver);
        action.moveToElement(element).perform();


        explicit_wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("/html/body/div[5]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a"))).click();


        driver.quit();
    }
}