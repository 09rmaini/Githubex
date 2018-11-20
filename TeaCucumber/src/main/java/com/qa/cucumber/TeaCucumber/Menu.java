package com.qa.cucumber.TeaCucumber;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class Menu {

	
	@FindBy(xpath="//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
	WebElement menu_button;
	
	public void click() {
		menu_button.click();
	}
}
