package com.fuatkara.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableUtils {

    //Name: returnOrderDate ()
    //• Return type: String
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //This method should accept a costumerName and return the costumer order date
    //as a String.

    public static String returnOrderDate(WebDriver driver, String customerName){
        String locator = "//td[.='"+ customerName +" ']/following-sibling::td[3]";
        //td[3] date oldugu kismi gosteriyor.
        WebElement customerDateCell = driver.findElement(By.xpath(locator));
        return customerDateCell.getText();
    }
    //Yukaridaki returnOrderDate ile asagidaki ayni anlamda, asagidaki daha pratik
    public static String returnOrderDate2(WebDriver driver, String customerName){
        return driver.findElement(By.xpath("//td[.='"+ customerName +" ']/following-sibling::td[3]")).getText() ;
    }
}
