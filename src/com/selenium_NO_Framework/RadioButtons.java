package com.selenium_NO_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        int count = driver.findElements(By.xpath("//input[@name='group1']")).size();

        for (int i = 0; i < count; i++)

        {
            //System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
            //String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
            String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");

            // text==("Cheese") did not work, so we ended up using sting.equal function

            if (text.equals("Cheese")) {
                driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
                System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).isSelected());

            }

        }



    }

}
