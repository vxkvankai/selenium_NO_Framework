package com.selenium_NO_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SslCertificatesHandling {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "libs/chromedriver");

        DesiredCapabilities ch = DesiredCapabilities.chrome();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);


        ChromeOptions c = new ChromeOptions();
        c.merge(ch);
        WebDriver driver = new ChromeDriver(c);
        driver.get("https://untrusted-root.badssl.com/");

        // Site with all kinds of bad certificates: https://cacert.org/ or https://badssl.com/  or https://revoked.grc.com/ or 


    }



}
