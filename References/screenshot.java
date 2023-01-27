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
    public static void main(String[] args) throws IOException{
        driver.get("https://pokemondb.net/pokedex/all");
        driver.manage().window().maximize();

        // GETTING DATE AND TIME
        Date current_datetime = new Date();
        System.out.println(current_datetime);
        String screenshot_filename_datetime = current_datetime.toString().replace(" ", "-").replace(":", "-");


        // TAKING SCREENSHOT
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        //SAVING SCREENSHOT
        FileUtils.copyFile(screenshotFile, new File("SeleniumTestMaven/src/test/screenshots/" + "screenshot_"+screenshot_filename_datetime + ".png"));
        
        driver.quit();
        
    }
}