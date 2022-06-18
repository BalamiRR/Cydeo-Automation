package com.fuatkara.tests.cydeo_group;

import com.fuatkara.pages.FavoriteList;
import com.fuatkara.pages.LoginIn;
import com.fuatkara.pages.SearchForProduct;
import com.fuatkara.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class N11 {

    LoginIn loginIn = new LoginIn();
    SearchForProduct searchForProduct = new SearchForProduct();
    FavoriteList favoriteList = new FavoriteList();

    @BeforeMethod
    public void setupMethod(){
        //www.n11.com sitesi açılır.
        Driver.getDriver().get("https://www.n11.com/");
    }

    @Test
    public void n11_test(){
        //Check that the main page is opened
        String actualMainPage = Driver.getDriver().getCurrentUrl();
        String expectedMainPage = "https://www.n11.com/";

        Assert.assertEquals(actualMainPage,expectedMainPage);

        //Login to the website.
        loginIn.homeLogIn.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //facebook login button
        loginIn.fbLogin.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String homePage = Driver.getDriver().getWindowHandle();
        Set<String> allWindow = Driver.getDriver().getWindowHandles();
        for(String each : allWindow){
            Driver.getDriver().switchTo().window(each);
        }

        //Accepting cookies
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginIn.cookiesButton.click();

        //email address and password
        loginIn.inputMailAddress.sendKeys("voodoocult95@gmail.com");
        loginIn.inputMailPassword.sendKeys("123456Kf");
        loginIn.logInButton.click();

        //Continue to as a user button
        //n11LoginIn.continueAsUser.click();

        //Go back to Home Page
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().switchTo().window(homePage);

        //Search for Iphone product
        searchForProduct.iphone.sendKeys("Iphone");
        searchForProduct.searchButton.click();

        //It is checked that the word iphone is searched
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actualIphoneSearch = Driver.getDriver().getTitle();
        String expectedIphoneSearch = "Iphone - n11.com";

        Assert.assertEquals(actualIphoneSearch, expectedIphoneSearch);

        //The 2nd page opens
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchForProduct.secondPage.click();

        //It is checked that the 2nd page opens
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actualSecondPage = Driver.getDriver().getTitle();
        String expectedSecondPage = "Iphone - n11.com - Sayfa 2";

        Assert.assertEquals(actualSecondPage, expectedSecondPage);

        //The 3rd product on the page is added to favourites
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchForProduct.favoriteProduct.click();

        //The pop-up window (product is in your favorites list)
        //if the product is exist then click on ok button
//        if(searchForProduct.favoriteProduct != null){
//            searchForProduct.okButton.click();
//        }
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchForProduct.okButton.click();

        //Go to My Account -> My Favorites / My Lists
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(searchForProduct.account).perform();
        searchForProduct.myFavorites.click();

        //Check that the "My Favorites" page is opened.
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actualFavoritePage = Driver.getDriver().getTitle();
        String expectedFavoritePage = "İstek Listem - n11.com";

        Assert.assertEquals(actualFavoritePage, expectedFavoritePage);

        //All added product is deleted from Favorites List and verify the deletion is checked.
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        favoriteList.listItem.click();
        favoriteList.deleteFav.click();

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchForProduct.okButton.click();

        //Log Out
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(favoriteList.watchList));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        actions.moveToElement(searchForProduct.account).perform();
        favoriteList.logOut.click();
    }
}

