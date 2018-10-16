package com.qa.myblackjack;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Invalid {
	
	

		@Test
		public void Testy1() {
			
			Blackjack b = new Blackjack();
			assertEquals("2 low invalid entries",0,b.play(-10,-10));
		}
		
				

		@Test
		public void Testy2() {
			Blackjack b = new Blackjack();
			assertEquals("player invalid",0,b.play(-10,50));
			
		}
		
		
		
		@Test
		public void Testy13() {
			Blackjack b = new Blackjack();
			assertEquals("both illegal",0,b.play(30,50));
		}
		
		@Test
		public void Testy14() {
			Blackjack b = new Blackjack();
			assertEquals("both illegal",0,b.play(50,-10));
		}
		
		@Test
		public void Testy15() {
			Blackjack b = new Blackjack();
			assertEquals("both illegal",0,b.play(50,10));
		}
		
		
		@Test
		public void Testy16() {
			Blackjack b = new Blackjack();
			assertEquals("both illegal",0,b.play(50,30));
		}
		
		
		@Test
		public void Testy17() {
			Blackjack b = new Blackjack();
			assertEquals("both illegal",0,b.play(50,50));
		}
		
	}



