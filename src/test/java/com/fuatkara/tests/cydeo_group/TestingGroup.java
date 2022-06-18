package com.fuatkara.tests.cydeo_group;

import com.fuatkara.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestingGroup {

    @Test
    public void test1() throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.hepsiburada.com/");

        WebElement searchingBox = driver.findElement(By.xpath("//input[@class='desktopOldAutosuggestTheme-input']"));
        searchingBox.sendKeys("apple", Keys.ENTER);

        Thread.sleep(4000);//***

        String expectedTitle = "apple - Hepsiburada";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

        WebElement selectingProduct = driver.findElement(By.xpath("(//li[@class='productListContent-item'])[1]/following-sibling::li[2]"));
        selectingProduct.click();

        Thread.sleep(4000);//***

//        String actualTitle2 = driver.switchTo().window().getTitle();

        Set<String> allWindow = driver.getWindowHandles();

        for(String each: allWindow){
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: " + driver.getTitle());
        }

        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "iPhone 11 128 GB Fiyatı, Taksit Seçenekleri ile Satın Al";
        Assert.assertEquals(actualTitle2, expectedTitle2);

    }
}
