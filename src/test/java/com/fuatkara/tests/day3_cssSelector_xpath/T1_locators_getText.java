package com.fuatkara.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//  son 46 dakika


public class T1_locators_getText {
    public static void main(String[] args){
        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        WebElement username = driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("av@info.com");

        //4- Enter incorrect password: “incorrect”
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("123Kf");

        //5- Click to login button.
        WebElement signInButton = driver.findElement(By.className("login-btn"));
        signInButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedError = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.

        if(actualErrorMessage.equals(expectedError)){
            System.out.println("TRUE Message!");
        }else{
            System.out.println("FALSE Message!");
        }

    }

}
