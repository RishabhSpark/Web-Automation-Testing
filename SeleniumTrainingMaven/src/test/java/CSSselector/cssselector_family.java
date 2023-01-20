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

//      -----------------SUB HILD-----------------
        List<WebElement> all_subchild = driver.findElements(By.cssSelector("form.form input[id]"));
        for(WebElement element : all_subchild){   
            String class_attribute = element.getAttribute("id");
            System.out.println(class_attribute);   
        }

//      -----------------NEXT SIBLING-----------------        
        driver.findElement(By.cssSelector("option[data-countrycode='AF']+option")).click();
        
//      -----------------FIRST CHILD, LAST CHILD, N-TH FIRST CHILD, N-TH LAST CHILD-----------------        
        String first_child;
        first_child = driver.findElement(By.cssSelector("select#country_code :first-child")).getAttribute("label");
        System.out.println("First child: " + first_child);

        String last_child;
        last_child = driver.findElement(By.cssSelector("select#country_code :last-child")).getAttribute("label");
        System.out.println("Last child: " + last_child);

        String child_21;
        child_21 = driver.findElement(By.cssSelector("select#country_code :nth-child(21)")).getAttribute("label");
        System.out.println("21st first child: " + child_21);

        String last_child_21;
        last_child_21 = driver.findElement(By.cssSelector("select#country_code :nth-last-child(21)")).getAttribute("label");
        System.out.println("21st last child: " + last_child_21);
        
        
        // driver.close();
    }
}
