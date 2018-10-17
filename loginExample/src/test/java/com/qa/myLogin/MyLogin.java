package com.qa.myLogin;


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


public class MyLogin {
	
	static ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\report\\report.html", true);

	
	public WebDriver driver = null;
	
	@BeforeClass
	public static void before() {
		

	}
	

	
	@Before
	public void setup() throws Exception {
		
		ExcelUtils.setExcelFile(Constant.pathTestData + Constant.fileTestData, 0);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		//ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\form\\submitted.html", true);
	}
		
	
	@Test
	public void createuser() throws InterruptedException {
		
		
		
		ExtentTest test;

		driver.get("http://thedemosite.co.uk/addauser.php");
		
		for (int i = 1; i < ExcelUtils.getExcelWSheet().getPhysicalNumberOfRows(); i++) {
			
			test = extent.startTest("Excel Data Test: " + i);
			driver.get(Constant.registerURL);
			test.log(LogStatus.INFO, "Browser started");
			
			String user_id = ExcelUtils.getCellData(i, 0);
			String password = ExcelUtils.getCellData(i, 1);
			String Expected_Value= ExcelUtils.getCellData(i, 2);
			
			
			
			Login L = PageFactory.initElements(driver, Login.class);
			
			L.uname(user_id);
			L.pass(password);
			
			
			Submit S = PageFactory.initElements(driver, Submit.class);
			
			S.uname(user_id);
			S.pass(password);
			
			if(!S.get_id().equals(Expected_Value)) {
				test.log(LogStatus.FAIL, "Login(s) failed");
				ExcelUtils.setCellData("Fail", i, 4);
			}
			
			
			
			
			assertEquals(Expected_Value, S.get_id());
			ExcelUtils.setCellData("Pass", i, 4);
			test.log(LogStatus.PASS, "Login(s) passed");
			
			
			
			
			
			
			
		}
		
		// initialize / start the test
		//test = extent.startTest("Verify application Title");
		
		// add a note to the test
		


		
		//Login L = PageFactory.initElements(driver, Login.class);
		//L.uname("1234");
		//L.pass("1234");
		//Submit S = PageFactory.initElements(driver, Submit.class);
		//S.uname("1234");
		//S.pass("1234");
		
		
		
	
			
			
			
		
	}
	
	
	
	@After
	public void tearDown() {
		driver.quit();
}
	
	@AfterClass
	public static void after() {
		extent.flush();
	}
	
}
