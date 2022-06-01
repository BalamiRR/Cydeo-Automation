package com.fuatkara.tests.day6_alerts_iframes_windows;

import com.fuatkara.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1.Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //TC #1: Information alert practice
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_window_test(){
        //Storing the main page's window handle as string is
        //good practice for future re-usable purposes
        String mainHandle = driver.getWindowHandle();

        System.out.println("mainHandle = " + mainHandle);

        //4. Assert : Title is "Windows"
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

}
