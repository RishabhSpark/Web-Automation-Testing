package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class webelement_methods {
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
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[1]/input")).sendKeys("Full Name");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[1]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[4]/div[1]/select")).click();

        String fullname_attribute = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[1]/input")).getAttribute("data-testid");
        System.out.println(fullname_attribute);

        String font_size = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/button")).getCssValue("font-size");
        System.out.println(font_size);

        Point location = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/button")).getLocation();
        System.out.println(location);

        Dimension size = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/button")).getSize();
        System.out.println(size);

        String tagname = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/button")).getTagName();
        System.out.println(tagname);

        String text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/button")).getText();
        System.out.println(text);

        boolean visible = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/button")).isDisplayed();
        System.out.println(visible);

        boolean enabled = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/button")).isEnabled();
        System.out.println(enabled);

        boolean selected = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[1]/input")).isSelected();
        System.out.println(selected);

        driver.quit();
    }
}
