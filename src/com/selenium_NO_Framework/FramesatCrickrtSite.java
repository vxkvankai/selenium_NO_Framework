package com.selenium_NO_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesatCrickrtSite {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        WebDriverWait d = new WebDriverWait(driver, 20);
        driver.get("https://fantasycricket.dream11.com/in/");
        System.out.println("Number of Frames: " + driver.findElements(By.tagName("iFrame")).size());


    }
}
