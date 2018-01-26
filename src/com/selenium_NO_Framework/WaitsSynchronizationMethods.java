package com.selenium_NO_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsSynchronizationMethods {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.alaskaair.com/");
        driver.findElement(By.xpath(".//a[@id='tab-hotels']")).click();

        driver.findElement(By.name("hotelOnlyToLocation")).sendKeys("NYC");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@citycode='6139058']")).click();
        //driver.findElement(By.name("hotelOnlyToLocation")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(("#FindHotels"))).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//a[@target='7362466']")).click();

        //*[@id="1000460"]/div[2]/div[1]/a

    }
}
