package com.qa.cucumber.TeaCucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\TeaCucumber\\src\\test\\java\\com\\qa\\cucumber\\TeaCucumber\\TeaTesting.feature")


public class testRunner 
{
	
	static ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\reportshop.html", true);
	static ExtentTest extentTest;
	
	
	
	@BeforeClass
	public static void before() {
		// initialize / start the test
		
				ExtentTest test;
				test = extent.startTest("Verify application Title");
				
				// add a note to the test
				test.log(LogStatus.INFO, "Browser started");
	}

	
	@AfterClass
	public static void after() {
		
		// initialize / start the test
		
		ExtentTest test;
		test = extent.startTest("Verify application Title");
		
		// add a note to the test
		test.log(LogStatus.INFO, "Browser started");

		extent.flush();
	}
}
