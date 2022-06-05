package com.fuatkara.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    //Name: returnOrderDate ()
    //• Return type: String
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //This method should accept a costumerName and return the costumer order date
    //as a String.

    //public static String returnOrderDate(WebDriver driver, String customerName){
        //String locator = "//td[.='"+ customerName +" ']/following-sibling::td[3]";
        //td[3] date oldugu kismi gosteriyor.
        //WebElement customerDateCell = driver.findElement(By.xpath(locator));
        //return customerDateCell.getText();
    //}

    //Yukaridaki returnOrderDate ile asagidaki ayni anlamda, asagidaki daha pratik
    public static String returnOrderDate(WebDriver driver, String customerName){
        return driver.findElement(By.xpath("//td[.='"+ customerName+"']/following-sibling::td[3]")).getText();
    }

    //Name: orderVerify ()
    //• Return type: void
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //• Arg3: String expectedOrderDate

    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate){
        WebElement customerDetail = driver.findElement(By.xpath("//td[.='"+ customerName+"']/following-sibling::td[3]"));

        String actualDateCell = customerDetail.getText();

        Assert.assertEquals(actualDateCell, expectedOrderDate);
    }

}
