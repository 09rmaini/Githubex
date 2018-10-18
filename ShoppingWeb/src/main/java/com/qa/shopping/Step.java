package com.qa.shopping;


import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {

static ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\reportshop\\reportshopextra.html", true);

	
	public WebDriver driver = null;
	

	
	//2 Scenarios ([33m2 undefined[0m)
	//6 Steps ([33m6 undefined[0m)
	//0m0.000s
	
	@BeforeClass
	public static void before() {
		

	}
	

	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
		


	//You can implement missing steps with the snippets below:

	@Given("^the correct web address$")
	public void the_correct_web_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		ExtentTest test;
		
		driver.get("http://www.practiceselenium.com/welcome.html");
		//driver.quit();
	    
		// initialize / start the test
				test = extent.startTest("Verify web address");
				
				// add a note to the test
				test.log(LogStatus.INFO, "Browser started");
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		TeaMenu tm =PageFactory.initElements(driver, TeaMenu.class);
		tm.menubutton("Menu");
		driver.navigate().to("http://www.practiceselenium.com/menu.html"); 
		
	    
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TeaMenu tm1 =PageFactory.initElements(driver, TeaMenu.class);
		ExtentTest test;
		//if (tm1.check()==("Green Tea") &&  tm1.check().equals("Red Tea") && tm1.check().equals("Oolong Tea")) {
			//test.log(LogStatus.PASS, "Test was found");
		//}
		//else {
			//test.log(LogStatus.FAIL, "Test was NOT found");
		//}
		assertEquals(true, tm1.check());
		//assertEquals("Green Tea",tm.named1());
		
		//assertEquals("Red Tea",tm.named1());
	    
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TeaMenu tm2 =PageFactory.initElements(driver, TeaMenu.class);
		//tm2.checkoutbutton1("Check Out");
		i_navigate_to_the_Menu_page();  //open up menu page 
		
		//tm2.checkoutbutton2("Check Out");
		
		//tm2.checkoutbutton3("Check Out");
		assertEquals(true,tm2.checkbutton());
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() throws Throwable {
		driver.navigate().to("http://www.practiceselenium.com/check-out.html"); 
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	
	@After
	public void tearDown() {
		//driver.quit();
}
	

	@AfterClass
	public static void after() {
		extent.flush();
	}
	

	
	
}
