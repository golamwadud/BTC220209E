package com.bit.test;

public class If_Else_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
// 1. My Target is to Print out those number from that array which is Divided by 2 .
// 2. My Target is to Print out the 1st number from that array which is Divided by 2 and then stop the loop.
		
		
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,13,15,17,19,21,23,25,27,29};
		
		for (int i = 0; i<array.length; i++)
		{
			
			if (array[i] % 2 == 0)
				
			{
				System.out.println(array[i]);
				// this will print out my target result.
				
				break;
				// 2. This (break) will stop the loop when it found the 1st number divided by 2.
			}
			
			else 
			{
				System.out.println(array[i] + "is not Divided by 2");
				// this one will print those values which is not divided by 2 with this message.
			// So, this loop will go through with all the numbers and print out all the numbers with message.
	
			}
			//System.out.println(array[i]);
			// this will print out all my numbers but that's not my target.
		}
		
		
		
		
		
		
	}

}
