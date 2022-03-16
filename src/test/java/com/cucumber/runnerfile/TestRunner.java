package com.cucumber.runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)	
@CucumberOptions (features = "D:\\Dec_BDD_Cucumber\\src\\test\\java\\com\\cucumber\\feature",
                  glue = "com.cucumber.stepdefinition", 
                  plugin = {"pretty", "html:TestOutput/CucumberReport"},
                  tags = {"@Regression"},
                  dryRun = true, // dryRun will check the unimplemented steps in feature before execution
                  monochrome = true)  // monochrome is used to display console in proper readable format


public class TestRunner {
	

	
// Background in features is used if both the scenario have same steps meaning like same opening link. Check Test.feature for example.
// tags attribute = {"@Test, @regression"} represents OR like functions
// tags attribute = {"@Test", "@regression"} represents AND like functions meaning if both @Test, @regression is available in a scenario, then only it runs.
// tags = {"~@Regression"} is used to ignore that tag added scenario. ~ is used to ignore scenario
	
// if we need to give multiple data, then "Scenario Outline:" is used instead of Scenario and data should be given under "Examples:". Check Registration_multipledata for example.
// plugin attribute is used to create SuSumber report. "pretty" must be added in it as it is designed like that to generate report.	

/*runnerfile package is used to run multiple feature file in feature package. If one, it can be runned on feature class only. To run all feature file, we need to use runner file package. 
annotations used are @RunWith and @CucumberOptions*/ 	
	
/* @RunWith(Cucumber.class)	
@CucumberOptions
can only be given before class*/	
}
