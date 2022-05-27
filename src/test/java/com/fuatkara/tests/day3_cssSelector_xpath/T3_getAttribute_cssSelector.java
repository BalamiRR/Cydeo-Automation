package com.fuatkara.tests.day3_cssSelector_xpath;

import com.fuatkara.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args){
        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //WebElement loginButton = driver.findElement(By.className("login-btn"));

        //tagName[attribute='value']
        //input[class='login-btn']

        //WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
        //WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));
        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedButtonText = "Log In";
        String actualButton = signInButton.getAttribute("value");
        //Expected: Log In
        System.out.println("ActualButton " + actualButton);
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        if(actualButton.equals(expectedButtonText)){
            System.out.println("Log In button text verification passed!");
        }else{
            System.out.println("Log In button text verification failed!");
        }
        //PS2: Pay attention to where to get the text of this button from
    }
}
