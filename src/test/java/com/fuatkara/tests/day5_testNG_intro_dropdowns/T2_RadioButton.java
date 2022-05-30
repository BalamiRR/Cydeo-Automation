package com.fuatkara.tests.day5_testNG_intro_dropdowns;

import com.fuatkara.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
//2:51:00
public class T2_RadioButton {
    public static void main(String[] args) throws Exception{
        //XPATH PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //3. Click to “Hockey” radio button
        WebElement clickHockey = driver.findElement(By.xpath("//input[@id='hockey']"));
        clickHockey.click();
        Thread.sleep(2000);

        //4. Verify “Hockey” radio button is selected after clicking.
        System.out.println("Hockey is selected " + clickHockey.isSelected());

        //Or we can write as well below
        if(clickHockey.isSelected()){
            System.out.println("PASSED!!!");
        }else{
            System.out.println("FAILED!!!");
        }
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
