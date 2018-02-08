package com.selenium_NO_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableExcercisesFireFox {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/vamsik/Documents/github/Selenium_No_Framework/libs/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
    }


}
