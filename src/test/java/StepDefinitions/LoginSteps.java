package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside Step - user in on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - user_enters_username_and_password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - clicks_on_login_button");
	}

	@Then("user is navigated to the home pagex")
	public void user_is_navigated_to_the_home_pagex() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - user_is_navigated_to_the_home_pagex");
	}

}
