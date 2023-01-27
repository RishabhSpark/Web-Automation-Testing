package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javacript_executor {
    public static WebDriver driver;
    public static String browser = "Chrome";
    public static void main(String[] args) throws InterruptedException {
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

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

        // PRINT TITLE OF THE PAGE
        JavascriptExecutor jsexec = (JavascriptExecutor) driver;
        String script = "return document.title;";
        String title = (String) jsexec.executeScript(script);
        System.out.println(title);


        // CLICK BUTTON USING JS FUNCTION NAME
        driver.switchTo().frame("iframeResult");
        jsexec.executeScript("myFunction()");
        driver.switchTo().alert().accept();

        // HIGHLIGHTING AN ELEMENT
        WebElement button = driver.findElement(By.xpath("/html/body/button"));
        jsexec.executeScript("arguments[0].style.border='3px solid red'", button);
        Thread.sleep(2000);

        // SCROLL TO A CERTAIN ELEMENT
        driver.navigate().to("https://www.w3schools.com");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//div[@id='main']/div[15]/h2"));
        jsexec.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(2000);
        
        driver.quit();
    }
}
