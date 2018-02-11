package com.selenium_NO_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;

public class BrowserMaxCookiesScreenshots {
    public static void main(String[] args) //throws IOException 
    {
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //        driver.manage().deleteCookieNamed("test");
        //        driver.get("https://google.com");
        //        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //        FileUtils.copyFile(src, new File("/Users/vamsik/Desktop/TESTTESTTEST.txt"));
        WindowsUtils.killByName("/Applications/Microsoft Office 2008/Microsoft Excel.app/Contents/MacOS/Microsoft Excel");;



    }



}
