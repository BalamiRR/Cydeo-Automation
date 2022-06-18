package com.fuatkara.tests.day12_pom_design_explicit_wait;

import com.fuatkara.pages.LibraryLoginPage;
import com.fuatkara.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

    @BeforeMethod
    public void setupMethod(){
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com/");
        libraryLoginPage = new LibraryLoginPage();
    }

    @Test
    public void required_field_error_message_test(){
        //3- Do not enter any information
        //4- Click to “Sign in” button

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
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

        //Expected: Please enter a valid email address.
    }

    @Test
    public void librrary_negative_login_test(){
        //TC #3: Library negative login
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");

        //3- Enter incorrect username or incorrect password
        libraryLoginPage.inputUserName.sendKeys("wrong@username.com");
        libraryLoginPage.inputPassword.sendKeys("wrongpassword");

        libraryLoginPage.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password
        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());
        Driver.closeDriver();
    }
}
