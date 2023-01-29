/*

DataProvider is used to provide data to the tests.
To call a DataProvider we use the object name for it.
To provide data to a test from DataProvider, we use "dataProvider" when specifying @Test
Otherwise, we can also specify name to a DataProvider and use that in @Test

*/
package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DataProviders {

    @Test(dataProvider = "dataset")
    public void testcase(String username, String password){
        System.out.println(username + "\t" + password);
    }

    @DataProvider
    public Object[][] dataset(){
        int rows = 4;
        int columns = 2;
        Object[][] data = new Object[rows][columns];
        // First row
        data[0][0]="user1";
        data[0][1]="password1";

        // Second row
        data[1][0]="user2";
        data[1][1]="password2";

        // Third row
        data[2][0]="user3";
        data[2][1]="password3";

        // Fourth row
        data[3][0]="user4";
        data[3][1]="password4";

        return data;
    }
    
    @Test(dataProvider = "dataprovidername")
    public void testcase2(String username, String password, String email){
        System.out.println(username + "\t" + password + "\t" + email);
    }
    
    // ANOTHER WAY TO DEFINE DataProvider
    @DataProvider(name="dataprovidername")
    public Object[][] dataset2(){
        return new Object[][]
        {
            {"username", "pass", "xyz@whatever.com"},
            {"username2", "pass2", "abc@whatever.com"},
            {"username3", "pass3", "pqr@whatever.com"},
            {"username4", "pass4", "mno@whatever.com"}
        };
    }
}
