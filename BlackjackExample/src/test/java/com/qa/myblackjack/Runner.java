package com.qa.myblackjack;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner {
	public static void main(String [] args) {
		Runner.allTests();
	}
	
	public static void allTests() {
		Result result = JUnitCore.runClasses(
		NotValidEntriesSuite.class,
		ValidEntriesSuite.class);
		
		System.out.println("all results passed " + "\n "+ result.wasSuccessful());
		
		if (!result.wasSuccessful()) {
			System.out.println("\n Failed Tests:");
			for (Failure failure: result.getFailures()) {
				System.out.println("\n" + failure.getMessage());
			}
		}
		
	}

}
