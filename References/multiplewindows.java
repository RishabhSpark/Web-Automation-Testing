/*

Basically,
opening the webpage
opening the new webpage in new tab
getting all the window handles, iterating over them and storing them separately
switching(or giving) control to the newly opened tab
performing the tasks there
switching back to the old tab, and giving control back to it

*/

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class multiplewindows {
    public static void main(String[] args){
        driver.get("https://www.salesforce.com/au/");
        driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();
        
        Set <String> windowhandles = driver.getWindowHandles();
        System.out.println(windowhandles);

        Iterator<String> iterator = windowhandles.iterator();
        String parentwindow = iterator.next();
        String childwindow = iterator.next();
        System.out.println(parentwindow);
        System.out.println(childwindow);


        driver.switchTo().window(childwindow);
        driver.findElement(By.name("UserFirstName")).sendKeys("Firstname");
        driver.findElement(By.name("UserLastName")).sendKeys("Lastname");
        driver.switchTo().window(parentwindow);

        driver.quit();
    }
}