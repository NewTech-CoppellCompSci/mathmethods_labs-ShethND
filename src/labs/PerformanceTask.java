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
		double xPos = 0.0;
		double yPos = 0.0;	
		
		boolean launch = true;
		
		System.out.println("Time: " + timeInSec + "s");
		System.out.println("    x-pos: " + xPos + "m");
		System.out.println("    y-pos: " + yPos + "m");
		
		
		// using while to print the projectile's path
		while (yPos >= 0) {
			
			//Increment time
			timeInSec++;
			
			//Calculate new X and Y positions
			xPos = Math.cos(Math.toRadians(launchAngle)) * timeInSec * launchVelocity;
			yPos = Math.sin(Math.toRadians(launchAngle)) * timeInSec * launchVelocity - 0.5 * 9.8 * Math.pow(timeInSec, 2);
			
			
			if (yPos < 0) {
				yPos = 0.0;
			}
			
			//Print new stats (time, location, etc.)
			System.out.println("Time: " + timeInSec + "s");
			System.out.println("    x-pos: " + xPos + "m");
			System.out.println("    y-pos: " + yPos + "m");
		
			
			if (yPos == 0) {
				yPos = -1;
			}
			
		}
		
		
		
	}
	
	
}
