package com.fuatkara.tests.day7_webtables_utilities_javafaker;

import com.fuatkara.utilities.BrowserUtils;
import com.fuatkara.utilities.CRM_Utillties;
import com.fuatkara.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void crm_login_test(){

        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        //helpdesk1@cybertekschool.com  UserUser
        //Helpdesk2@cybertekschool.com  UserUser

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //5. Click to Log In button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "Portal");
    }

    @Test
    public void crm_login_test2(){
        //TC #3: Login scenario
        //1. Create new test and make set ups
        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        //Calling my utility method to login helpdesk1
        CRM_Utillties.crm_login(driver, "helpdesk1@cybertekschool.com", "password");

        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "Portal");
    }

    @Test
    public void crm_login_test3(){
        //TC #3: Login scenario
        //1. Create new test and make set ups
        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        //Calling my utility method to login helpdesk1
        CRM_Utillties.crm_login(driver, "helpdesk2@cybertekschool.com", "password");

        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "(2) Portal");
    }
}
