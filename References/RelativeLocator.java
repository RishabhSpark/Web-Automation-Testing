/*
DOCUMENTATION LINK -> https://www.selenium.dev/documentation/webdriver/elements/locators/#available-relative-locators

Above                       If the email text field element is not easily identifiable for some reason, but the password text field element is, we can locate the text field element using the fact that it is an “input” element “above” the password element.
Below                       If the password text field element is not easily identifiable for some reason, but the email text field element is, we can locate the text field element using the fact that it is an “input” element “below” the email element.
Left Of                     If the cancel button is not easily identifiable for some reason, but the submit button element is, we can locate the cancel button element using the fact that it is a “button” element to the “left of” the submit element.
Right Of                    If the submit button is not easily identifiable for some reason, but the cancel button element is, we can locate the submit button element using the fact that it is a “button” element “to the right of” the cancel element.
Near                        If the relative positioning is not obvious, or it varies based on window size, you can use the near method to identify an element that is at most 50px away from the provided locator. One great use case for this is to work with a form element that doesn’t have an easily constructed locator, but its associated input label element does.
Chaining relative locators  You can also chain locators if needed. Sometimes the element is most easily identified as being both above/below one element and right/left of another.

*/

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocator {
    public static void main(String[] args){

        // HERE ARE THE EXAMPLES.
        WebElement password_field = driver.findElement(By.id("password"));
        driver.findElement(with(By.tagName("input")).above(password_field)).sendKeys("standard_user");

        
        WebElement username_field = driver.findElement(By.id("user-name"));
        driver.findElement(with(By.tagName("input")).below(username_field)).sendKeys("secret_sauce");


        driver.findElement(with(By.tagName("input")).toLeftOf(ENTER THE THINGYY HERE));
        driver.findElement(with(By.tagName("input")).toRightOf(ENTER THE THINGYY HERE));
        driver.findElement(with(By.tagName("input")).near(ENTER THE THINGYY HERE));

        // CHAINING, can use multiple together
        driver.findElement(with(By.tagName("input")).below(By.id("email")).toRightOf(By.id("cancel")));
        driver.close();
    }
}
