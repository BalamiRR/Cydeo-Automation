package com.fuatkara.tests.day11_actions_jsexecutor_practice;

import com.fuatkara.pages.LibraryLoginPage;
import com.fuatkara.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;
    @Test
    public void required_field_error_message_test(){
        //TC #1: Required field error message test
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com/");

        //3- Do not enter any information
        //4- Click to “Sign in” button
        libraryLoginPage = new LibraryLoginPage();

        libraryLoginPage.signInButton.click();

        //5- Verify expected error is displayed:
        //Expected: This field is required.
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

        Driver.closeDriver();
    }

    @Test
    public void invalid_email_format_error_message_text(){
        //TC #2: Invalid email format error message test
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");

        //3- Enter invalid email format
        libraryLoginPage = new LibraryLoginPage();

        libraryLoginPage.inputUserName.sendKeys("somethingwrong");

        //4- Verify expected error is displayed:


        //Expected: Please enter a valid email address.
    }

}
