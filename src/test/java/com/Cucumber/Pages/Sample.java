package com.Cucumber.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

    public void navigateToURL()
    {
        System.setProperty("webdriver.chrome.driver" ,"D://driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.quit();
    }
}
