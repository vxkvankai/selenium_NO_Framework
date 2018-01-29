package com.selenium_NO_Framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        WebDriverWait d = new WebDriverWait(driver, 20);
        driver.get("https://www.path2usa.com/travel-companions");
        //driver.findElement(By.id("travel_date")).click();
        driver.findElement(By.xpath(".//*[@id='travel_date']")).click();


        //        COMMENTED RAHUL'S ORIGINAL CODE WHICH LOOKS FOR "MAY"
        //            while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
        //                    .contains("May")) AND TRIED TO SEARCH FOR "January 2020" as follows
        while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
            .contains("January 2020"))

        {
            d.until(ExpectedConditions.elementToBeClickable(By.cssSelector(("[class='datepicker-days'] th[class='next']"))));
            driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();

        }

        List<WebElement> dates = driver.findElements(By.className("day"));
        int count = driver.findElements(By.className("day")).size();

        for (int i = 0; i < count; i++) {
            String text = driver.findElements(By.className("day")).get(i).getText();

            if (text.equalsIgnoreCase("21")) {
                driver.findElements(By.className("day")).get(i).click();
            }


        }



    }
}
