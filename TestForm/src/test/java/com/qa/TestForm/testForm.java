package com.qa.TestForm;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testForm 
{
	
	WebDriver driver = null;
	
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test
	public void formTest()
	{
		driver.get(Constants.site_user);
		
		User U =PageFactory.initElements(driver,  User.class);
		
		U.uname("1234");
		U.pword("1234");
		
		driver.get(Constants.site_login);
		Login L =PageFactory.initElements(driver,  Login.class);
		
		L.uname("1234");
		L.pword("1234");
		
				
		assertEquals("**Successful Login**", L.success() );
		
		
		
	}
	
	@After
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}

}
