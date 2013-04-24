/*
 * File: Countdown.java
 * --------------------
 * This program counts backwards from the value START
 * to zero, as in countdown preceding a rocket
 * launch.
 * 
 */

/**
 * @author dirty
 *
 */

import acm.program.*;

public class Countdown extends ConsoleProgram {
	
	public void run() {
		for (int t = START; t >= 0; t--) {
			println(t);
		}
		println("Liftoff!");
	}
/* Specifies the value from which to start counting down */
	private static final int START = 10000;

}
