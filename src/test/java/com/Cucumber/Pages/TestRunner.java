package com.Cucumber.Pages;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="F:\\SeleniumProject\\SeleniumFramework\\src\\test\\resources\\Sample.feature",
        glue={"Steps"},
        plugin={"html:target/html-report.html","json:target/json-report.json"}
)
public class TestRunner {
}
