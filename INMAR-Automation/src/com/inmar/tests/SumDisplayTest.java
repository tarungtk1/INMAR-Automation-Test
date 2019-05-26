package com.inmar.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumDisplayTest {

	@Test
	@Parameters({ "number1", "number2" })
	public void displaySum(int number1, int number2) {
		
		System.out.println("#1 is : "+number1);
		System.out.println("#2 is : "+number2);
		int sum = number1 + number2;
		System.out.println("Sum of "+number1+" and "+number2+" is : "+sum);
		
	}

}
