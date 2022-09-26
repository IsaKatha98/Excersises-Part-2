package expart2;

import java.util.Scanner;

public class Activity4 {
	
	public static void main(String[] args) {
		
		//create scanner
		Scanner keyboard= new Scanner (System.in);
	
		// declare variables
		int x, y;
		
		// enter values
		System.out.print("Enter value for x ");
		x = keyboard.nextInt();
		System.out.print("Enter value for y ");
		y = keyboard.nextInt();
		
		// code attempting to swap two variables
		x = y;
		y = x;
		//display results
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		//close scanner
		keyboard.close();
		
		/*a. Can you see why the program doesn’t do what we hoped? No
		b. What would be the actual output of the program? 
		c. How could you modify the program above so that the values of the two variables are 
		swapped successfully?*/


	}

}
