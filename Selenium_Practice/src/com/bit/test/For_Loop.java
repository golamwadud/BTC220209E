package com.bit.test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class For_Loop {
	
	public static void main(String[]args) {
	// Array Concept:
	
	// We can store more than ONE Value in one Variable.
	
	// There are two ways to assign array variable listed below :
		
	// In array list Number Starts From 0 ;
	
	int [] array1 = new int [5];
	
	array1 [0] = 11;
	array1 [1] = 12;
	array1 [2] = 13;
	array1 [3] = 14;
	array1 [4] = 15;
	
	//OR
	
	int[] array2 = {100,200,300,400,500,600,700,800,900,1000};
	
	//System.out.println(array1[1]); result: 12
	
	//System.out.println(array2[4]);  
		// Result: 500
	
	// if we want to printout all the result from a array , we have to use loop concept.
	
	// Our Target is to Printout all the value 
	
	// For Lopp Concept ();
	
	for (int i = 0; i<array1.length; i++ )
	
	{
		System.out.println(array1[i]);
			
		
	}
	
	for (int i = 0; i<array2.length; i++)
	{
		
		System.out.println(array2[i]);
	}
	
	// practice for loop with String Value:
	
	
	String[] array3 = {"Rahim", "Karim", "Jodu", "Modu"};
	
	
	for ( int i = 0; i<array3.length; i++)
	{
		
		System.out.println(array3[i]);
		
	}
	
	// practice Enhanced for loop with String Value:
	
	
	String[] array4 = {"Rahim", "Karim", "Jodu", "Modu", "Sham", "Bobi"};
	
	for (String name :array4)
	{
		System.out.println(name);
	}
	
	// for enhanced for loop we have put that array in a variable, then print that variable.
// that's it, keeping that array  in a veriable does all the condition work (int i = 0; i<array3.length; i++).   
	
	
	
	
	// Divided by 2 
	
	int [] array = {1,2,3,4,5,6,7,8,9,10};
	
	for (int i = 0; i<array.length; i++)
		
	{
		if (array[i] % 2 == 0)
			
		System.out.println(array[i]);
		// it will print out the number which is divided by 2 
		
		else
		{
			System.out.println(array[i] + " is not divided by 2");
			
		}
	}
	
	
	
	
	
	
	
	
	
	}

}
