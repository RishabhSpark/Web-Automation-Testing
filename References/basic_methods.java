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
findElements(By by)             Finds a;; webelements within the current page using the given query

*/

public class basic_methods {
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

        // driver.close();
        driver.quit();

        driver.close();

    }
}