

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import io.cucumber.java.en.*;

public class SerachOnGoogle_POM {

    // PageFactory
    // username
/*    @FindBy(id = "user-name")
    private WebElement usernameInput;

    // password
    @FindBy(id = "password")
    private WebElement passwordInput;

    // button login
    @FindBy(id = "login-button")
    private WebElement loginbuttonInput;

    WebDriver driver;

    // Constructor
    public SerachOnGoogle_POM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Given("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("Inside step -user_is_on_google_search_page");

        // Apply WebDriverWait directly to wait for the username input to be clickable

    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("user-name")));

        // Perform the click action after the wait
        usernameInput.click();

        // Continue with the rest of the actions
        usernameInput.sendKeys("standard_user");

        passwordInput.click();
        passwordInput.sendKeys("secret_sauce");

        loginbuttonInput.click();
        System.out.println("Inside step -user_is_on_google_search_pagehhhhhhhhhhhhhhhhhhhhhhhhhhhhh");

        // Add assertions here to verify the login was successful
        // Assertions.assertTrue(/* Add condition to check if login was successful );
    }

	@When("user enters username and ")
	public void user_enters_username_and() {
        loginbuttonInput.click();
        System.out.println("Inside step -user_is_on_google_search_pagehhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - user_enters_username_and_password");
	}

	@And("clicks on login ")
	public void clicks_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - clicks_on_login_button");
	}

//	@Then("user is navigated to the home pagexx")
//	public void user_is_navigated_to_the_home_pagexx() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.close();
//		System.out.println("Inside Step - user_is_navigated_to_the_home_pagex");
//	}
}*/
