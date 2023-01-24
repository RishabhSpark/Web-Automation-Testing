import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag_and_drop {
        public static void main(String[] args) {
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        WebElement droppable_frame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(droppable_frame);
        WebElement drag = driver.findElement(By.xpath("/html/body/div[1]"));
        WebElement drop = driver.findElement(By.xpath("/html/body/div[2]"));

        Actions action = new Actions(driver);
        action.dragAndDrop(drag, drop).perform();

        driver.switchTo().parentFrame();
        // driver.quit();
    }
}
