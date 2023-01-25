/*

Reference Class FluentWait<T> -> https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html


Class FluentWait<T>

FLUENT WAIT -> An implementation of the Wait interface that may have its timeout and polling interval configured on the fly.
               Each FluentWait instance defines the maximum amount of time to wait for a condition, as well as the frequency
               with which to check the condition. Furthermore, the user may configure the wait to ignore specific types of
               exceptions whilst waiting, such as NoSuchElementExceptions when searching for an element on the page.


METHOD	                                       DESCRIPTION
ignoreAll​()	                                Configures this instance to ignore specific types of exceptions while waiting for a condition.
ignoring​()
pollingEvery​(java.time.Duration interval)      Sets how often the condition should be evaluated.
timeoutException​(java.lang.String message,     Throws a timeout exception.
java.lang.Throwable lastException)	
until​()	                                    Repeatedly applies this instance's input value to the given function until one of the following occurs: the function returns neither null nor false the function throws an unignored exception the timeout expires the current thread is interrupted
withMessage​(java.lang.String message)	        Sets the message to be displayed when time expires.
withMessage​(java.util.function.Supplier        Sets the message to be evaluated and displayed when time expires.
<java.lang.String> messageSupplier)	
withTimeout​(java.time.Duration timeout)	    Sets how long to wait for the evaluated condition to be true.

*/

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class fluent_wait {
    public static void main(String[] args){
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();


        WebElement element = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/a"));

        Actions action = new Actions(driver);
        action.moveToElement(element).perform();

        Wait<WebDriver> fluent_wait = new FluentWait<WebDriver>(driver)
       .withTimeout(Duration.ofSeconds(30))
       .pollingEvery(Duration.ofSeconds(5))
       .withMessage("ERROR MESSAGE")
       .ignoring(NoSuchElementException.class);

       
        fluent_wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("/html/body/div[5]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a"))).click();


        driver.quit();
    }
}