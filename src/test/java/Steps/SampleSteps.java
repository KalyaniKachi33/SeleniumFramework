package Steps;

import com.Cucumber.Pages.Sample;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSteps {
    WebDriver driver = null;
    Sample S;
    @Given("User enters URL in the browser")
    public void user_enters_url_in_the_browser() {
        S = new Sample(driver);
        S.navigateToURL();
    }

    @Then("User enters search keyword")
    public void user_enters_search_keyword() {

    }
}
