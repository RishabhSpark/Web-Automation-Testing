import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rightclick {
    public static void main(String[] args) {
        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/nav/div/ul/li[4]/a"));

        Actions action = new Actions(driver);
        action.contextClick(element).perform();

        
        driver.quit();
    }
}
