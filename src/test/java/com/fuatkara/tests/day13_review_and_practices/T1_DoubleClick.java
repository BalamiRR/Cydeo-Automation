package com.fuatkara.tests.day13_review_and_practices;

import com.fuatkara.pages.DoubleClickPage;
import com.fuatkara.utilities.Driver;
import org.testng.annotations.Test;

public class T1_DoubleClick {

    DoubleClickPage doubleClickPage = new DoubleClickPage();

    @Test
    public void t1_double_click_test(){
        //TC #1: Double Click Test
        //1. Go to
        //https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        //ck2

        //Cookies
        doubleClickPage.acceptCookies.click();

        //2. Switch to iframe.
        Driver.getDriver().switchTo().frame("iframeResult");

        //3. Double click on the text “Double-click me to change my text color.”
        doubleClickPage.textToDoubleClick.click();

        //4. Assert: Text’s “style” attribute value contains “red”.

    }


}
