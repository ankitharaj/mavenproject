package com.sspart.maven_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    
	 static WebDriver driver = null;
	 
	 @Given("^im in background given$")
		public void im_in_background_given() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("^im in background given$");
		    if(driver==null) {
		    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANKITHA\\Downloads\\chromedriver.exe");
		    	driver = new ChromeDriver();
		    }
	}
	
	
	@Given("^I am in given step$")
	public void i_am_in_given_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("^I am in given step$");
	    driver.get("https://www.amazon.in");
	}

	@Then("^I am in then step$")
	public void i_am_in_then_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("^I am in given step$");
		Select s=new Select( driver.findElement(By.xpath("//*[@name=\"url\"]")));
		s.selectByValue("search-alias=electronics");
	}

	@When("^I am in when step$")
	public void i_am_in_when_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("^I am in when step$");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	}

	@And("^I am in and step$")
	public void i_am_in_and_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("^I am in and step$");
		driver.findElement(By.linkText("Amazon Pay")).click();
		
	}

	@But("^I am in but step$")
	public void i_am_in_but_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("^I am in but step$");
	}


}
