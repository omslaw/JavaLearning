/*
 * File ForLoopTest.java
 * --------------------
 * Test to make sure I understood the checkerboard nested 
 * for loop.
 * 
 */

/**
 * @author dirty
 *
 */

import acm.program.*;

public class ForLoopTest extends ConsoleProgram {
	
	public void run() {
		for (int i = 0; i < NUM; i++) {
			for (int j = 0; j < NUM; j++) {
				println("im j on the inside " + j);
			}
			println("I'm right outside ending of j loop " + i);
		}
		println("I'm outside even the i loop. I'm by myself.");
	}
/* constant */
	private static final int NUM = 4;

}
