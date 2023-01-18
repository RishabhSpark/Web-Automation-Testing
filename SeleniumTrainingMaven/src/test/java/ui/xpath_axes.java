package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class xpath_axes {

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
        
        driver.findElement(By.xpath("//input[@id='name']//self::input")).sendKeys("Name???"); //self axes
        driver.findElement(By.xpath("//select[@id='country_code']//child::option[@data-countrycode='AS']")).click(); //child axes
        driver.findElement(By.xpath("//option[@data-countrycode='AF']//parent::select")).click(); //parent axes
        driver.findElement(By.xpath("//select[@id='country_code']//parent::div//child::input")).sendKeys("234567825"); //parent and child axes together

        
        
//      -----------------------------------------XPATH DESCENDANT(or-self) + getAttribute with List-----------------------------------------
        // THIS FOR ONLY ONE
        // WebElement attribute_select = driver.findElement(By.xpath("//select[@id='country_code']//descendant::option"));
        // String label_attribute = attribute_select.getAttribute("label");
        // String value_attribute = attribute_select.getAttribute("value");
        // System.out.println(label_attribute + " " + value_attribute);

        // THIS FOR ALL, STORING IN LIST AND THEN ITERATING OVER ALL. USED **findElements** (plural) HERE.
        List<WebElement> attribute_select = driver.findElements(By.xpath("//select[@id='country_code']//descendant::option"));
        for(WebElement element : attribute_select){   
            String label_attribute = element.getAttribute("label");
            String value_attribute = element.getAttribute("value");
            System.out.println(label_attribute + " " + value_attribute+"\n");
        }

        List<WebElement> all_div_descendant_or_self = driver.findElements(By.xpath("//div[@class='clearfix registeraArea signUpWithEmail']//descendant-or-self::div"));
        for(WebElement element : all_div_descendant_or_self){   
            String class_attribute = element.getAttribute("class");
            System.out.println(class_attribute+"\n");
        }       
        
        // driver.close();

    }
}