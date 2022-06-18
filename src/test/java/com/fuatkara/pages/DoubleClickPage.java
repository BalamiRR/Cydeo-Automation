package com.fuatkara.pages;

import com.fuatkara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoubleClickPage {

    public DoubleClickPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "demo")
    public WebElement textToDoubleClick;

    @FindBy(id = "accept-choices")
    public WebElement acceptCookies;
}
