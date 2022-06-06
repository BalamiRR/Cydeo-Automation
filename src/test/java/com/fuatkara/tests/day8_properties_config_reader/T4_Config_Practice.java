package com.fuatkara.tests.day8_properties_config_reader;

import com.fuatkara.utilities.ConfigurationReader;
import com.fuatkara.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {

//    public WebDriver driver;
//
//    @BeforeMethod
//    public void setupMethod(){
//        driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://www.google.com");
//    }

    @Test
    public void google_search_test(){
        //Driver.getDriver() --> driver
        Driver.getDriver().get("https://www.google.com");

        WebElement clickBut = Driver.getDriver().findElement(By.xpath("//button[@id='L2AGLb']"));
        clickBut.click(); // Google'da cookies aciliyor bu yuzden onu kabul etmek icin yazdim

        //3-Write "apple" in search box
        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        //4-Verify title:
        //Expected : apple - Google Search
        String expectedTitle = ConfigurationReader.getProperty("searchValue") + " - Recherche Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
