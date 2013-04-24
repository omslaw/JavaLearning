/*
 * random shit from chap 5
 */

import acm.program.*;

public class Chap5Examples extends ConsoleProgram {
	
	public void run() {
		println("Testing quick return method.");
		println(methReturn());
		println(factorial(7));
	}
	
// create the test return method
	private int methReturn() {
		return (69);
	}
	
// method for factorial
	private int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
		

}
