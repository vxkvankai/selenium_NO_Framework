package com.selenium_NO_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_Frame_Utility_Method {

    // ********     REWORK REWORK ORIGINAL WEBSITE DOES NOT HAVE RECHPTCHA. NEED TO FIND ANOTHER ONE TO WORK
    // try this instead: https://www.google.com/recaptcha/api2/demo

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fantasycricket.dream11.com/in/");
        //System.out.println("Size: " + driver.findElements(By.tagName("iframe")).size());
        //int number = switchToFrameUtility(number);
    }

    public void switchToFrameUtility(WebDriver driver, By by) {
        int i;
        int Franecount = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Size: " + driver.findElements(By.tagName("iframe")).size());
        for (i = 0; i < Franecount; i++) {
            driver.switchTo().frame(i);
            System.out.println("Size: " + driver.findElements(By.tagName("iframe")).size());
            int count = driver.findElements(by).size();
            if (count > 0) {
                //driver.findElement(by).click();
                break;
            } else {
                System.out.println("continue looping");
            }
        }
        driver.switchTo().defaultContent();
        //return i;
    }

}
