/**
 * Examples from book without full program. 
 */

/**
 * @author dirty
 *
 */

import acm.program.*;

public class chapExcercises12 extends ConsoleProgram {
	
	public void run() {
		println("This is to test the sorting example from 12-5");
		sort(numArray);
		for (int i = 0; i < numArray.length; i++) {
			println("Array numbers in order: " + numArray[i]);
		}
	}
	
	/**
	 * Sorts an integer array into increasing order. The implementation uses
	 * an algorithm called selection sort, which can be described informally
	 * in English as follows:
	 * 
	 * 	With your left hand, point at the each element in the array in turn, starting
	 * 	at index 0. At each step in the cycle:
	 * 
	 * 	1. Find the smallest element in the range between your left hand and the
	 * 		end of the array, and point at that element with your right hand. 
	 * 
	 * 	2. Move that element into its correct index position by switching the 
	 * 		elements indicated by your left and right hands. 
	 */
	private void sort(int[] array) {
		for (int lh = 0; lh < array.length; lh++) {
			int rh = findSmallest(array, lh, array.length);
			swapElements(array, lh, rh);
		}
	}
	
	/* Returns the index of teh smallest array element between p1 and p2 - 1 */
	private int findSmallest(int[] array, int p1, int p2) {
		int smallestIndex = p1;
		for (int i = p1 + 1; i < p2; i++) {
			if (array[i] < array[smallestIndex]) smallestIndex = i;
		}
		return smallestIndex;
	}
	
	/* Exchanges the elements in an array at index positions p1 and p2. */
	private void swapElements(int[] array, int p1, int p2) {
		int temp = array[p1];
		array[p1] = array[p2];
		array[p2] = temp;
	}
	
	/* Array to sort */
	private int[] numArray = {31, 41, 59, 26, 3, 77, 99, 1, 99, 99, 1, 99, 2, 2};

}
