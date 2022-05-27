package com.fuatkara.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class H1 {
//TC #1: Etsy Title Verification
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //1. Open Chrome browser
        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.wt-btn.wt-btn--filled.wt-mb-xs-0"))).click();

        //WebElement element = driver.findElement(By.className("wt-btn wt-btn--filled wt-mb-xs-0"));
        //element.click();

        //3. Search for “wooden spoon”
        WebElement searchForWooden = driver.findElement(By.name("search_query"));
        searchForWooden.sendKeys("wooden spoon" + Keys.ENTER);

        //4. Verify title:
        String actualTitle = driver.getTitle();
        String expectedTitle = "Wooden spoon | Etsy FR";

        //Expected: “Wooden spoon | Etsy”
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("TRUE Title");
        } else {
            System.out.println("FALSE Title");
        }
    }
}
