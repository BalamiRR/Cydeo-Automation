package com.fuatkara.tests.day4_findElements_checkboxes_radio;

import com.fuatkara.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args){
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        WebElement elementHome = driver.findElement(By.cssSelector("a[class='nav-link']"));

        WebElement elementHome2 = driver.findElement(By.cssSelector("a.nav-link")); // yukaridakiyle ayni anlama geliyor, "." nokta ise class demek yukaridaki class=''

        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header
        WebElement forgotPassword = driver.findElement(By.cssSelector("div.example > h2"));  // div'in icindeki ("." class demek) classin icindeki example al h2 ye yonel demek
        //yukaridakiyle ayni fakat xpath   Locate header using xpath, and using web elements text "Forgot Password"
        WebElement forgotPassword2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //Locate homelink using cssSelector, href value
        //c. “E-mail” text
        WebElement email = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement inputBox = driver.findElement(By.xpath("//input[@name='email']"));

        //Locate input box using xpath contains method
        //tagname[contains(@attribute,'value')]    contains methodu kullanicaz.
        WebElement inputBox2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        //e. “Retrieve password” button
        WebElement buttonRetrieve = driver.findElement(By.cssSelector("button.radius > i"));
        //button[@type='submit']
        //button[@class='radius']
        WebElement buttonRet = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        WebElement poweredBy = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.
        System.out.println("elementHome : " + elementHome.isDisplayed());
        System.out.println("elementHome2 : " + elementHome2.isDisplayed());
        System.out.println("homeLink_ex3 : " + homeLink_ex3.isDisplayed());
        System.out.println("forgotPassword : " + forgotPassword.isDisplayed());
        System.out.println("forgotPassword2 : " + forgotPassword2.isDisplayed());
        System.out.println("email : " + email.isDisplayed());
        System.out.println("inputBox : " + inputBox.isDisplayed());
        System.out.println("inputBox2 : " + inputBox2.isDisplayed());
        System.out.println("buttonRetrieve : " + buttonRetrieve.isDisplayed());
        System.out.println("buttonRet : " + buttonRet.isDisplayed());
        System.out.println("poweredBy : " + poweredBy.isDisplayed());

    }
}
