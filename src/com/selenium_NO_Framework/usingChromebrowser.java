package com.selenium_NO_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class usingChromebrowser {



    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver"); //need to define where the exe i
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.getCurrentUrl();

        driver.findElement(By.id("email")).sendKeys("test");
        driver.findElement(By.name("pass"));
        driver.findElement(By.linkText("Forgot account?")).click();
        driver.getCurrentUrl();


    }

}
