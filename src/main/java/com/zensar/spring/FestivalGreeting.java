package com.zensar.spring;

public class FestivalGreeting implements Greeting {

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Happy Diwali!!!..Celebrate the Joy also save environment!";
		
		 
}
	public FestivalGreeting()
	{
		System.out.println("method invoked");
	}
}
