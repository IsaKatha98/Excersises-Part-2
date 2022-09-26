package expart2;

import java.util.Scanner;

public class Activity5 {
	
	//Design a program that asks the user to enter values for 
	//the length and height of a rectangle and then displays the area and perimeter of that rectangle.
	
public static void main (String[] args) {
		
	//create scanner
		Scanner keyboard = new Scanner(System.in);
		
	//declare variables
		double height,length, area, perimeter;
		
	//enter values
		System.out.print("Enter height of the rectangle: ");
		height= keyboard.nextDouble();
		System.out.print("Enter length of the rectangle: ");
		length= keyboard.nextDouble();
		
	//calculations
		area= height*length;
		perimeter=2*(height+length);
		
	//show results
		System.out.println("The area of the rectangle is= "+area);
		System.out.print("The perimeter of the rectangle is= "+perimeter);
		
	//close scanner
		keyboard.close();
}

}
