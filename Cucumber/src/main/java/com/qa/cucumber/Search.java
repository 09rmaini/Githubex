package com.qa.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Search {

	@FindBy(xpath = "//*[@id=\"sb_form_q\"]")
	WebElement searchbar;
	
	@FindBy(xpath = "//*[@id=\"b_results\"]")
	WebElement element;
	
	String type;
	
	public void menubutton(String phrase) {
		this.type=phrase;
		searchbar.sendKeys(phrase);
	}
	
	public String named1() {
		return element.getAttribute("visible");
	}
	
	
}
