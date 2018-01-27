package com.selenium_NO_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrangAndDrops {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://jqueryui.com/droppable/");


        //
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        Actions a = new Actions(driver);
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        a.dragAndDrop(drag, drop).build().perform();
        driver.quit();

    }
}
