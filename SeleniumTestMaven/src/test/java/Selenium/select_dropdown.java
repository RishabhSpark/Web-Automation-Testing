package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class select_dropdown{
    public static WebDriver driver;
    public static String browser="Chrome";
    public static void main(String[] args) throws InterruptedException{
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

        driver.get("https://accounts.lambdatest.com/register");
        WebElement country_code_list = driver.findElement(By.id("country_code"));
        Select select = new Select(country_code_list);

        WebElement first_option = select.getFirstSelectedOption();
        System.out.println(first_option.getText());

        select.selectByIndex(5);
        Thread.sleep(2000);

        select.selectByValue("+91");
        Thread.sleep(2000);
        
        select.selectByVisibleText("Yemen (+967)");
        Thread.sleep(2000);
        
        driver.navigate().to("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

        WebElement multiselect_things = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[6]/div/form/table/tbody/tr[10]/td[2]/select"));
        Select multiselect = new Select(multiselect_things);

        boolean multiple = multiselect.isMultiple();
        System.out.println(multiple);

        multiselect.selectByIndex(0);
        multiselect.selectByIndex(1);
        multiselect.selectByIndex(3);
        multiselect.selectByIndex(4);


        List <WebElement> selected_elements = multiselect.getAllSelectedOptions();
        System.out.println(selected_elements);

        WebElement first_selected_element = multiselect.getFirstSelectedOption();
        System.out.println(first_selected_element);

        List <WebElement> all_elements = multiselect.getOptions();
        System.out.println(all_elements);

        multiselect.deselectByIndex(1);
        Thread.sleep(2000);

        multiselect.deselectByVisibleText("Wait Commands");
        Thread.sleep(2000);

        multiselect.deselectAll();

        int hash = multiselect.hashCode();
        System.out.println(hash);


        driver.quit();
        
    }
}