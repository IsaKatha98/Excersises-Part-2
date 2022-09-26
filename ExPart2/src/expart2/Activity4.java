package expart2;

import java.util.Scanner;

public class Activity4 {
	
	public static void main(String[] args) {
		
		//create scanner
		Scanner keyboard= new Scanner (System.in);
	
		// declare variables
		int x, y, aux;
		
		// enter values
		System.out.print("Enter value for x: ");
		x = keyboard.nextInt();
		System.out.print("Enter value for y: ");
		y = keyboard.nextInt();
		
		// code attempting to swap two variables
		
		aux= x;
		x = y;
		y = aux;
		
		//display results
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		//close scanner
		keyboard.close();
		
		/*a. Can you see why the program doesn’t do what we hoped? Yes
		b. What would be the actual output of the program? x=y, y=y 
		c. How could you modify the program above so that the values of the two variables are 
		swapped successfully? You have to create an additional variable so the value of y wont be owerwritten
		with the value of x */


	}

}
