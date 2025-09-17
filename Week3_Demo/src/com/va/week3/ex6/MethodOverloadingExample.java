package com.va.week3.ex6;

public class MethodOverloadingExample {
	
	// Overloaded sum() 
    // This sum takes two int parameters
    public int sum(int x, int y) { return (x + y); }

    // Overloaded sum()
    // This sum takes three int parameters
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }
    
    // Overloaded sum() 
    // This sum takes two double parameters
    public double sum(double x, double y)
    {
        return (x + y);
    }

    public static void main(String args[])
    {
    	MethodOverloadingExample obj = new MethodOverloadingExample();
    	System.out.println(obj.sum(10, 20));
    	System.out.println(obj.sum(10,20,30));
    	System.out.println(obj.sum(10.3,21.1));
    	
    	
    }
}
