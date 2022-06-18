package com.fuatkara.pages;

import com.fuatkara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FavoriteList {

    public FavoriteList(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "listItemTitle")
    public WebElement listItem;

    @FindBy(className = "deleteProFromFavorites")
    public WebElement deleteFav;

    @FindBy(id = "watchList")
    public WebElement watchList;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/a[10]")
    public WebElement logOut;


}
