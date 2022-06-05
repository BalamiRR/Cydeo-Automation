package com.fuatkara.tests.day8_properties_config_reader;

import com.fuatkara.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    public WebDriver driver;

    BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("");
    }

    @Test
    public void order_name_verify_test(){
        //TC #1: Window Handle practice
        //1. Create new test and make set ups
        //2. Go to : https://www.amazon.com
        //3. Copy paste the lines from below into your class
        //4. Create a logic to switch to the tab where Etsy.com is open
        //5. Assert: Title contains “Etsy"

    }


}
