package com.fuatkara.tests.day1_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        //1- Set up the "browser driver"
        WebDriverManager.chromedriver().setup();
        //2- Create instance of the Selenium WebDriver
        //This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //This line will maximize the browser size
        driver.manage().window().maximize();

        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("Current Title : " + currentTitle);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL : " + currentUrl);

        //Stoop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back (previous page)
        driver.navigate().back();

        Thread.sleep(3000);

        //use selenium to navigate forward (next page)
        driver.navigate().forward();

        // use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use navigate().to()
        driver.navigate().to("https://www.google.com");

        //get the current title after getting the google page
        currentTitle = driver.getTitle();

        //System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("currentTitle = " + currentTitle);

        //Get the current URL using Selenium
        currentUrl = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentUrl);

        //this will close the currently opened window
        driver.close();

        //this will close all of the opened windows
        driver.quit();
    }
}







