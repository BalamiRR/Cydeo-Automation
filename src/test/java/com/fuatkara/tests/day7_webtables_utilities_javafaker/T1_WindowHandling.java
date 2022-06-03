package com.fuatkara.tests.day7_webtables_utilities_javafaker;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_WindowHandling {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

    }

    @Test
    public void window_handling_test(){
        //TC #1: Window Handle practice
        //1. Create new test and make set ups
        //2. Go to : https://www.amazon.com
        WebDriver driver;
        //3. Copy paste the lines from below into your class
        //4. Create a logic to switch to the tab where Etsy.com is open
        //5. Assert: Title contains “Etsy”
    }
}
