package com.cucumber.utility;

import com.cucumber.stepdefinition.TestExecutor;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestExecutor{

	@Before (order=2)
	public void validatebeforescenario() {
		System.out.println("In pre condition1");
	}
	
	@Before (order=1)
	public void beforescenario2() {
		System.out.println("In pre condition2");
	}
	
	@After (order=2)
	public void validateafterscenario() {
		System.out.println("In after condition1");
	}
	
	@After (order=1)
	public void afterscenario2() {
		System.out.println("In after condition2");
	}
	
	@Before ({"@Regression"})
	public void test() {
		System.out.println("In pre condition for Regression");
	}

// Before annotation is used to run method before all testcase or scenarios
// After annotation is used to run method after all testcase or scenarios. It will run from last meaning first decending to assending. It will run in order from 3, 2 and then 1.
		
// Before ({"@Regression"}) is used to run that method before the required testcase or scenarios. It will be runned only for mentioned tag attribute.

// If we give Before or after annotation for any method, it will be runned each and every time for each testcase or scenario in each feature file if we run one feature file alone. If we run using TestRunner, then before and after annotation will not be considered or implemented.
	
// For example, we can give driver close step in after annotation because driver needs to be closed in all scenarios.
	

	
}
