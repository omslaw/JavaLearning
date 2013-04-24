/*
 * file: FahToCel.java
 * -------------------
 * Exercise 5 .. chap 3
 */

import acm.program.*;

public class FahtoCel extends ConsoleProgram {
	
	public void run() {
		println("This program converts Fahrenheit to Celsius.");
		double fah = readDouble("Enter Fahrenheit temperature: ");
		double result = FAHTOCEL * (fah - 32);
		println("Celsius equivalent = " + result);
		
	}
	/* constant for converting fahrenheit to celsius */
	private static final double FAHTOCEL = 5/9.0;

}
