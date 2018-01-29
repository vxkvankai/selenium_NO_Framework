package com.selenium_NO_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// REWORK - SECTION 10 - LECTURE 82 - PENDING ADDITIONS: little advanceD if i add if, pre and post validations, which will be added
// in next rework.


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


        }

        System.out.println(driver.getTitle());
        driver.switchTo().defaultContent();


    }

}


//*************** ORIGINAL CODE
//
//import junit.framework.Assert;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//
//public class Exerc {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//
//        WebDriver driver=new FirefoxDriver();
//        driver.get("http://www.ebay.com/");
//        //Count of the Link in the Entire Page
//    //  System.out.println("Links in the Page");
//    //System.out.println(driver.findElements(By.tagName("a")).size());
//    //Count of links in the footer section of the page
//    WebElement footer=driver.findElement(By.xpath(".//*[@id='glbfooter']"));
//    //System.out.println("Links in the footer section");
//    //System.out.println(footer.findElements(By.tagName("a")).size());
//    WebElement col=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
//    //System.out.println("Links in the 2nd coloumn of the section");
//    //System.out.println(col.findElements(By.tagName("a")).size());
//    String Beforeclicking = null;
//    String Afterclicking;
//    for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
//    {
//    
//        
//        if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
//        {
//            Beforeclicking = driver.getTitle();
//        
//            col.findElements(By.tagName("a")).get(i).click();
//            break;
//            }
//    }
//    Afterclicking =driver.getTitle();
//    if(Beforeclicking!=Afterclicking)
//    {
//        if(driver.getPageSource().contains("sitemap"))
//    
//            System.out.println("PASS");
//    }
//    else
//    {
//        System.out.println("FAIL");
//    }
//        
//}
//                       
//    }
//
//
