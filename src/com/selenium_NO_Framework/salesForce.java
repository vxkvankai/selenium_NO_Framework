package com.selenium_NO_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesForce {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        // facebook login page
        //        driver.get("https://www.facebook.com/");
        //        //        driver.findElement(By.name("username")).sendKeys("my name");;
        //        //        driver.findElement(By.id("password")).sendKeys("password");
        //        //driver.findElement(By.id("Login")).click();
        //        driver.findElement(By.cssSelector("#email")).sendKeys("vamsi");;
        //        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("pass");
        //        driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();

        // salesforce login page
        //        driver.get("https://login.salesforce.com/");
        //        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Automation Architect");
        //        driver.findElement(By.cssSelector("#password")).sendKeys("test");
        //        driver.findElement(By.xpath("//*[@id='Login']")).click();
        //        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("123456");
        driver.findElement(By.name("pw")).sendKeys("123123123123");
        driver.findElement(By.xpath("//*[@type='submit']")).click();


        driver.quit();
    }



}
