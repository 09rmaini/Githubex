package com.qa.Testing1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopping 
{
	public String sendoff;

	@FindBy(xpath = "//*[@id=\"search_query_top\"]")
	WebElement search_bar;
	
	@FindBy(xpath="//*[@id=\"searchbox\"]/button")
	WebElement search_click;
	
	public void searchFor(String text) 
	{
		this.sendoff=text;
		search_bar.sendKeys(text);
		search_click.submit();
	}
	
	public String typed() 
	{
		return sendoff;
	}
 	 
}
