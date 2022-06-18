package com.fuatkara.tests.day5_testNG_intro_dropdowns;

import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass   //Butun sinif calismadan calisir
    public void setupMethod(){
        System.out.println("----> BeforeClass is running!");
    }

    @AfterClass  //Butun sinif yani butun methodlar calistiktan sonra en son bu yazar
    public void tearDownClass(){
        System.out.println("----> AfterClass is running!");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("---> BeforeMethod is running !!!");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println(" AfterMethod is running...");
    }

    @Test(priority = 1) //1.oncellikli calisacak method bu
    public void test1(){
        System.out.println("TEST 1 is running!!");
    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("TEST 2 is running");
    }
}

