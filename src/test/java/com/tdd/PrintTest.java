package com.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrintTest {
	
	@Test
	public void testPrint(){
		print(1, "1");
		print(2, "2");
		print(3, "Fizz");
		print(5, "Buzz");
		print(6, "Fizz");
		print(7, "7");
		print(15, "FizzBuzz");
		print(31, "Fizz");
		print(52, "Buzz");
	}
	
	@Test
	public void print100(){
		int i=0;
		while (i <100) {
			i++;
			Print print1=new Print();
			System.out.println(print1.print(i));
			
		}
	}

	private void print(int a, String b) {
		Print print1=new Print();
		assertEquals(print1.print(a), b);
	}

}
