package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import java.time.Duration;

import org.junit.runner.RunWith;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features",
    glue = {"StepDefinitions"},
    monochrome = true,
    tags = "@Googletest",
    plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"}
)
public class GoogleSearchSteps {

    static WebDriver driver;

    @Given("browser is open")
    public void browser_is_open() {
        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:/Users/sswayah/AppData/Local/Mozilla Firefox/firefox.exe");

        driver = new FirefoxDriver(options);
        driver.get("https://saucedemo.com/");
        driver.manage().window().maximize();
    }

    @When("^user enters (.*) and (.*)$")
    public void user_is_on_google_search_page2( String username, String pass) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("user-name")));
    	SerachOnGoogle serach = new SerachOnGoogle(driver);
        serach.user_is_on_google_search_page(username,pass);
//        serach.usernameInput.sendKeys(username);

//        WebElement passwordInput = driver.findElement(By.id("password"));
//        passwordInput.click();
//        passwordInput.sendKeys(pass);
    }
    @And("hits enter")
    public void hits_enter() {
    	SerachOnGoogle serach = new SerachOnGoogle(driver);
//        WebElement loginbuttonInput = driver.findElement(By.id("login-button"));
//        loginbuttonInput.click();
    	serach.user_enters_username_and_validate();
    	driver.close();
    	
    }
//    @Then("close")
//    public void close(){
//    	SerachOnGoogle serach = new SerachOnGoogle(driver);
//    	serach.user_is_navigated_to_the_home_pagexx();
//    }

    // Other steps (And, Then, etc.) can be added here
}
