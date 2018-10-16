package com.qa.myblackjack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import static org.junit.Assert.assertEquals;


import java.util.Arrays;
import java.util.Collection;




@RunWith(Parameterized.class)

public class InputTest {
	
	@Parameters
	public static Collection<Object []>data(){
		return Arrays.asList(new Object[][] {{0,-10,-10},{0,-10,50},{0,10,0},{20,10,20},{20,20,10}});
	}
	
	private int input1;  //for expected
	private int input2; //for blackjack parameter 1
	private int input3; //for bj param 2

	public InputTest(int expected, int input_1, int input_2) {
		input1=input_1;
		input2=input_2;
		input3=expected;
	}
	
	@Test
	public void test() {
		
		Blackjack b = new Blackjack();
		
		assertEquals(input3,b.play(input1,input2));
	}
	
	
}
