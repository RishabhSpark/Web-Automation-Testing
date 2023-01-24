package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider {
    public static WebDriver driver;
    public static String browser = "Chrome";
    public static void main(String[] args) {
        if(browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        if(browser.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        if(browser.equals("Edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.manage().window().maximize();

        WebElement droppable_frame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(droppable_frame);
        WebElement red = driver.findElement(By.xpath("/html/body/div[1]"));
        WebElement green = driver.findElement(By.xpath("/html/body/div[2]"));
        WebElement blue = driver.findElement(By.xpath("/html/body/div[3]"));

        Actions action = new Actions(driver);
        action.dragAndDropBy(red, -50, 70).perform();
        action.dragAndDropBy(green, 20, 120).perform();

        driver.switchTo().parentFrame();
        driver.quit();
    }
}
