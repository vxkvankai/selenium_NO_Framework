package com.selenium_NO_Framework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBetweenBrowserChildTabs {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        System.out.println("Befor swtiching");
        driver.get("https://accounts.google.com/SignUp?hl=en-GB");
        driver.findElement(By.linkText("Learn more")).click();
        System.out.println("First Tab tilte: " + driver.getTitle());
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentid = it.next();
        String childid = it.next();

        //        NEEDS REWORK ON THIRD TAB

        driver.switchTo().window(childid);
        System.out.println("Second Tab title: " + driver.getTitle());

        driver.findElement(By.linkText("Google Privacy Policy")).click();

        //  **** SWITCHING TO THIRD CHILD TAB
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);

        }


        for (String winHale4 : driver.getWindowHandles()) {
            driver.switchTo().window(winHale4);
            driver.findElement(By.linkText("Read our Terms of Service"));

        }



        driver.getTitle();



        driver.switchTo().window(parentid);
        System.out.println("After Switching back to Parent Tab: " + driver.getTitle());
        driver.quit();
    }


}
