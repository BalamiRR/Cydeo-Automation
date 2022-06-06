package com.fuatkara.tests.day10_upload_actions_jsexecutor;

import com.fuatkara.utilities.ConfigurationReader;
import com.fuatkara.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void registration_form_test(){
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));  //configuration.properties'den bak

        //Create Java Faker object
        Faker faker = new Faker();

        //3. Enter first name
//        Driver.getDriver()
//                .findElement(By.xpath("//input[@name='firstname']"))   Ben yaptim
//                .sendKeys("Fuat");
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        String fakerFirstName = faker.name().firstName();
        inputFirstName.sendKeys(fakerFirstName);

        //4. Enter last name
//        Driver.getDriver()
//                .findElement(By.xpath("//input[@name='lastname']"))
//                .sendKeys("KARA");
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

        //5. Enter username
//        Driver.getDriver()
//                .findElement(By.xpath("//input[@name='username']"))
//                .sendKeys("BalamiRR");
        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
//      inputUserName.sendKeys(faker.name().username().replaceAll(".", ""));
        String user = faker.bothify("helpdesk###");
        inputUserName.sendKeys(user);

//        //6. Enter email address
//        Driver.getDriver()
//                .findElement(By.xpath("//input[@name='email']"))
//                .sendKeys("BalamiRR");
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user + "@gmail.com");

//      7. Enter password
//      Driver.getDriver()
//            .findElement(By.xpath("//input[@name='password']"))
//            .sendKeys("BalamiRR");
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.numerify("########"));
        System.out.println("faker.internet().password() = " + faker.internet().password());

//      //8. Enter phone number
//        Driver.getDriver()
//                .findElement(By.xpath("//input[@name='phone']"))
//                .sendKeys("BalamiRR");
        //8. Enter phone number
        WebElement phoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.numerify("###-###-####"));

//        //9. Select a gender from radio buttons
//        WebElement genderR = Driver.getDriver().findElement(By.xpath("input[@value='male'"));
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        inputGender.click();
//        //10. Enter date of birth
//        Driver.getDriver()
//                .findElement(By.xpath("//input[@name='birthday']"))
//                .sendKeys("BalamiRR");
        WebElement inputBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        //faker.number().numberBetween(2004,1920);
        inputBirthday.sendKeys("03/08/2000");

        //11. Select Department/Office
        Select selDepartment = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        selDepartment.selectByIndex(faker.number().numberBetween(1,9));

        //12. Select Job Title
        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
//
//        //13. Select programming language from checkboxes
//        Select progLang = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='inlineCheckbox2']")));
//
//        //14. Click to sign up button
//        WebElement clickSignUp = Driver.getDriver().findElement(By.xpath("//@id='wooden_spoon'"));
//        clickSignUp.click();
//
//        //15. Verify success message “You’ve successfully completed registration.” is
//        //displayed.
//        String expectedMessage = "You’ve successfully completed registration.";
//        String actualMessage = Driver.getDriver().getTitle();
//
//        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
