package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import io.cucumber.java.en.*;

public class SerachOnGoogle {

    // PageFactory
    // username
    @FindBy(id = "user-name")
    private WebElement usernameInput;

    // password
    @FindBy(id = "password")
    private WebElement passwordInput;

    // button login
    @FindBy(id = "login-button")
    private WebElement loginbuttonInput;

    WebDriver driver;

    // Constructor
    public SerachOnGoogle(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
        if (driver.getTitle().equals("SaucehhDemo")) {
        	throw new IllegalStateException("this is not login page not "+driver.getCurrentUrl());
        }
        
        
    }

    @Given("user is on google search page")
    public void user_is_on_google_search_page(String username,String pass) {
        System.out.println("Inside step -user_is_on_google_search_page******************************************************");

        // Apply WebDriverWait directly to wait for the username input to be clickable
        usernameInput.click();
        // Continue with the rest of the actions
        usernameInput.sendKeys(username);
        
        passwordInput.click();
        passwordInput.sendKeys(pass);

    }

	@When("user enters username and ")
	public void user_enters_username_and_validate() {
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

	@Then("user is navigated to the home pagexx")
	public void user_is_navigated_to_the_home_pagexx() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
		System.out.println("Inside Step - user_is_navigated_to_the_home_pagex");
	}
}
