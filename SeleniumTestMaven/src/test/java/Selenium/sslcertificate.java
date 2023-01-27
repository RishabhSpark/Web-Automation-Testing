package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sslcertificate {
    public static WebDriver driver;
    public static String browser = "Chrome";
    public static void main(String[] args) {
        
        // DesiredCapabilities handleSSLError = new DesiredCapabilities();

        // if(browser.equals("Chrome")){
        //     WebDriverManager.chromedriver().setup();

        //     handleSSLError.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        //     ChromeOptions coptions = new ChromeOptions();
        //     coptions.merge(handleSSLError);

        //     driver = new ChromeDriver(coptions);
        // }

        // else if(browser.equals("Firefox")){
        //     WebDriverManager.firefoxdriver().setup();

        //     handleSSLError.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        //     FirefoxOptions foptions = new FirefoxOptions();
        //     foptions.merge(handleSSLError);
            
        //     driver = new FirefoxDriver(foptions);
        // }
        // else if(browser.equals("Edge")){
        //     WebDriverManager.edgedriver().setup();

        //     handleSSLError.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        //     EdgeOptions eoptions = new EdgeOptions();
        //     eoptions.merge(handleSSLError);
            
        //     driver = new EdgeDriver(eoptions);
        // }

        // driver.get("https://expired.badssl.com");
        
        // driver.quit();



        WebDriverManager.chromedriver().setup();
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setAcceptInsecureCerts(true);


        ChromeOptions coptions = new ChromeOptions();
        coptions.merge(dc);

        WebDriver driver = new ChromeDriver();
        driver.get("https://expired.badssl.com");
    }
}
