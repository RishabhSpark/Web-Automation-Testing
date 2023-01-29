/*

For externalizing dataProviders, we can use dataProviderClass and reference the DataProvider file as a class

*/

package ui;

import org.testng.annotations.Test;

public class DataProviders3 {

    @Test(dataProvider = "dataset", dataProviderClass = Data_DataProvider.class)            //Reference data from Data_DataProvider.java
    public void testcase(String username, String password){
        System.out.println(username + "\t" + password);
    }

    @Test(dataProvider = "dataprovidername", dataProviderClass = Data_DataProvider.class)   //Reference data from Data_DataProvider.java
    public void testcase2(String username, String password, String email){
        System.out.println(username + "\t" + password + "\t" + email);
    }
}
