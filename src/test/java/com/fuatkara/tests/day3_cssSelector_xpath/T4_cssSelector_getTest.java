package com.fuatkara.tests.day3_cssSelector_xpath;

import com.fuatkara.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getTest {
    public static void main(String[] args){
        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));

        //Expected: Reset password
        String expectedResetPasswordButton = "Reset password";
        String actualResetPasswordButtonText = resetPasswordButton.getText();

        if(actualResetPasswordButtonText.equals(expectedResetPasswordButton)){
            System.out.println("Button text verification PASSED!!");
        }else{
            System.out.println("Button text verification FAILED!!");
        }
    }
}
