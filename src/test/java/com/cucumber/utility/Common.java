package com.cucumber.utility;

import org.openqa.selenium.By;

import com.cucumber.stepdefinition.TestExecutor;

public class Common extends TestExecutor{

	
	public void enterelementbyxpath (String xpath) {
		driver.findElement(By.xpath(xpath)).click();;
	}	
		
	public void enterelement (By locator) {
		driver.findElement(locator).click();;
	}

	public void entervalue (By locator, String value) {
		enterelement(locator);
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(value);
	}	

	
}
