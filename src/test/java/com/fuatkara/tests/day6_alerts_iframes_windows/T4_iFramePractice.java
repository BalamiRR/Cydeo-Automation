package com.fuatkara.tests.day6_alerts_iframes_windows;

import com.fuatkara.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_iFramePractice {

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
            driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void iframe_test(){
        //switching to iframe using id attribute value
        driver.switchTo().frame("mce_0_ifr");

        //option #2 passing index number of iframe
        //driver.switchTo().frame(0);

        //option 3 locate as web element and pass in frame() method
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //locate the p tag
        WebElement yourContentGoesHere = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHere.isDisplayed());

        //Verify "An iFrame containing the TinyMCE WYSWING Editor"
        //To be able to verify the header, we must switch back to "main HTML"
        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        //assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed());

    }

}
