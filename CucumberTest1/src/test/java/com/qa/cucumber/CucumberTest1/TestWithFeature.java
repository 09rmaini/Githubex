package com.qa.cucumber.CucumberTest1;

import java.util.Stack;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class TestWithFeature {
	
	String plate;

	Stack<String> testStack = new Stack<String>();
	

	
	
	
	@Given("^an empty stack$")
	public void an_empty_stack()  {
	 
	    boolean empty_stack=testStack.isEmpty();
	    System.out.println(empty_stack);
	    return;
	}

	@When("^I push an item into the stack$")
	public void i_push_an_item_into_the_stack()  {
	    testStack.push("item1");
	    
	}

	@Then("^the stack contains one item$")
	public void the_stack_contains_one_item()  {
	    int size_of_stack=testStack.size();
	    assertEquals(1,size_of_stack);
	    
	}

	@When("^I push another item into the stack$")
	public void i_push_another_item_into_the_stack() {
		testStack.push("item2");
	
	}

	@Then("^the stack contains two items$")
	public void the_stack_contains_two_items()  {
		int size_of_stack=testStack.size();
	    assertEquals(2,size_of_stack);
	    
	   
	}

	@When("^I pop from the stack$")
	public void i_pop_from_the_stack()  {
	   this.plate=testStack.pop();
	    
	}

	@Then("^I get the same item back$")
	public void i_get_the_same_item_back1()  {
		
	    assertEquals("item1", plate);
	    
	}

	

	@Given("^a stack with (\\d+) items$")
	public void a_stack_with_items(int arg1)  {
		testStack.push("item1");
		testStack.push("item2");
	    testStack.push("item3");
	    System.out.println(testStack);
	    arg1=testStack.size();
	   
	}

	@Then("^I get the same item back\\?$")
	public void i_get_the_same_item_back()  {
		this.plate=testStack.pop();
		assertEquals("item3", plate);
		
	}

}
