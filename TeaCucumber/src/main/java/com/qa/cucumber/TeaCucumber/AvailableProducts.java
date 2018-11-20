package com.qa.cucumber.TeaCucumber;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;


public class AvailableProducts {

	
	@FindBy(xpath="//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong")
	WebElement Green;
	
	@FindBy(xpath="//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231072\"]/div/p/span/span/strong")
	WebElement Red;
	
	@FindBy(xpath="//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231735\"]/div/p/span/span/strong")
	WebElement Oolong;


	public boolean check() {
		if(Green.getText().contains("Green Tea") && Red.getText().contains("Red Tea") && Oolong.getText().contains("Oolong Tea")  )
		{
			return true;
		}
		return false; 
	}

}
