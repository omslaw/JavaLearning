/*
 * File: Chap4Ex3.java
 * ------------------
 * prog reads in a positive int N and then calcs
 * and displays the sum of the first N odd integers. for exam
 * if N is 4, the prog diplays 16 which is 1+3+5+7
 */

// DONE and working

import acm.program.*;

public class Chap4Ex3 extends ConsoleProgram {
	
	public void run() {
		int n = readInt("Enter a positive int ");
		println();
		if (n < 0) n = -n; // converts negative num to positive
		int dsum = 0;
		int oddN = 1;
		for (int i = 0; i < n; i++) {
			dsum += oddN;
			oddN += 2;
		}
		println("Here are the results " + dsum);
			
		
	}
	

}
