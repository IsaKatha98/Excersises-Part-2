package expart2;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args ) {
		
		Scanner sc= new Scanner (System.in);
		int num1, num2, num3, num4;
		num2 = 6;
		System.out.print("Enter value: ");
		num1 = sc.nextInt();
		num3 = num1 + 2;
		num4 = num1 / num2;
		System.out.println("result = " + num3 +" and "+num4);
		sc.close();
		
		//If entered the number 10, the output value would be 12 and 1.
		}

}
