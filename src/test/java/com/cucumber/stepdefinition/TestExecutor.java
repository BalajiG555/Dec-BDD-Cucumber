package com.cucumber.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.pages.RegistrationPage;
import com.cucumber.utility.Common;

public class TestExecutor  {

    public static WebDriver driver;
	public static Common com = new  Common();
    public static RegistrationPage page = new RegistrationPage();
	
	public void OpenUrl(String URL) {

	System.setProperty("webdriver.chrome.driver", "D:\\DecSeleniumProject1\\exe\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
		
	driver.get(URL);







	

	}
}
