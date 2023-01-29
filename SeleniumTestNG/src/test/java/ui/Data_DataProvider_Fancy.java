package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_DataProvider_Fancy {
    @DataProvider
    public Object[][] dataset(Method m){
        Object[][] data = null;

        if(m.getName().equals("testcase3")){
            data = new Object[][]
            {
                {"user", "password"},
                {"user2", "password2"},
                {"user3", "password3"},
                {"user4", "password4"}
            };
        }


        else if(m.getName().equals("testcase4")){
            data = new Object[][]
            {
                {"username", "pass", "xyz@whatever.com"},
                {"username2", "pass2", "abc@whatever.com"},
                {"username3", "pass3", "pqr@whatever.com"},
                {"username4", "pass4", "mno@whatever.com"}
            };
        }
        return data;
    }
}
