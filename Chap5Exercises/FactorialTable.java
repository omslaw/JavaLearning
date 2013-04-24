/*
 * File: FactorialTable.java
 * -------------------------
 * This file generates a table of factorials.
 */

import acm.program.*;

public class FactorialTable extends ConsoleProgram {
	
	public void run() {
		for (int i = LOWER_LIMIT; i <= UPPER_LIMIT; i++) {
			println(i + "! = " + factorial(i));
		}
	}
	
/*
 * Returns the factorial of n, which is defined as the 
 * product of all integers from 1 up to n.
 */
	private int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	/* 
	 * Private Constants
	 */
	private static final int LOWER_LIMIT = 0;
	private static final int UPPER_LIMIT = 30;
		
			

}
