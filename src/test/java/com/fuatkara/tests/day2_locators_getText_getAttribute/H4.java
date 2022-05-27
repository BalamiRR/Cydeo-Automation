package com.fuatkara.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H4 {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        WebElement linkHome = driver.findElement(By.className("nav-link"));
        linkHome.click();

        //4- Verify title is as expected:
        String actualTitleHome = "Practice";
        String expectedTitleHome = driver.getTitle();

        //Expected: Practice
        if(actualTitleHome.equals(expectedTitleHome)){
            System.out.println("Title PASSED !");
        }else {
            System.out.println("Title FALSE !");
        }
        //PS: Locate “Home” link using “className” locator



    }
}
