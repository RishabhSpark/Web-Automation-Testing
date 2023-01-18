/*
FORMAT -> tagname#elementID
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class cssselector {
    public static void main(String[] args){
        
        driver.get("https://accounts.lambdatest.com/register");
        driver.findElement(By.cssSelector("#name")).sendKeys("User Name"); // Copied cssSelector
        driver.findElement(By.cssSelector("input#name")).sendKeys("Full Name"); // Self written cssSelector
        
        // driver.close();

    }
}
