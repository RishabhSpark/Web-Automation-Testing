/*

DOCUMENTATION LINK -> https://www.javadoc.io/doc/org.seleniumhq.selenium/selenium-api/3.141.59/index.html

Modifier and Type	        Method and Description
void	                    accept() 
void	                    dismiss() 
java.lang.String	        getText() 
void	                    sendKeys(java.lang.String keysToSend) 

*/

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;


public class jsalerts {
    public static void main(String[] args){

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        WebElement results_frame = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(results_frame); // By webelement
        driver.findElement(By.xpath("/html/body/button")).click();

        
        String alert_message = driver.switchTo().alert().getText();
        System.out.println(alert_message);
        driver.switchTo().alert().accept();

        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());



//      -----------------------dismiss and sendText()------------------------
        driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        WebElement results_frame2 = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(results_frame2);
        driver.findElement(By.xpath("/html/body/button")).click();

        // driver.switchTo().alert().dismiss();
        Alert alert_box = driver.switchTo().alert();
        alert_box.sendKeys("My Name");
        alert_box.accept();

        driver.quit();
    }
}