package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.baseTest;

public class screenshot_utils extends baseTest {
    public void getScreenshot() throws IOException {
        // GETTING DATE AND TIME
        Date current_datetime = new Date();
        String screenshot_filename_datetime = current_datetime.toString().replace(" ", "-").replace(":", "-");


        // TAKING SCREENSHOT
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        //SAVING SCREENSHOT
        FileUtils.copyFile(screenshotFile, new File("SeleniumTestNG/src/test/screenshots" + "screenshot_"+screenshot_filename_datetime + ".png"));
    }
}
