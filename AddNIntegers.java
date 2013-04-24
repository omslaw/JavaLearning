/*
 * File: AddNIntegers.java
 * ------------------------
 * This program adds a predefined number of integers and
 * then prints the sum at the end. To change the number
 * of integers, change the definitions of N_VALUES. 
 */

/**
 * @author dirty
 *
 */

import acm.program.*;

public class AddNIntegers extends ConsoleProgram {
	
	public void run() {
		println("This program add " + N_VALUES + " integers.");
		int total = 0;
		for (int i = 0; i < N_VALUES; i++) {
			int value = readInt(" ? ");
			total += value;
		}
		println("The total is " + total + ".");
		
	}

/* Specifies the number of values */
	private static final int N_VALUES = 5;
	
}
