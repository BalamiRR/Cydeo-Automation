package com.fuatkara.pages;

import com.fuatkara.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchForProduct {

    public SearchForProduct(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id= "searchData")
    public WebElement iphone;
    
    @FindBy(className = "searchBtn")
    public WebElement searchButton;

    @FindBy(xpath = "//a[.='2']")
    public WebElement secondPage;

    @FindBy(xpath = "//span[@data-controlformid='addToWatchlistForm515317570']")
    public WebElement favoriteProduct;

    @FindBy(xpath = "//a[@title='Hesabım']")
    public WebElement account;

    @FindBy(xpath = "//a[@href='//www.n11.com/hesabim/istek-listelerim']")
    public WebElement myFavorites;

    @FindBy(className = "btnHolder")
    public WebElement okButton;
}
