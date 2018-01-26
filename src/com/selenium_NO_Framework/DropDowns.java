package com.selenium_NO_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDowns {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        driver.get("http://spicejet.com/");
        //select by id
        //Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        // Select by value
        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        //        s.selectByIndex(4);
        //        s.selectByValue("2");
        //        s.selectByVisibleText("6");

        // selecting from dynamic dropDowns xpath: first select the drop down itself and then in next step, select a particular element.

        //        driver.findElement(By.xpath("//input[@value='Departure City']")).click();
        //        driver.findElement(By.xpath("//a[@value='GOI']")).click();

        // **** CSS NOT WORKING _ RE WORK LATER
        // selecting from dynamic dropDowns CSS: first select the drop down itself and then in next step, select a particular element.
        //        driver.findElement(By.cssSelector("input[value='DEL']")).click();
        //        driver.findElement(By.cssSelector("a[value='GOI']")).click();
        // VERY IMPORTANT Dropdowns source and destination have same code *** 
        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='GOI']")).click();
        driver.findElement(By.xpath("(//a[@value='DED'])[2]")).click();

        //driver.findElement(By.xpath("//input[@id='Login']")).click();
        // Select by index using List Index
        //        Select listbox = new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Adult']")));
        //        listbox.selectByIndex(4);

        // driver.quit();

    }

}
