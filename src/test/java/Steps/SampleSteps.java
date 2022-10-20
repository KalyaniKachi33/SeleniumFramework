package Steps;

import com.Cucumber.Pages.Sample;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSteps extends Sample {
    Sample S;
    @Given("User enters URL in the browser")
    public void user_enters_url_in_the_browser() {
//        S.navigateToURL();
        System.setProperty("webdriver.chrome.driver" ,"D://driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.quit();
    }
    @Then("User enters search keyword")
    public void user_enters_search_keyword() {


    }


}
