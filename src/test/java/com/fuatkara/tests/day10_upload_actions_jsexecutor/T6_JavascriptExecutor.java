package com.fuatkara.tests.day10_upload_actions_jsexecutor;

import com.fuatkara.utilities.BrowserUtils;
import com.fuatkara.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JavascriptExecutor {

    @Test
    public void javascript_executor_test(){
        //TC #6: Scroll using JavascriptExecutor
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        //((JavascriptExecutor)Driver.getDriver()).executeScript();
        //3- Use below JavaScript method and scroll*********** when we scroll it continues
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //a. 750 pixels down 10 times.
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleeping(2);
            js.executeScript("window.scrollBy(0, 750)");
        }


        //b. 750 pixels up 10 times
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleeping(2);
            js.executeScript("window.scrollBy(0, -750)");
        }

        //JavaScript method to use : window.scrollBy(0,0)
    }
}
