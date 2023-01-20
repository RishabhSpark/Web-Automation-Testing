/*

FUNCTION NAME               USE                                                 DENOTED BY      FORMAT

child                       To select all direct child of selected node             >           tagname[AttributeName='AttributeValue']>tagname[AttributeName='AttributeValue']
sub child                   To select all child + subchild of current node      --spacebar--    tagname[AttributeName='AttributeValue'] tagname[AttributeName='AttributeValue']
next sibling                Selects the element immediately following               +           tagname[AttributeName='AttributeValue']+tagname[AttributeNam='AttributeValue']
                            current element, if both are child of same parent.



PSEUDO-CLASS -> A CSS pseudo-class is a keyword added to a selector that specifies a special state of the selected webelement

FUNCTION NAME               USE                                                 DENOTED BY              FORMAT

first-child                 Returns the first child of selected node            :first_child            tagname[AttributeName='AttributeValue'] tagname:first_child
last-child          1       Returns the last child of selected node             :last_child             tagname[AttributeName='AttributeValue'] tagname:last_child
nth-child                   Returns the nth child of selected node              :nth-child()            tagname[AttributeName='AttributeValue'] tagname:nth-child(child_number)
nth-last-child              Returns the nth last child of selected node         :nth-last-child()       tagname[AttributeName='AttributeValue'] tagname:nth-last-child(child_number_from_back)
first-of-type               Returns the first child of specified type           :first-of-type          tagname[AttributeName='AttributeValue'] tagname:first-of-type 
last-of-type                Returns the first child of specified type           :last-of-type           tagname[AttributeName='AttributeValue'] tagname:last-of-type  
nth-of-type                 Returns the first child of specified type           :nth-of-type            tagname[AttributeName='AttributeValue'] tagname:nth-of-type 
nth-last-of-type            Returns the first child of specified type           :nth-last-of-type       tagname[AttributeName='AttributeValue'] tagname:nth-last-of-type  

*/
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class cssselector_family {
    public static void main(String[] args){
        
        driver.get("https://accounts.lambdatest.com/register");
//      -----------------DIRECT CHILD-----------------
        // driver.findElement(By.cssSelector("div.error__border>input")).sendKeys("Full Name");

//      -----------------SUB HILD-----------------
        List<WebElement> all_subchild = driver.findElements(By.cssSelector("form.form input[id]"));
        for(WebElement element : all_subchild){   
            String class_attribute = element.getAttribute("id");
            System.out.println(class_attribute);   
        }

//      -----------------NEXT SIBLING-----------------        
        driver.findElement(By.cssSelector("option[data-countrycode='AF']+option")).click();
        
//      -----------------FIRST CHILD, LAST CHILD, N-TH FIRST CHILD, N-TH LAST CHILD-----------------        
        String first_child;
        first_child = driver.findElement(By.cssSelector("select#country_code :first-child")).getAttribute("label");
        System.out.println("First child: " + first_child);

        String last_child;
        last_child = driver.findElement(By.cssSelector("select#country_code :last-child")).getAttribute("label");
        System.out.println("Last child: " + last_child);

        String child_21;
        child_21 = driver.findElement(By.cssSelector("select#country_code :nth-child(21)")).getAttribute("label");
        System.out.println("21st first child: " + child_21);

        String last_child_21;
        last_child_21 = driver.findElement(By.cssSelector("select#country_code :nth-last-child(21)")).getAttribute("label");
        System.out.println("21st last child: " + last_child_21);

        

//      -----------------first-of-type, last-of-type, nth-of-type, nth-last-of-type-----------------        
        String first_of_type;
        first_of_type = driver.findElement(By.cssSelector("select#country_code>option:first-of-type")).getAttribute("label");
        System.out.println("First child: " + first_of_type);

        String last_of_type;
        last_of_type = driver.findElement(By.cssSelector("select#country_code>option:last-of-type")).getAttribute("label");
        System.out.println("Last child: " + last_of_type);

        String nth_of_type;
        nth_of_type = driver.findElement(By.cssSelector("select#country_code>option:nth-of-type(21)")).getAttribute("label");
        System.out.println("21st first child: " + nth_of_type);

        String nth_last_of_type;
        nth_last_of_type = driver.findElement(By.cssSelector("select#country_code>option:nth-last-of-type(21)")).getAttribute("label");
        System.out.println("21st last child: " + nth_last_of_type);

        // driver.close();
    }
}