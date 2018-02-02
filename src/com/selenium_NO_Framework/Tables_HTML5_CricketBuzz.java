package com.selenium_NO_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables_HTML5_CricketBuzz {
    public void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.cricbuzz.com/");
        
    }

}
