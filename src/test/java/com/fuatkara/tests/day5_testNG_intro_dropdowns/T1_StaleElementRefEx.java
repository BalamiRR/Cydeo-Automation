package com.fuatkara.tests.day5_testNG_intro_dropdowns;

import com.fuatkara.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_StaleElementRefEx {

    public static void main(String[] args) {
        //XPATH PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: StaleElementReferenceException handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //3. Click to “Add Element” button
        WebElement clickAddElem = driver.findElement(By.xpath("//button[.='Add Element']"));  // xpath
        //WebElement clickAddElem = driver.findElement(By.tagName("button")); bu cssSelector
        clickAddElem.click();

        //4. Verify “Delete” button is displayed after clicking.
        System.out.println("verify delete "+ clickAddElem.isDisplayed() );

        //5. Click to “Delete” button.
        WebElement clickDelete = driver.findElement(By.xpath("//button[.='Delete']"));
        clickDelete.click();

        //6. Verify “Delete” button is NOT displayed after clicking.
        System.out.println("Verify : " + clickDelete.isDisplayed());

        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }

}
