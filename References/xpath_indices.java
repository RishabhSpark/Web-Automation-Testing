/*

Used to find tags with indices
**IMPORTANT** -> Indices starts with 1(YEP not 0)
FORMAT -> (//tagname[@Attribute='Value'])[index]

*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class xpath_indices {     
    public static void main(String[] args){   
        driver.get("http://www.saucedemo.com/");
        driver.findElement(By.xpath("(//input)[1]")).sendKeys("standard_user");
        driver.findElement(By.xpath("(//input)[2]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("(//input)[3]")).click();
        driver.close();

    }
}