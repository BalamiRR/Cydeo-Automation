package com.fuatkara.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    /* This method will accept int (in seconds) and execute Thread.sleep
    for given duration
    * */

    public WebDriver driver;

    public void sleep(int second){
        second *= 1000;
        try{
            Thread.sleep(second);
        }catch(InterruptedException e){

        }
    }

    public void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle){

        Set<String> allWindowsHandles = driver.getWindowHandles();

        for(String each:allWindowsHandles){
            driver.switchTo().window(each);
            System.out.println("Current URL : " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        //5. Assert: Title contains “Etsy”
        String actualEtsy = driver.getTitle();

        Assert.assertTrue(actualEtsy.contains(expectedInTitle));
    }

}
