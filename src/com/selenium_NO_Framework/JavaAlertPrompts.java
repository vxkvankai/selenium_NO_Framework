package com.selenium_NO_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlertPrompts {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.cssSelector(".display>form>input")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();


    }
}
