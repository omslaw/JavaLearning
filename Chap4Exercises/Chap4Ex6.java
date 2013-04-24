/*
 * File: Chap4Ex6.java
 * ------------------
 * This uses the addNinterlist program and writes out your number
 * backward instead of adding it up. 
 */

// Works bitch!!!!!!!!

import acm.program.*;

public class Chap4Ex6 extends ConsoleProgram {
	
	public void run() {
		println("This program takes your input and reverses the numbers.");
		int n = readInt("Enter a positive number: ");
		int n2 = n;
		int y = 1;
		int dsum = 0;
		while (n >0) {
			dsum += n % 10;
			n /= 10;
			y *= 10;
		}
		y = y /10; // brings y back down one decimal point to begin the next loop
		int dsum2 = 0;
		int backInt = 0;		
		for (int i = y; i > 0; i = i/10) {
			dsum2 = n2 % 10;
			n2 /= 10;
			backInt += dsum2 * i;
			//backInt 
			//println("testing for loop: " + i);
		}
		println();
		println("Here's your number backwards.... " + backInt); 
	}
			
}