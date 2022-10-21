package com.Cucumber.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample extends BasePage{
    public Sample( WebDriver driver)
    {
        this.driver=driver;
    }
    public void navigateToURL()
    {
        driverSetUp();
        driver.get("https://google.com");
        driver.quit();
    }
}
