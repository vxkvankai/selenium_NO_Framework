package com.selenium_NO_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailFieldDownAutoSuggestionHandling {


    // Code to grab the email 'AS@yahoo.com' from the email suggestions made by website when i type 'AS' sting into emailid field
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wd = new WebDriverWait(driver, 5);
        driver.get("https://fantasycricket.dream11.com/IN/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(".//input[@id='m_rtxtEmail1']")).sendKeys("AS");
        wd.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(.//*[@id='m_frmRegister']/div[1]/ul")));
        driver.findElement(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul/li[2]/p")).click();


    }

}
