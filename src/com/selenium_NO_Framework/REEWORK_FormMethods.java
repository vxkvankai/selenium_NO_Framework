package com.selenium_NO_Framework;

import org.testng.Assert;

/// @@@@@@@@ RE WORK - SECTION 7 LECTURE 58 *******************
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class REEWORK_FormMethods {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.cssSelector("#hp-widget__return")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.cssSelector("#hp-widget__return")).isDisplayed());
        System.out.println("Befor clicking the milti city button");
        driver.findElement(By.cssSelector("#hp-widget__return")).isDisplayed();
        System.out.println("After clicking the multi city button");

        System.out.println(driver.findElement(By.cssSelector("#hp-widget__return")).isDisplayed());


    }

}
