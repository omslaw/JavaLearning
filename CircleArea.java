/*
 * File: CircleArea.java
 * ---------------------
 * Calcs area of a circle. 
 */

import acm.program.*;

public class CircleArea extends ConsoleProgram {
	
	public void run() {
		println("This program calculate the area of a circle.");
		double radius = readDouble ("Enter the radius of the circle: ");
		double area = PI * (radius * radius);
		println("area of circle " + area);
		
		
	}
	/* constant for pi*/
	private static final double PI = 3.14159265358979323846;

}
