package com.fuatkara.tests.day6_alerts_iframes_windows;

import com.fuatkara.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
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
        //2. Go to website: https://practice.cydeo.com/windows
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

        //5.Click to: "Click Here" link
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();

        actualTitle = driver.getTitle();
        System.out.println("Title after click : " + actualTitle);

        //6.Switch to new Window
        Set<String> allWindow = driver.getWindowHandles();
        //window handle 1 - main window
        //window handle 2 - 2nd window

        for(String each: allWindow){  // driver.getWindowHandles() direk yazabilirsin, getWindowHandles bize String dondurur
            driver.switchTo().window(each);// bize diger windowlardakini gosterir, clicke tikladiktan sonra baska sayfa aciliyor
            System.out.println("Current title while switching windows: " + driver.getTitle());
        }

        //7. Assert: Title is "New Window"
        String expectedAfterClick = "New Window";
        actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedAfterClick);
        System.out.println("Title after click : " + actualTitle);

        //If we want to go back to main page, we can use already stored main handle
        driver.switchTo().window(mainHandle);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
