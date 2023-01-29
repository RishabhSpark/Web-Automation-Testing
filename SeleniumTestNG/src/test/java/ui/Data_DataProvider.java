package ui;

import org.testng.annotations.DataProvider;

public class Data_DataProvider {
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
