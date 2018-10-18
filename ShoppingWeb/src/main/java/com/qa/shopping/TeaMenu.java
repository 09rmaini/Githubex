package com.qa.shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeaMenu {
	
	@FindBy(xpath ="//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
	WebElement menu;
	
	@FindBy(xpath ="//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong")
	WebElement green;
	
	@FindBy(xpath ="//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231072\"]/div/p/span/span/strong")
	WebElement red;
	
	@FindBy(xpath ="//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
	WebElement button1;
	
	@FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451959280\"]/span")
	WebElement button2;
	
	@FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451961556\"]/span")
	WebElement button3;
	
	
	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong")
	WebElement check1;
	
	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231072\"]/div/p/span/span/strong")
	WebElement check2;
	
	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231735\"]/div/p/span/span/strong")
	WebElement check3;
	
	
	String name1;
	String name2;
	String type1;
	String type2;
	String type3;
	
	public void menubutton(String button) {
		menu.sendKeys(button);
		menu.click();
	}
	
	public void greentea(String word1) {
		this.name1=word1;
		green.sendKeys(word1);
	}
	
	public void redtea(String word2) {
		this.name2=word2;
		red.sendKeys(word2);
	}
	
	
	public boolean check() {
		if(check1.getText().contains("Green Tea") && check2.getText().contains("Red Tea") && check3.getText().contains("Oolong Tea")  )
		{
			return true;
		}
		return false; 
	}
	
	public boolean checkbutton() {
		if (button1.isDisplayed() && button2.isDisplayed() && button3.isDisplayed()) 
		{
			return true;
		}
		return false;
	}
	
	public void checkoutbutton1(String but1) {
		this.type1=but1;
		button1.sendKeys(but1);
		button1.click();
	}

	public void checkoutbutton2(String but2) {
		this.type2=but2;
		button2.sendKeys(but2);
		button2.click();
	}

	public void checkoutbutton3(String but3) {
		this.type3=but3;
		button3.sendKeys(but3);
		button3.click();
}
	
	public String named1() {
		return name1;
	}
	
	public String named2() {
		return name2;
	}
	
	public String typed1() {
		return type1;
	}
	
	public String typed2() {
		return type2;
	}
	
	public String typed3() {
		return type3;
	}

}
