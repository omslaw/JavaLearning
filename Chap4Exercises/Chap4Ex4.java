/*
 * File: Chap4Ex4.java
 * prog that displays integers between 1 and 100
 * that divisible by either 6 or 7 but not both.
 */

import acm.program.*;

public class Chap4Ex4 extends ConsoleProgram {

	public void run() {
		println("prints nums between 1 and 100 divisble by 6 or 7 but not both");
		println();
		for (int i = 1; i <= 100; i++) {
			int divSix = i % 6;
			int divSeven = i % 7;
			if ((divSix == 0) && (divSeven != 0)) {
				println("This number is divisible by 6 only " + i);
			} else  if ((divSeven == 0) && (divSix != 0)) {
				println("This number is divisible by 7 only " + i);
		} 
		}
	}
}
	
