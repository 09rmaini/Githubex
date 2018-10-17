package com.qa.shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Shopping {
	
	String type;
	
	@FindBy(xpath ="//*[@id=\"search_query_top\"]")
	WebElement keyword;
	
	@FindBy(xpath ="//*[@id=\"searchbox\"]/button")
	WebElement search;
	
	
	public void uname(String keys) {
		this.type=keys;
		keyword.sendKeys(keys);
		search.submit();
		
	}
	
	public String typed() {
		return type;
		
	}
	
	
	
}
