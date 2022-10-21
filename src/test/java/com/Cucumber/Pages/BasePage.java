package com.Cucumber.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    WebDriver driver;
    public void driverSetUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
}
