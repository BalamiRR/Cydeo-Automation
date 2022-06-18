package com.fuatkara.pages;

import com.fuatkara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginIn {

    public LoginIn(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='btnSignIn']")
    public WebElement homeLogIn;

    @FindBy(xpath = "//div[@class='facebook_large medium facebookBtn  btnLogin']")
    public WebElement fbLogin;

    @FindBy(xpath = "//button[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")
    public  WebElement cookiesButton;

    @FindBy(xpath = "//div[@class='l9j0dhe7 du4w35lb j83agx80 pfnyh3mw taijpn5t bp9cbjyn owycx6da btwxx1t3 kt9q3ron ak7q8e6j isp2s0ed ri5dt5u2 rt8b4zig n8ej3o3l agehan2d sk4xxmp2 rq0escxv d1544ag0 tw6a2znq s1i5eluu qypqp5cg']")
    public WebElement continueAsUser;

    @FindBy(id = "email")
    public WebElement inputMailAddress;

    @FindBy(id = "pass")
    public WebElement inputMailPassword;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement logInButton;

    //        WebElement inputMailAddress = Driver.getDriver().findElement(By.id("email"));
//        inputMailAddress.sendKeys("voodoocult95@gmail.com");
//
//        WebElement inputMailPassword = Driver.getDriver().findElement(By.id("pass"));
//        inputMailPassword.sendKeys("123456Kf");

//        WebElement logInButton = Driver.getDriver().findElement(By.xpath("//input[@name='login']"));
//        logInButton.click();

}
