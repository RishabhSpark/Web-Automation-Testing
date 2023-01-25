/*

DOCUMENTATION -> https://www.javadoc.io/doc/org.seleniumhq.selenium/selenium-api/3.141.59/index.html

implicitlyWait(long time, java.util.concurrent.TimeUnit unit)
Specifies the amount of time the driver should wait when searching for an element if it is not immediately present.
(Applicable for all functions)

*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class implicit_wait {
    public static void main(String[] args){
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/a"));

        Actions action = new Actions(driver);
        action.moveToElement(element).perform();

        driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")).click();
        
        driver.quit();

    }
}