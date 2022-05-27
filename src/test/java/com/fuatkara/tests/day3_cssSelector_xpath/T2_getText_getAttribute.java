package com.fuatkara.tests.day3_cssSelector_xpath;

import com.fuatkara.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args){

        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //1- Open a chrome browser
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        WebElement elementRemember = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedValue = "Remember me on this computer";
        String actualRememberMeLabel = elementRemember.getText();

        if(actualRememberMeLabel.equals(expectedValue)){
            System.out.println("TRUE Remember Label!!");
        }else{
            System.out.println("FALSE Remember Label !!");
        }

        //Expected: Remember me on this computer
        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPass = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedPass = "Forgot";
        String actualPass = forgotPass.getText();

        if(actualPass.equals(expectedPass)){
            System.out.println("TRUE Password!");
        }else{
            System.out.println("ActualPassword = " + actualPass);
            System.out.println("ExpectedPassword = " + expectedPass);

            System.out.println("Forgot password link verification FAILED!!");
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes

        String expectedHref = "forgot_password=yes";
        String actualHrefAttribute = forgotPass.getAttribute("href");

        System.out.println("actualHrefAttribute = " + actualHrefAttribute);

        if(actualHrefAttribute.contains(expectedHref)){
            System.out.println("HREF attribute value verification PASSED!");
        }else{
            System.out.println("HREF attribute value verification FAILED!!");
        }
    }

}
