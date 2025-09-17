package com.va.week3.ex4;

import java.security.SecureRandom;

public class RandomNo {
	
	public static void main(String[] args) 
	{
		SecureRandom sc = new SecureRandom();
 	
		for (int counter = 1; counter <= 5; counter++)
		{
		// pick random integer from 1 to 6
		int face = 1 + sc.nextInt(6); 
				System.out.printf("%d ", face); // display generated
				System.out.println("---");
		
	}
		



}
}