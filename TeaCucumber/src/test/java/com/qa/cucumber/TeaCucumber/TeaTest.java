package com.qa.cucumber.TeaCucumber;

import cucumber.api.java.After;  //don't import the junit one!
import cucumber.api.java.Before; //don't import the junit one!
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TeaTest {
	
static WebDriver driver = null;
ExtentTest test;
	

	
@Before
	public void setup()
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	
	@Given("^the correct web address$")
	public void the_correct_web_address() {
		
		
		
	    driver.get(Constants.tea_url);
	    
	
	    
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() {
	    Menu M = PageFactory.initElements(driver, Menu.class);
	    M.click();
	    
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products()  {
		
	    AvailableProducts AP = PageFactory.initElements(driver,  AvailableProducts.class);
	    assertEquals(true, AP.check() );
	    
	    if(AP.check()== true) {
			testRunner.extentTest.log(LogStatus.PASS, "Test was found");
		}
		else {
			testRunner.extentTest.log(LogStatus.FAIL, "Test was NOT found");
		}
			
	    
	    
	    
	    
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() {
		Menu M = PageFactory.initElements(driver, Menu.class);
	    M.click();
	    Checkout C = PageFactory.initElements(driver, Checkout.class);
	    C.click_checkout();
	    
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() {
		 Checkout C = PageFactory.initElements(driver, Checkout.class);
		 assertEquals(true, C.check() );

		    if(C.check()== true) {
				testRunner.extentTest.log(LogStatus.PASS, "Test was found");
			}
			else {
				testRunner.extentTest.log(LogStatus.FAIL, "Test was NOT found");
			}
		
	    
	}
	

	@After
	public void teardown() throws InterruptedException 
	{
		Thread.sleep(500);
		driver.close();
	
	}
	


}
