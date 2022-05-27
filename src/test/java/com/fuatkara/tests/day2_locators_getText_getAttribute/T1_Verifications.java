package com.fuatkara.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Verifications {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //driver.get("https://practice.cydeo.com");

        driver.navigate().to("https://practice.cydeo.com");

        String expectedURl = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURl)){
            System.out.println("Expected is TRUE for URL");
        }else{
            System.out.println("Expected is FALSE for URL");
        }

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Expected is TRUE for Title");
        }else{
            System.out.println("Expected is FALSE for Title");
        }

        driver.close();
    }
}
