package com.qa.cucumber.TeaCucumber;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;


public class Checkout {
	
	@FindBy(xpath="//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
	WebElement check;
	
	@FindBy(xpath="//*[@id=\"wsb-element-00000000-0000-0000-0000-000451989411\"]/div/p/span/strong")
	WebElement checkout_sign;
	
	
	public void click_checkout () {
		check.click();
	}
	
	public boolean check() {
		if (checkout_sign.getText().contains("Pay with Credit Card or Log In") )
		{
			return true;
		}
		return false;
	}
	
	
}
