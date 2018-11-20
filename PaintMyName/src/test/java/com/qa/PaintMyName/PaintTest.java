package com.qa.PaintMyName;

import java.io.IOException;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PaintTest {

	public WebDriver driver = null;
	Actions act;

	//C:\\Users\\Admin\\Desktop\\chromedriver.exe

	@Before
	public void setup() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
	    driver = new ChromeDriver();
	    act =new Actions(driver);
	    
	}

	@Test
	public void paint() throws InterruptedException , IOException {
	    
	    driver.get("https://www.youidraw.com/apps/painter/");
	    
	    //R
	    act.clickAndHold();
	    act.moveByOffset(200, 200).clickAndHold().moveByOffset(0, 200).release().perform();
	    act.clickAndHold().moveByOffset(0, -200).release().perform();
	    act.clickAndHold().moveByOffset(200, 0).release().perform();
	    act.clickAndHold().moveByOffset(0, 100).release().perform();
	    act.clickAndHold().moveByOffset(-200, 0).release().perform();
	    act.clickAndHold().moveByOffset(200, 100).release().perform();
	    
	    act.release().moveByOffset(20, 0);
	    
	    //O
	    act.clickAndHold().moveByOffset(0, -100).release().perform();
	    act.clickAndHold().moveByOffset(200, 0).release().perform();
	    act.clickAndHold().moveByOffset(0, 100).release().perform();
	    act.clickAndHold().moveByOffset(-200, 0).release().perform();
	    
	    act.release().moveByOffset(220, 0);
	    
	    //H
	    act.clickAndHold().moveByOffset(0, -200).release().perform();
	    act.clickAndHold().moveByOffset(0, 100).release().perform();
	    act.clickAndHold().moveByOffset(100, 0).release().perform();
	    act.clickAndHold().moveByOffset(0, -100).release().perform();
	    act.clickAndHold().moveByOffset(0, 200).release().perform();
	    
	    
	    
	    
	    //act.moveByOffset(200, 200).clickAndHold().moveByOffset(200, 75).release().perform();
	}



	@After
	public void tearDown() {
	    //driver.quit();
	}
}
