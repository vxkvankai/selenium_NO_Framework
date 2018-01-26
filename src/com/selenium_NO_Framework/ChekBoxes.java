package com.selenium_NO_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChekBoxes {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://spicejet.com/");

        // validate weather the check box is selected or not
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());

        driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());



    }

}
