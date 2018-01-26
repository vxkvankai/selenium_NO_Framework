package com.selenium_NO_Framework;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.FindsByLinkText;

public class TestExample {


    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("http://book.theautmatedtester.co.uk/chapter1");

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testExamplesGoHere() {
        List<WebElement> elements = ((FindsByLinkText) driver).findElementsByLinkText("Chapter1");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertEquals(1, elements.size());

    }


}
