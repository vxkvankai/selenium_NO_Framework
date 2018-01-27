package com.selenium_NO_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.alaskaair.com/");
        WebDriverWait d = new WebDriverWait(driver, 20);
        d.until(ExpectedConditions.elementToBeClickable(By.id("tab-hotels"))).click();
        d.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#findFlights"))).click();
        //driver.findElement(By.cssSelector("#findFlights")).sendKeys("NYC");
        d.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#hotelOnlyToLocation"))).sendKeys("NYC");
        //d.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#hotelOnlyToLocation"))).click();
        //d.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#li20_36_39487-0"))).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@citycode='6139058']")).click();
        driver.findElement(By.cssSelector(("#FindHotels"))).click();


    }


}
