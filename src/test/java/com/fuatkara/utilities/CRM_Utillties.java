package com.fuatkara.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utillties {

    /*This method will log in with helpdesk1@cybertekschool.com
    user when it is called
    * */

    public static void crm_login(WebDriver driver, String username, String password){
        //3. Enter valid username
        WebElement entUser = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        entUser.sendKeys(username);

        //4. Enter valid password
        WebElement valPass = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        valPass.sendKeys(password);

        //5. Click to `Log In` button
        //WebElement clickLogIn = driver.findElement(By.xpath("//input[@type='submit']"));
        WebElement clickLogIn = driver.findElement(By.xpath("//input[@value='Log In']"));
        clickLogIn.click();
    }
}
