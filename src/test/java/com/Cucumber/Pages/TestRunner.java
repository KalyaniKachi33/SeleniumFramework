package com.Cucumber.Pages;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="F:\\SeleniumProject\\SeleniumFramework\\src\\test\\resources\\Sample.feature",
        glue={"Steps"}
)
public class TestRunner {
}
