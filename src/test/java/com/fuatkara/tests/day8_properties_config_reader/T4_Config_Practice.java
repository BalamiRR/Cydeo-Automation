package com.fuatkara.tests.day8_properties_config_reader;

import com.fuatkara.utilities.ConfigurationReader;
import com.fuatkara.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }

    @Test
    public void google_search_test(){
        WebElement clickBut = driver.findElement(By.xpath("//button[@id='L2AGLb']"));
        clickBut.click(); // Google'da cookies aciliyor bu yuzden onu kabul etmek icin yazdim

        //3-Write "apple" in search box
        WebElement googleSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        //4-Verify title:
        //Expected : apple - Google Search
        String expectedTitle = ConfigurationReader.getProperty("searchValue") + "apple - Recherche Search";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
