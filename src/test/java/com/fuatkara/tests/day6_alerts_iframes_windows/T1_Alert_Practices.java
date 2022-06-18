package com.fuatkara.tests.day6_alerts_iframes_windows;

import com.fuatkara.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1.Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //TC #1: Information alert practice
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alert_test1(){
        //3. Click to “Click for JS Alert” button
        WebElement elemClickJSAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        elemClickJSAlert.click();

        //To able to click to Alert OK button we need to switch driver's focus to Alert itself
        Alert alert = driver.switchTo().alert();

        //4. Click to OK button from the alert
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //Failure message will only be displayed if assertion fails
        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed");

        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText, expectedText, "Actual result is not as expected!!!");
    }


}
