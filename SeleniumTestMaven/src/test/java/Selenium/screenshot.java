package Selenium;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot{
    public static WebDriver driver;
    public static String browser="Chrome";
    public static void main(String[] args) throws IOException{
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
        driver.get("https://pokemondb.net/pokedex/all");
        driver.manage().window().maximize();

        Date current_datetime = new Date();
        System.out.println(current_datetime);
        String screenshot_filename_datetime = current_datetime.toString().replace(" ", "-").replace(":", "-");

        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("SeleniumTestMaven/src/test/screenshots/" + "screenshot_"+screenshot_filename_datetime + ".png"));
        // String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64); 

        driver.quit();
        
    }
}