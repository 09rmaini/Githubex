package com.qa.shopping;


import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ShoppingTest {

static ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\reportshop\\reportshop.html", true);

	
	public WebDriver driver = null;
	
	@BeforeClass
	public static void before() {
		

	}
	

	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
		
	
	@Test
	public void createuser() {
		
		ExtentTest test;

		driver.get("http://automationpractice.com/index.php");
		
		// initialize / start the test
		test = extent.startTest("Verify application Title");
		
		// add a note to the test
		test.log(LogStatus.INFO, "Browser started");


		
		
		Shopping S = PageFactory.initElements(driver, Shopping.class);
		
		S.uname("dress");
		
		
		if(S.typed().equals("dress")) {
			test.log(LogStatus.PASS, "Test was found");
		}
		else {
			test.log(LogStatus.FAIL, "Test was NOT found");
		}
			
			
			assertEquals("dress",S.typed());
		
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
