package com.selenium_NO_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookXpath {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();

        // by xpahts
        //        driver.get("http://facebook.com");
        //        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("g@gmail.com");
        //        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("test");
        //        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        // by css 
        driver.get("http://facebook.com");

        driver.findElement(By.cssSelector("#email")).sendKeys("test");
        driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
        //*[@id="login_form"]/table/tbody/tr[3]/td[2]/div/a
        driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
        //        //driver.findElement(By.cssSelector("input[name='email']")).sendKeys("x@gmail.com");
        //        driver.findElement(By.cssSelector("input#email")).sendKeys("My test");
        //
        //        //driver.findElement(By.cssSelector("input[tabindex='2']")).sendKeys("password");
        //        driver.findElement(By.cssSelector("input#pass")).sendKeys("pass");
        //        driver.findElement(By.cssSelector("input[type='submit']")).click();
        //
        //        System.out.println(driver.findElement(By.cssSelector("div[class='_4rbf _53ij']")).getText());
        //        driver.findElement(By.id("email")).sendKeys("myTest");
        //        driver.findElement(By.id("pass")).sendKeys("test");
        //        driver.findElement(By.linkText("Forgot account?")).click();
        //driver.findElement(By.xpath("//input[@value='Log In']")).click();
        // FINDING CSS WITH INPUT AND ID: SYNTAX tagname#id - example on facebook login page: input#username
        // finding CSS with class name: tagname.classname : example: input.'input r4 wide mb16 mt8 username'


        //input[@type='email']
        //input[@data-type='text']
        //input[@name='reg_passwd__']



        //input[@value='Log In']
        System.out.println("Page Title:" + driver.getTitle());
        //System.out.println("Page Source:" + driver.getPageSource());
        driver.quit();
    }

}
