package Selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class webdriver_methods {

    public static WebDriver driver;
    public static String browser = "Chrome";
    public static void main(String[] args){
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
        
        driver.get("http://www.saucedemo.com/");


        System.out.println(driver.manage().window().getSize());
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());


        String current_url;
        current_url = driver.getCurrentUrl();
        System.out.println(current_url);
        

        String current_title;
        current_title = driver.getTitle();
        System.out.println(current_title);
        

        String page_source;
        page_source = driver.getTitle();
        System.out.println(page_source);


        // driver.navigate().to("https://www.google.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();

        List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_list']//child::div[@class='inventory_item']"));
        System.out.println(webelements);

        driver.navigate().to("https://accounts.lambdatest.com/register");
        String windowhandle;
        windowhandle = driver.getWindowHandle();
        System.out.println(windowhandle);


        driver.findElement(By.xpath("//a[@href='https://www.lambdatest.com/terms-of-service']")).click();
        Set<String> windowhandles= driver.getWindowHandles();
        System.out.println(windowhandles);

        // driver.close();
        driver.quit();

    }
}