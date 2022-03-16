package com.cucumber.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration_Test extends TestExecutor{

	@Given("User launches the chromebrowser and opwn the URL {string}")
	public void user_launches_the_chromebrowser_and_opwn_the_URL(String url) {
		OpenUrl(url);
	}

	@When("User enter the value in Firstname {string}")
	public void user_enter_the_value_in_Firstname(String firstname) {
		page.enterfirstname(firstname);
	}

	@When("User enter the value in Lastname {string}")
	public void user_enter_the_value_in_Lastname(String lastname) {
	    page.enterlastname(lastname);
	}

	@When("User enter the value in Address {string}")
	public void user_enter_the_value_in_Address(String address) {
	    page.enteraddress(address);
	}

	@When("User enter the value in Email {string}")
	public void user_enter_the_value_in_Email(String email) {
	    page.enteremail(email);
	}

	@Then("User validate the title of the page {string}")
	public void user_validate_the_title_of_the_page(String expecttitle) {
	    
	}

	@Given("User launches the chrome browser and opwn the URL {string}")
	public void user_launches_the_chrome_browser_and_opwn_the_URL(String string) {
	    
	}

	@When("User click Male radiobutton")
	public void user_click_Male_radiobutton() {
	    System.out.println("In male button");
	}

	@Then("User valid Male radiobutton is clicked")
	public void user_valid_Male_radiobutton_is_clicked() {
	    System.out.println("Male button clicked");
	}

	@Then("User valid Female radiobutton is clicked")
	public void user_valid_Female_radiobutton_is_clicked() {
	    System.out.println("Female button not clicked");
	}

	
	
}
