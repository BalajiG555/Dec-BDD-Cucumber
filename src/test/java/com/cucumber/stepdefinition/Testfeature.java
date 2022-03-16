package com.cucumber.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testfeature {
	
	@Given("User is in given statement")
	public void user_is_in_given_statement() {
	    System.out.println("in given statement");
	}

	@When("User is in when statement")
	public void user_is_in_when_statement() {
	    System.out.println("in when statement");
	}

	@Then("User is in then satement")
	public void user_is_in_then_satement() {
	    System.out.println("in then statement");
	}


}
