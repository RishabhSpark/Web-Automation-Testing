/*

Properties documentation -> https://docs.oracle.com/javase/7/docs/api/java/util/Properties.html
InputStream documentation -> https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html
OutputStream documentation -> https://docs.oracle.com/javase/7/docs/api/java/io/OutputStream.html

*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class read_write_properties {
    public static WebDriver driver;
    public static void main(String[] args) throws IOException {
        // READING FROM A PROPERTIES FILE
        Properties properties = new Properties();
        FileInputStream inputstream = new FileInputStream("SeleniumTestMaven/src/test/resources/testdata.properties");
        properties.load(inputstream);
        

        String browser = properties.getProperty("browser"); // FEED THIS DIRECTLY TO WHERE WE NEED TO SPECIFY BROWSER
        System.out.println(browser);
        String url = properties.getProperty("url");         // FEED THIS DIRECTLY TO WHERE WE NEED TO SPECIFY URL
        System.out.println(url);
        
        if(browser.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        else if(browser.equalsIgnoreCase("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        else if(browser.equalsIgnoreCase("Edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.get(url);
        // WRITING TO A PROPERTIES FILE
        FileOutputStream outputstream = new FileOutputStream("SeleniumTestMaven/src/test/resources/writetestdata.properties");
        properties.setProperty("testdata", "asdffdsa"); // write key-value pair for properties file
        properties.store(outputstream, "Comments goes here, if don't want to specify type null");

        driver.quit();
    }
}
