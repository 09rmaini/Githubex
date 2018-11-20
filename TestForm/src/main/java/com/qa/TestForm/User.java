package com.qa.TestForm;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class User 
{
	
	public String sendoffuname;
	public String sendoffpword;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")
	WebElement username;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input")
	WebElement password;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")
	WebElement enter;
	
	public void uname(String text)
	{
		this.sendoffuname=text;
		username.sendKeys(text);
	}
	
	public String return_uname() 
	{
		return sendoffuname;
	}
	
	public void pword(String text)
	{
		this.sendoffpword=text;
		password.sendKeys(text);
		enter.submit();
		
	}
	
	public String return_pword() 
	{
		return sendoffpword;
	}
	
	
}
