package com.fuatkara.tests.day5_testNG_intro_dropdowns;

import com.fuatkara.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_T6_Dropdown {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethods(){
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void dropdrown_t5() throws Exception{
        //TC #5: Selecting state from State dropdown and verifying result

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");

        //5. Select California
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);

        //6. Verify final selected option is California.
        String expectedOptCal = "California";
        String actualOptCal = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptCal,expectedOptCal);
        //Use all Select options. (visible text, value, index)
    }

    @Test
    public void dropdown_t6(){
        //TC #6: Selecting date on dropdown and verifying
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

        //3. Select “December 1st, 1923” and verify it is selected.
        Select dateDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        Select dateMonth = new Select(driver.findElement(By.xpath("//select=[@id='month']")));
        Select dateYear = new Select(driver.findElement(By.xpath("//select=[@id='year']")));

        //Select year using : visible text
        dateYear.selectByVisibleText("1923");

        //Select month using : value attribute
        dateMonth.selectByValue("11");

        //Select day using : index number
        dateDay.selectByIndex(0);
    }
}
