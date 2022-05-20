package com.fuatkara.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Linktext {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");
        //driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "No A/B Test";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("TRUE Title!");
        }else{
            System.out.println("FALSE Title!");
        }

        //Go back to home page
        driver.navigate().back();

        //Verify Title
        String expectedTitle2 = "Practice";
        actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle2)){
            System.out.println("Title verification PASSED !");
        }else{
            System.out.println("Title verification FAILED !");
        }
    }
}
