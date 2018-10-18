package com.qa.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {

WebDriver driver = null;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
}
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1) throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
		Thread.sleep(5000); //pause on window for 5 seconds, needs throws intterrupted exception
	    
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) throws InterruptedException  {
		//Search S =PageFactory.initElements(driver, Search.class);
		//S.named1("");
	    // Write code here that turns the phrase above into concrete actions
		WebElement element = driver.findElement(By.id("sb_form_q"));
	    element.sendKeys(arg1);
	    element.submit();
	}

	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//Search S =PageFactory.initElements(driver, Search.class);
		//S.named1();
		Thread.sleep(5000);
	}
	
	@After
	public void teardown() {
		driver.close();
}


}
