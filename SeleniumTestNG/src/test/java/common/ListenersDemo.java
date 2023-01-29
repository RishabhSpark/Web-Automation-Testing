package common;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenersDemo extends baseTest{
    @Test
    public void launchApp(){
        driver.get("https://ebay.com");
        Assert.assertTrue(false);
    }
}
