package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		// creating a new scanner to get input from user
		Scanner inKey = new Scanner(System.in);
		
		
		// scanning two positive integers from user
		System.out.print("Enter a positive integer: ");
		int posNum1 = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int posNum2 = inKey.nextInt();
		
		// find the min and max numbers from user inputed numbers
		int startRange = Math.min(posNum1, posNum2);
		int endRange = Math.max(posNum1, posNum2) - startRange + 1;
		
		// using for loop to print 10 random numbers
		for (int i = 0; i < 10; i++) {
			
			// creating 1 random number
			int randomNum = (int) (Math.random() * endRange + startRange);
			
			// printing the number
			System.out.print(randomNum + " ");
			
		}
		
		System.out.println("\n");
		
		
		
	}
	
	
	
	public static void problem02() {
		
		// creating a new scanner to get input from user
		Scanner inKey2 = new Scanner(System.in);
		
		// asking the user for height and radius then saving them in variables
		System.out.print("Enter the radius: ");
		double radius = inKey2.nextDouble();
		System.out.print("Enter the height: ");
		double height = inKey2.nextDouble();
		
		// calculating the cylinder's volume
		double cylinVol = height * Math.PI * Math.pow(radius, 2);
		
		// printing the volume
		System.out.println("The cylinder volume is " + cylinVol + "\n");
		
		
	}

	
	

	public static void problem03() {

		// creating a new scanner to get input from user
		Scanner inKey3 = new Scanner(System.in);
		
		
		// asking the user for two coordinate points
		System.out.print("Enter x1: ");
		double x1 = inKey3.nextDouble();
		
		System.out.print("Enter y1: ");
		double y1 = inKey3.nextDouble();
		
		System.out.print("Enter x2: ");
		double x2 = inKey3.nextDouble();
		
		System.out.print("Enter y2: ");
		double y2 = inKey3.nextDouble();
		
		
		// using the distance formula to calculate the distance between the two coordinate points
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		
		// print the calculated distance
		System.out.println("Distance between points: " + distance + "\n");
		
		
	}


	
	
	public static void problem04() {
		
		// creating a new scanner to get input from user
		Scanner inKey4 = new Scanner(System.in);
		
		
		// Asking the user for the a, b, and c values for quadratic formula
		System.out.print("Enter a-value: ");
		double a = inKey4.nextDouble();
		
		System.out.print("Enter b-value: ");
		double b = inKey4.nextDouble();
		
		System.out.print("Enter c-value: ");
		double c = inKey4.nextDouble();
		
		
		// solving the quadratic formula
		// this is for -b +
		double x1 = ((-1 * b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		
		// this is for -b -
		double x2 = ((-1 * b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		
		
		// printing both x-intercepts
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
		
	}
	
	

	
}
