/*

AXES                USE                                                     FORMAT
self                Indicates the node itself                               //tagname[@Attribute='Value']//self::tagname
parent              Indicates the parent node                               //tagname[@Attribute='Value']//parent::tagname    
child               Indicates the child node                                //tagname[@Attribute='Value']//child::tagname 
descendant          Selects all descendant(child, gandchild, etc.)          //tagname[@Attribute='Value']//descendant::tagname
                    of current node          
descendant-or-self  Selects current node + all descendants                  //tagname[@Attribute='Value']//descendant-or-self::tagname
                    (if tagname of descendant and self are same)
ancestor            Selects all ancestors(parent, gandparent, etc.)         //tagname[@Attribute='Value']//ancestor::tagname
                    of current node          
ancestor-or-self    Selects current node + all ancestors                    //tagname[@Attribute='Value']//ancestor-or-self::tagname
                    (if tagname of ancestors and self are same)             //tagname[@Attribute='Value']//following::tagname
following           Selects all nodes that appear after current node
following-sibling   Selects all node having same parent as current node     //tagname[@Attribute='Value']//following-or-self::tagname
                    and appears after the current no

*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_axes {
    public static void main(String[] args){
        driver.get("https://accounts.lambdatest.com/register");
        
        driver.findElement(By.xpath("//input[@id='name']//self::input")).sendKeys("Name???"); //self axes
        driver.findElement(By.xpath("//select[@id='country_code']//child::option[@data-countrycode='AS']")).click(); //child axes
        driver.findElement(By.xpath("//option[@data-countrycode='AF']//parent::select")).click(); //parent axes
        driver.findElement(By.xpath("//select[@id='country_code']//parent::div//child::input")).sendKeys("234567825"); //parent and child axes together
        

//      -----------------------------------------XPATH DESCENDANT(or-self) + getAttribute with List-----------------------------------------
        // THIS FOR ONLY ONE
        // WebElement attribute_select = driver.findElement(By.xpath("//select[@id='country_code']//descendant::option"));
        // String label_attribute = attribute_select.getAttribute("label");
        // String value_attribute = attribute_select.getAttribute("value");
        // System.out.println(label_attribute + " " + value_attribute);

        // THIS FOR ALL, STORING IN LIST AND THEN ITERATING OVER ALL. USED **findElements** (plural) HERE.
        List<WebElement> attribute_select = driver.findElements(By.xpath("//select[@id='country_code']//descendant::option"));
        for(WebElement element : attribute_select){   
            String label_attribute = element.getAttribute("label");
            String value_attribute = element.getAttribute("value");
            System.out.println(label_attribute + " " + value_attribute+"\n");
        }

        List<WebElement> all_div_descendant_or_self = driver.findElements(By.xpath("//div[@class='clearfix registeraArea signUpWithEmail']//descendant-or-self::div"));
        for(WebElement element : all_div_descendant_or_self){   
            String class_attribute = element.getAttribute("class");
            System.out.println(class_attribute+"\n");
        }       



//      ---------------------------------------XPATH ANCESTOR(or-self) + storing in List + size check---------------------------------------
        List<WebElement> attribute_select_ancestor = driver.findElements(By.xpath("//div[@class='grecaptcha-error']//ancestor::div"));
        int attribute_select_ancestor_size = attribute_select_ancestor.size();
        System.out.println(attribute_select_ancestor_size);

        List<WebElement> attribute_select_ancestor_or_self = driver.findElements(By.xpath("//div[@class='grecaptcha-error']//ancestor-or-self::div"));
        int attribute_select_ancestor_or_self_size = attribute_select_ancestor_or_self.size();
        System.out.println(attribute_select_ancestor_or_self_size);  


//      ---------------------------------------XPATH FOLLOWING(or-self) + storing in List + size check---------------------------------------
        List<WebElement> attribute_select_following = driver.findElements(By.xpath("//div[@class='w-full custom__border xls:mt-20 mt-10']//following::div"));
        int attribute_select_following_size = attribute_select_following.size();
        System.out.println(attribute_select_following_size);

        List<WebElement> attribute_select_following_sibling = driver.findElements(By.xpath("//div[@class='w-full custom__border xls:mt-20 mt-10']//following-sibling::div"));
        int attribute_select_following_sibling_size = attribute_select_following_sibling.size();
        System.out.println(attribute_select_following_sibling_size);



        // driver.close();
    }
}