/*
 * File: Combination.java
 * ---------------------
 * This program computes the mathematical combinations functions
 * C(n, k), which is the number of ways of selecting k object.
 */

import acm.program.*;


public class Combination extends ConsoleProgram {
	
	public void run() {
		int n = readInt("Enter number of objects in the set (n): ");
		int k = readInt("Enter number to be chosen (k): ");
		println("C(" + n + ", " + k + ") = " + combinations(n, k));
	} // ends run
/* 
 * Returns the mathematical combinations function C(n, k),
 * which is the number of ways of selecting k objects.
 */
	private int combinations(int n, int k) {
		return factorial(n) / (factorial(k) * factorial(n -k));
	} // ends combinations method

/* 
 * Returns the factorial of n, which is defined as the 
 * product of all integers from 1 up to n.
 */
	private int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		} // ends for loop
		return result;
	} // ends the method factorial
}
