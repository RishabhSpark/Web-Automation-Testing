/*

FUNCTION NAME               USE                                                 DENOTED BY      FORMAT

child                       To select all direct child of selected node             >           tagname[AttributeName='AttributeValue']>tagname[AttributeName='AttributeValue']
sub-child                   To select all child + subchild of current node      --spacebar--    tagname[AttributeName='AttributeValue'] tagname[AttributeName='AttributeValue']

*/
public class 
 {

    
} */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class cssselector_family {
    public static void main(String[] args){
        driver.get("https://accounts.lambdatest.com/register");
//      -----------------DIRECT CHILD-----------------
        // driver.findElement(By.cssSelector("div.error__border>input")).sendKeys("Full Name");
//      -----------------SUB-CHILD-----------------
        List<WebElement> all_subchild = driver.findElements(By.cssSelector("form.form input[id]"));
        for(WebElement element : all_subchild){   
            String class_attribute = element.getAttribute("id");
            extracted(class_attribute);   
        }
        
        // driver.close();

    }

    private static void extracted(String class_attribute) {
        System.out.println(class_attribute+"\n");
    }
}
