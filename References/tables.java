/*

STEP 1 -> Get number of rows
STEP 2 -> Get number of columns
STEP 3 -> Iterative over rows and columns using for loop and get text and print it

*/
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tables{
    public static void main(String[] args){
        driver.get("https://pokemondb.net/pokedex/all");
        driver.manage().window().maximize();


        List <WebElement> row_elements = driver.findElements(By.xpath("//table[@id='pokedex']/tbody/tr"));
        int num_rows = row_elements.size();
        System.out.println(num_rows);

        List <WebElement> column_elements = driver.findElements(By.xpath("//table[@id='pokedex']/tbody/tr[1]/td"));
        int num_columns = column_elements.size();
        System.out.println(num_columns);


        for(int i=1; i<=num_rows; i++){
            for(int j=1; j<=num_columns; j++){
                System.out.print(driver.findElement(By.xpath("//table[@id='pokedex']/tbody/tr[" +i+ "]/td[" +j+ "]")).getText()+"   ");
            }
            System.out.println();
        }


        
        driver.quit();
        
    }
}