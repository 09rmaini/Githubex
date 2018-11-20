package com.qa.TestForm;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;


public class Login {
	
	public String sendoffuname;
	public String sendoffpword;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")
	WebElement username;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")
	WebElement password;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")
	WebElement enter;
	
	
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
	WebElement success;
	
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
	
	public String success() 
	{
		return success.getText();
	}



}

