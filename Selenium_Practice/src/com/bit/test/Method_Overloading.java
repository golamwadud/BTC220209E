package com.bit.test;

public class Method_Overloading {
	

	/* When we need multiple method with same name in the same class.
	 * we have to use method overloading concept.
	 * we can write multiple method with same name by changing the--- TYPE or PARAMETER SIZE or SEQUENCE.
	 * 
	 *  RULES:
	 *  method return type can be same or different.
	 *  Access modifier can be same or different.
	 *  It's called COMPILE TIME POLIMORPHISM.
	 */

public static void main(String[] args) {
		
		// overloaded methods = methods that share the same name but have different parameters
		//						method name + parameters = method signature
	
	
	// Method Overloading Concept by using return type method.
		
	
		String s = "hi";
		
		double x = add(1.0,2.0,3.0,4.0);
		
		System.out.println(x);
		
	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c + d;
	}
	static double add(double a, double b) {
		System.out.println("This is overloaded method #4");
		return a + b;
	}
	static double add(double a, double b, double c) {
		System.out.println("This is overloaded method #5");
		return a + b + c;
	}
	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloaded method #6");
		return a + b + c + d;
	}
	
	static void add(int a) 
	{
		System.out.println("a");
		 
	}
	static void add(int c, String s) 
	{
		System.out.println("s & b");
		 
	}
	static void add(String s, int b) 
	{
		System.out.println("s & b");
		 
	}

}
