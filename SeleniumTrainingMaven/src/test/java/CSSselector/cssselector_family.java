package CSSselector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class cssselector_family {

    public static WebDriver driver;
    public static String browser = "Chrome";
    public static void main(String[] args){
        if(browser == "Chrome"){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        else if(browser == "Firefox"){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        else if(browser == "Edge"){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        
        driver.get("https://accounts.lambdatest.com/register");
//      -----------------DIRECT CHILD-----------------
        // driver.findElement(By.cssSelector("div.error__border>input")).sendKeys("Full Name");
//      -----------------SUB-CHILD-----------------
        List<WebElement> all_subchild = driver.findElements(By.cssSelector("form.form input[id]"));
        for(WebElement element : all_subchild){   
            String class_attribute = element.getAttribute("id");
            System.out.println(class_attribute+"\n");   
        }
        
        // driver.close();

    }
}
