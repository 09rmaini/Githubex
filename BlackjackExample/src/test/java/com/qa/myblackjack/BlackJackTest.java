package com.qa.myblackjack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Before;	
import org.junit.After;

public class BlackJackTest {

	
	static int x=1;  //x is static, needs to be accessed by before and after class (also static)
	//to be incremented
	@BeforeClass
	public static void Set() {
	System.out.println("welcome to my tests");
	}
	
	@Before
	public void Setup1() {
		System.out.println("Test " + x + " out of 17" );
	}
	
	@After 
	public void TearDown1() {
		System.out.println("Test " + x + " out of 17");
		x++;
	}
	
	
	
	@AfterClass 
	public static void tear() {
		System.out.println("Test class complete");
	}

	
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
	public void Testy5() {
		Blackjack b = new Blackjack();
		assertEquals("player high",20,b.play(20,10));
		
	}
	
	@Test
	public void Testy6() {
		Blackjack b = new Blackjack();
		
		assertEquals("player high",0,b.play(10,-10));
	}
	
	@Test
	public void Testy7() {
		Blackjack b = new Blackjack();
		assertEquals("joint legal",10,b.play(10,10));
		
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
	public void Testy10() {
		Blackjack b = new Blackjack();
		assertEquals("both illegal",0,b.play(30,-10));
	}
	
	@Test
	public void Testy11() {
		Blackjack b = new Blackjack();
		assertEquals("dealer high and legal",10,b.play(30,10));
		
	}
	
	@Test
	public void Testy12() {
		Blackjack b = new Blackjack();
		assertEquals("both illegal",0,b.play(30,30));
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
	
	

