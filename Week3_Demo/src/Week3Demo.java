
/*
 * Example of using static methods ..and variables.
 * // Java program to demonstrate that
// the static method does not have
// access to the instance variable
 * 
 */

public class Week3Demo {
	
	static int a=50; 
	
	int b=60;
	
	void simpleDisplay()
	{
		System.out.println(a);
		System.out.println(b);
	}

	// static method.. 
	static void staticDisplay()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		Week3Demo obj = new Week3Demo();
		obj.simpleDisplay(); // calling not static method.
		
	//	staticDisplay(); // calling static method.
		
	}
}
