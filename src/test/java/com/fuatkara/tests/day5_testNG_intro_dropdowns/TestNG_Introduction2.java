package com.fuatkara.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Introduction2 {

    @Test(priority = 1)
    public void test1(){
        System.out.println("Test 1 is running..");

        //Assert Equals : compare 2 of the same things
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("Test 2 is running..");

        //Assert Equals : compare 2 of the same things
        String actual = "apple";
        String expected = "apple2";

        Assert.assertTrue(actual.equals(expected));
    }
}
