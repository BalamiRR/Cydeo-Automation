package com.fuatkara.tests.day10_upload_actions_jsexecutor;

import com.fuatkara.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void registration_form_test(){
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get("https://practice.cydeo.com/registration_form");

        //3. Enter first name
        Driver.getDriver()
                .findElement(By.xpath("//input[@name='firstname']"))
                .sendKeys("Fuat");

        //4. Enter last name
        Driver.getDriver()
                .findElement(By.xpath("//input[@name='lastname']"))
                .sendKeys("KARA");

        //5. Enter username
        Driver.getDriver()
                .findElement(By.xpath("//input[@name='username']"))
                .sendKeys("BalamiRR");

        //6. Enter email address
        Driver.getDriver()
                .findElement(By.xpath("//input[@name='email']"))
                .sendKeys("BalamiRR");

        //7. Enter password
        Driver.getDriver()
                .findElement(By.xpath("//input[@name='password']"))
                .sendKeys("BalamiRR");

        //8. Enter phone number
        Driver.getDriver()
                .findElement(By.xpath("//input[@name='phone']"))
                .sendKeys("BalamiRR");

        //9. Select a gender from radio buttons
        WebElement genderR = Driver.getDriver().findElement(By.xpath("input[@value='male'"));

        //10. Enter date of birth
        Driver.getDriver()
                .findElement(By.xpath("//input[@name='birthday']"))
                .sendKeys("BalamiRR");

        //11. Select Department/Office
        Select department = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));

        //12. Select Job Title
        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));

        //13. Select programming language from checkboxes
        Select progLang = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='inlineCheckbox2']")));

        //14. Click to sign up button
        WebElement clickSignUp = Driver.getDriver().findElement(By.xpath("//@id='wooden_spoon'"));
        clickSignUp.click();

        //15. Verify success message “You’ve successfully completed registration.” is
        //displayed.
        String expectedMessage = "You’ve successfully completed registration.";
        String actualMessage = Driver.getDriver().getTitle();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
