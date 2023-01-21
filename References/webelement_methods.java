/*
DOCUMENTATION -> https://www.javadoc.io/doc/org.seleniumhq.selenium/selenium-api/3.141.59/index.html

METHODS                             USE
sendKeys(String)                    Used to type something
clear()                             For clearing textbox
click()                             Click the element
getAttribute(String.name)           Returns the attribute asked to return
getCssValue(String propetyName)     Returns the value of the css property
getLocation()                       Returns the location of top-left hand corner of the element
getSize()                           Returns the width and height of the selected element
getTagName()                        Gets the tagname of the element
getText()                           Gets the visible text of the element
isDisplayed()                       Is the element displayed or not
isEnabled()                         Is the element enabled or not
isSelected()                        Is the element selected or not

*/

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class webelement_methods {
    public static void main(String[] args){

        driver.get("https://accounts.lambdatest.com/register");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[1]/input")).sendKeys("Full Name");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[1]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[4]/div[1]/select")).click();

        String fullname_attribute = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[1]/input")).getAttribute("data-testid");
        System.out.println(fullname_attribute);

        String font_size = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/button")).getCssValue("font-size");
        System.out.println(font_size);

        Point location = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/button")).getLocation();
        System.out.println(location);

        Dimension size = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/button")).getSize();
        System.out.println(size);

        String tagname = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/button")).getTagName();
        System.out.println(tagname);

        String text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/button")).getText();
        System.out.println(text);

        boolean visible = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/button")).isDisplayed();
        System.out.println(visible);

        boolean enabled = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/button")).isEnabled();
        System.out.println(enabled);

        boolean selected = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[1]/input")).isSelected();
        System.out.println(selected);

        driver.quit();
    }
}
