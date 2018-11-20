package com.qa.Testing1;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Click 
{
	
	WebDriver driver = null;
	
	@Before
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test
	public void shopTest() 
	{
		driver.get("http://automationpractice.com/index.php");
		
		// must be same name of class
		Shopping S= PageFactory.initElements(driver, Shopping.class);
		
		S.searchFor("dress");
		
		assertEquals("dress", S.typed());
	}
	
	@After
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.close();
		
}

}
