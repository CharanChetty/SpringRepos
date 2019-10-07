package com.zensar.spring;

public class AniversaryGreeting implements Greeting {

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Happy Married life!";
	}
public AniversaryGreeting() {
	// TODO Auto-generated constructor stub
	System.out.println("Anniversary for chaithroday is done");
}
}
