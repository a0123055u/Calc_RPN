package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class OnlineCalculator extends TestCase {
	
	private RemoteWebDriver driver;
	private String baseURL;

	@Given("^user enters (\\d+) and (\\d+) in input box$")
	public void user_enters_and_in_input_box(int arg1, int arg2) throws Throwable {
		FirefoxDriver driver = new FirefoxDriver();	   
		baseURL = "http://ata123456789123456789.appspot.com/";
		driver.get(baseURL);
		
		driver.findElement(By.id("ID_nameField1")).clear();
		driver.findElement(By.id("ID_nameField1")).sendKeys("5");
		
		driver.findElement(By.id("ID_nameField2")).clear();
		driver.findElement(By.id("ID_nameField2")).sendKeys("4");
		
		

		//throw new PendingException();
	}

	@When("^clicks on Calculate$")
	public void clicks_on_Calculate() throws Throwable {
		driver.findElement(By.id("ID_calculator")).click();		
	    
	    //throw new PendingException();
	}

	@Then("^result should be (\\d+)$")
	public void result_should_be(int arg1) throws Throwable {
	    
		String result = driver. findElement(By.id("ID_nameField3")).getAttribute("value");
		assertEquals(arg1,Integer.parseInt(result));
		driver.quit();
	    //throw new PendingException();
	}

	

}
