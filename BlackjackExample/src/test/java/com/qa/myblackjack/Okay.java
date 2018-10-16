package com.qa.myblackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class Okay {

	@Test
	public void Testy3() {
		Blackjack b = new Blackjack();
		assertEquals("player high",0,b.play(10,0));
	}
	
	@Test
	public void Testy4() {
		Blackjack b = new Blackjack();
		assertEquals("dealer high",20,b.play(10,20));
		
	}
	
	
	@Test
	public void Testy7() {
		Blackjack b = new Blackjack();
		assertEquals("joint legal",10,b.play(10,10));
		
	}
	

	@Test
	public void Testy5() {
		Blackjack b = new Blackjack();
		assertEquals("player high",20,b.play(20,10));
		
	}
	
	@Test
	public void Testy8() {
		Blackjack b = new Blackjack();
		assertEquals("player high and legal",10,b.play(10,30));
		
	}
}
