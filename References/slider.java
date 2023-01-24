import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider {
    public static void main(String[] args) {
        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.manage().window().maximize();

        WebElement droppable_frame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(droppable_frame);
        WebElement red = driver.findElement(By.xpath("/html/body/div[1]"));
        WebElement green = driver.findElement(By.xpath("/html/body/div[2]"));
        // WebElement blue = driver.findElement(By.xpath("/html/body/div[3]"));

        Actions action = new Actions(driver);
        action.dragAndDropBy(red, -50, 70).perform();
        action.dragAndDropBy(green, 20, 120).perform();

        driver.switchTo().parentFrame();
        driver.quit();
    }
}
