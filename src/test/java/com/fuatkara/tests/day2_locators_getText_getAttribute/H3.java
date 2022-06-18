package com.fuatkara.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class H3 {
    public static void main(String[] args){
        //TC #3: Back and forth navigation

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //1- Open a chrome browser
        //2- Go to: https://google.com
        driver.get("https://google.com");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#L2AGLb.tHlp8d"))).click();

        //3- Click to Gmail from top right.
        WebElement gmailText = driver.findElement(By.linkText("Gmail"));
        gmailText.click();

        //4- Verify title contains:
        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";
        //Expected: Gmail
        if(actualTitle.contains(expectedTitle)){
            System.out.println("TRUE Title !");
        }else{
            System.out.println("FALSE Title !");
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();
        //6- Verify title equals:
        String actualGoogleTitle=  driver.getTitle();
        String expectedGoogleTitle = "Google";
        if(actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Google Title PASSED");
        }else{
            System.out.println("Google Title FAILED");
        }
        //Expected: Google
    }

}
