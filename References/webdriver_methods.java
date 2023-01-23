/*
DOCUMENTATION -> https://www.javadoc.io/doc/org.seleniumhq.selenium/selenium-api/3.141.59/index.html

METHODS                         USE
get(String url)                 Load a new webpage in the current browser window
manage()                        Gets the options interface
getCurrentUrl()                 Get a string representing the current URL
getTitle()                      Get title of the current page
getPageSource()                 Get the source of the last loaded page
navigate()                      An abstract allowing the driver to access the browser's history and to navigate to a given URL
quit()                          Quits the driver, CLOSES ALL THE TABS
close()                         CLOSES THE CURRENT TAB, quits the browser if there is only one tab open
findElement(By by)              Finds the first webelement using the given query
findElements(By by)             Finds all webelements within the current page using the given query
getWindowHandle()               Returns an opaque handle to this window that uniquely identifies it within the current driver instance
getWindowHandles()              Returns a set of window handles which can be used to iterate over all open windows of the WebDriver instance by passing them to switchTo().webDriver.Options.window()
switchTo()                      Send future commands to a different frame or window  (EXAMPLE IN "References\iframe.java")

*/

public class webdriver_methods {
    public static void main(String[] args){
        driver.get("http://www.saucedemo.com/");


        System.out.println(driver.manage().window().getSize());
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());


        String current_url;
        current_url = driver.getCurrentUrl();
        System.out.println(current_url);
        

        String current_title;
        current_title = driver.getTitle();
        System.out.println(current_title);
        

        String page_source;
        page_source = driver.getTitle();
        System.out.println(page_source);


        driver.navigate().to("https://www.google.com/");


        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();

        List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_list']//child::div[@class='inventory_item']"));
        System.out.println(webelements);

        driver.navigate().to("https://accounts.lambdatest.com/register");
        String windowhandle;
        windowhandle = driver.getWindowHandle();
        System.out.println(windowhandle);


        driver.findElement(By.xpath("//a[@href='https://www.lambdatest.com/terms-of-service']")).click();
        Set<String> windowhandles= driver.getWindowHandles();
        System.out.println(windowhandles);


        // driver.close();
        driver.quit();

    }
}