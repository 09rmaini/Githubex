package com.qa.myLogin;


import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class MyLogin {
	
	public WebDriver driver = null;

	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
}
	
	@Test
	public void createuser() {
		driver.get("http://thedemosite.co.uk/addauser.php");
		Login L = PageFactory.initElements(driver, Login.class);
		L.uname("1234");
		L.pass("1234");
		Submit S = PageFactory.initElements(driver, Submit.class);
		S.uname("1234");
		S.pass("1234");
		String check=S.get_id();
		assertEquals("**Successful Login**",check);
		
	}
	
	
	
	@After
	public void tearDown() {
		driver.quit();
}
	
}
