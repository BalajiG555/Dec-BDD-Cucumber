package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cucumber.stepdefinition.TestExecutor;

public class RegistrationPage extends TestExecutor{
	
	public String Firstname = "//input[@placeholder='First Name']";
	public String Lastname = "//input[@placeholder='Last Name']";
	public String Address = "//textarea[@ng-model='Adress']";
	public String EmailAddress = "//input[@ng-model='EmailAdress']";

	public void enterfirstname (String fname) {
        com.entervalue(By.xpath(Firstname), fname);
	}
	
	public void enterlastname (String lname) {
		com.entervalue(By.xpath(Lastname), lname);
	}
	
	public void enteraddress (String adres) {
		com.entervalue(By.xpath(Address), adres);
			}
	
	public void enteremail (String Email) {
		com.entervalue(By.xpath(EmailAddress), Email);
}
	
}



