package com.qa.myblackjack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Bust {

	@Test
	public void Testy11() {
		Blackjack b = new Blackjack();
		assertEquals("dealer high and legal",10,b.play(30,10));
		
	}
	
	@Test
	public void Testy8() {
		Blackjack b = new Blackjack();
		assertEquals("player high and legal",10,b.play(10,30));
		
	}
	
	@Test
	public void Testy9() {
		Blackjack b = new Blackjack();
		assertEquals("player high and legal",10,b.play(10,50));
	}
	
	@Test
	public void Testy12() {
		Blackjack b = new Blackjack();
		assertEquals("both illegal",0,b.play(30,30));
	}
	
	
	
}
