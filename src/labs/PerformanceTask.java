package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		// creating a new scanner to scan inputs from user
		Scanner inKey = new Scanner(System.in);
		
		// asking the user for launch velocity and degrees and saving them in variables
		System.out.print("Enter launch velocity (m/s) >>> ");
		double launchVelocity = inKey.nextDouble();
		System.out.print("Enter launch angle (degrees) >>> ");
		double launchAngle = inKey.nextDouble();
		
		
		System.out.println("\nProjectile Path: ");
		
		
		// variables to store time, x-position, and y-position
		int timeInSec = 0;
		double xPos = 0;
		double yPos = 0;
		
		boolean yPosNot0 = true;
		
		
		// using while to print the projectile's path
		while (yPosNot0) {
			
			// 	printing the time
			System.out.println("Time: " + timeInSec + "s");
			
			// calculating x-position and y-position
			xPos = Math.cos(Math.toRadians(launchAngle)) * timeInSec * launchVelocity;
			yPos = Math.sin(Math.toRadians(launchAngle)) * timeInSec * launchVelocity - 0.5 * 9.8 * timeInSec;
			
			if (yPos != 0) {
				// printing the calculated x-pos and y-pos
				System.out.println("    x-pos: " + xPos + "m");
				System.out.println("    y-pos: " + yPos + "m");
			}
			else {
				yPosNot0 = false;
			}
			
			
			
			
		}
		
		
		
	}
	
	
}
