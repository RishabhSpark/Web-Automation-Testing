/*

DOCUMENTATION LINK -> https://www.javadoc.io/doc/org.seleniumhq.selenium/selenium-api/3.141.59/index.html

Modifier and Type	        Method and Description
void	                    accept() 
void	                    dismiss() 
java.lang.String	        getText() 
void	                    sendKeys(java.lang.String keysToSend) 

*/
package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class jsalerts {

    public static WebDriver driver;
    public static String browser = "Chrome";
    public static void main(String[] args) throws InterruptedException{
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


        String alert_message = driver.switchTo().alert().getText();
        System.out.println(alert_message);
        driver.switchTo().alert().accept();

        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());

        Thread.sleep(2000);
//      -----------------------dismiss and sendText()------------------------
        driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        WebElement results_frame2 = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(results_frame2);
        driver.findElement(By.xpath("/html/body/button")).click();
        Thread.sleep(2000);
        // driver.switchTo().alert().dismiss();
        Alert alert_box = driver.switchTo().alert();
        alert_box.sendKeys("My Name");
        Thread.sleep(2000);
        alert_box.accept();
        Thread.sleep(2000);


        driver.quit();

    }
}