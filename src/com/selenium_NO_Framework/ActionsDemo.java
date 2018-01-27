package com.selenium_NO_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        Actions a = new Actions(driver);
        WebElement move = driver.findElement(By.id("twotabsearchtextbox"));
        String selecctAll = Keys.chord(Keys.CONTROL, "a");
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
            .sendKeys("hello test").sendKeys(selecctAll).contextClick().build().perform();
        // composite action to move to specific element
        // a.moveToElement(move).build().perform();



    }
}
