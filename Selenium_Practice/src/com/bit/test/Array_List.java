package com.bit.test;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		
	// Array list is a variable type where we can keep inspecific amount of value.
		// in array we specify the amount of  value we keep.
	// for Dynamic and increase the Value size we use Array list.
	// 
		
		
	ArrayList <String> arraylist = new ArrayList<String>();
	
	
	
	// this is the way to create a Array list by create an object.
	// we have to import the ArrayList class.
	// and we have to specify the Data type whhen we creating the Arrat list.
	// to add/assign  a value in a Array list is to use .add method.
	// to delete a value from array list we use .remove method with that value assigned number like [0].
	// to fetch the data from arraylist we have to use .get method.
	
	arraylist.add("Ram"); //0
	arraylist.add("Sham");//1
	arraylist.add("Jodu");//2
	arraylist.add("Modu");//3
	arraylist.add("Kodu");//4
	
	//arraylist.remove(6); 
	// this will not remove any value because we don't have the [6] th value.
	// Because array & array list starts from 0 value.
	
	System.out.println(arraylist.get(2));
	
		
		
	}

}
