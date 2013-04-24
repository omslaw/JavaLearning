/**
 * File: SectionHandout2_Fibonacci.java
 * -----------------------------------
 * First problem from 15-section-handout-2.pdf
 * Problem number 1 
 */

// Unfortunately i didn't do the below work. 

import acm.program.*;

public class SectionHandout2_Fibonacci extends ConsoleProgram {

/* Private Constants */
	private static final int MAX_TERM_VALUE = 10000;
	
	public void run () {
		int n1 = 0;
		int n2 = 1;
		int t1 = 0;
		while (n1 < MAX_TERM_VALUE) {
			println(n1);
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
			
		
				
				
		}
}
		

		
		
			
	
