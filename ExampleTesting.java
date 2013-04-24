/**
 * ExampleTesting from chapter 4 as I read the chapters.
 */

/**
 * @author dirty
 *
 */

import acm.program.*;

public class ExampleTesting extends ConsoleProgram {
	
	public void run() {
		int nItems = 0;
		println(nItems + " item" + (nItems == 1 ? "" : "s") + " found.");
		
		// next example 
		println();
		for (int i = 1; i <= 5; i++) {
			println("for loop test");
		}
		// nother one
		println();
		for (double x = 1.0; x <= 2.0; x += 0.1) {
			println(x);
		}
		println("divide by zero");
		int xx = 5;
		int yy = 0;
		println( xx + yy);
		// excercise from review questions
		println("b");
		for (int i = 100; i >= 0; i-=2)
			println(i);
		
	
	}

}
