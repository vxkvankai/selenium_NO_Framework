package com.selenium_NO_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayFooterLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        System.out.println(driver.getTitle());
        System.out.println("Count of Page links: " + driver.findElements(By.tagName("a")).size());
        WebElement footer = driver.findElement(By.xpath("//*[@id='hlGlobalFooter']"));
        System.out.println("Links in the Footer Section:"
            + driver.findElement(By.cssSelector("#gf-BIG > table > tbody > tr > td:nth-child(2) > ul")));
        System.out.println("footer.findElements(By.tagName('a')).size()");

        WebElement col = driver.findElement(By.cssSelector("#gf-BIG > table > tbody > tr > td:nth-child(2) > ul"));
        int c = col.findElements(By.tagName("a")).size();
        System.out.println("Links Count in he second column:" + col.findElements(By.tagName("a")).size());

        String BeforeClicking = driver.getTitle();
        String AfterClicking = driver.getTitle();

        for (int i = 0; i < col.findElements(By.tagName("a")).size(); i++) {
            //System.out.println(col.findElements(By.tagName("a")).get(i).getText());
            if (col.findElements(By.tagName("a")).get(i).getText().contains("Learn to sell")) {
                driver.findElement(By.linkText("Site map")).click();
                break;
            }

            //Assert.assertEquals(actual, expected);
        }

        System.out.println(driver.getTitle());

    }
}
