package org.testing.Assertions;

public class assertions 
{
public static void assertion1(String expected,String actual)
{
	if(actual.equals(expected))
	{
		System.out.println("Assertion is passed");
	}
	else
	{
		System.out.println("Assertion is failed");
	}
}
}
