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

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver"); //need to define where the exe is


        driver = new ChromeDriver();
        driver.get("http://book.theautomatedtester.co.uk/");
        driver.getCurrentUrl();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testEcamplesGoHere() throws InterruptedException {

        sleep(5000); //I just put a sleep method to slow things down to see things happen
        List<WebElement> elements = ((FindsByLinkText) driver).findElementsByLinkText("Chapter1");
        Assert.assertEquals(1, elements.size());
    }

    private void sleep(int time) throws InterruptedException {
        Thread.sleep(time);
    }

}
