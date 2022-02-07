package labs;

import java.util.Scanner;


public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		// creating a new scanner to get input from user
		Scanner inKey = new Scanner(System.in);
		
		// asking the user for two positive integers and then saving them in variables
		System.out.print("Enter a positive integer: ");
		int userNum1 = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int userNum2 = inKey.nextInt();
		
		
		// using Math method to perform number to the power of another number
		double powResult = Math.pow(userNum1, userNum2);
		
		// printing the result.
		System.out.println(userNum1 + "^" + userNum2 + " = " + powResult + "\n");
		
		
	}
	
	
	
	
	public static void problem02() {
		
		// creating a new scanner to get input from user
		Scanner inKey2 = new Scanner(System.in);
				
		// asking the user for a positive integer and then saving it in variable
		System.out.print("Enter a positive integer: ");
		double userNum = inKey2.nextDouble();
		
		// using math method to find square root of the user inputted integer
		double sqrtOfNum = Math.sqrt(userNum);
		
		// printing the result
		System.out.println("The square root of " + userNum + " is " + sqrtOfNum + ".\n");
		
		
	}

	
	

	public static void problem03() {
		
		// creating a new scanner to get input from user
		Scanner inKey3 = new Scanner(System.in);
		
		// asking user for the base and height of a triangle and saving the info in variables
		System.out.print("Length of side A: ");
		double sideA = inKey3.nextDouble();
		System.out.print("Length of side B: ");
		double sideB = inKey3.nextDouble();
		
		// using math method of to find the hypotenuse using lengths of sides a and b
		double hypotenuse = Math.sqrt((Math.pow(sideA, 2)) + (Math.pow(sideB, 2)));
		
		// printing the result
		System.out.println("Hypotenuse = " + hypotenuse + "\n");
		

	}


	
	
	public static void problem04() {
		
		// creating a new scanner to get input from user
		Scanner inKey4 = new Scanner(System.in);
		
		// setting max and min values
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		// creating a variable to store user number
		int userNum = 1;
		
		// creating a boolean variable to use a sentinel controlled loop
		boolean not0 = true;
		
		// asking user for a positive integer until they enter a 0
		while (not0) {
			System.out.print("Enter a integer: ");
			userNum = inKey4.nextInt();
			
			if (userNum == 0) {
				not0 = false;
			} 
			
			
			max = Math.max(max,  userNum);
			min = Math.min(min,  userNum);
			
			
			
		}
		
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
		
		//-55 -5 -47 -1 -2 0
	}
	
	
	
	
	
	
}
