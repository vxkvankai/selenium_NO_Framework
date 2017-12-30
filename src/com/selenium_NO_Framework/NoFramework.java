package com.selenium_NO_Framework;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.FindsByLinkText;

public class NoFramework {
    System.setProperty("webdriver.chrome.driver", "/Users/vamsik/Documents/workspace/chromedriver");
    
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void setUp() {


        driver.get("http://book.theautomatedtester.co.uk/");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testEcamplesGoHere() {
        List<WebElement> elements = ((FindsByLinkText) driver).findElementsByLinkText("Chapter1");
        Assert.assertEquals(1, elements.size());
    }



}
