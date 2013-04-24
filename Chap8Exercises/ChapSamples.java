/**
 * Just a playground for book examples
 */

/**
 * @author dirty
 *
 */

import acm.program.*;
import acm.util.*;

public class ChapSamples extends ConsoleProgram {
	
	public void run() {
		
		Weekday day = Weekday.MONDAY;
		println("Today is " + day);
		
		println ("printing output of isWeekday method ");
		if (isWeekendDay(day) == true) {
			println("true\n");
		} else {
			println("false\n");
		}
		//randomLetter();
		for (int i = 0; i <= 10; i++) {
			println(randomLetter());
		}
		println("seperate line " + randomLetter());
		
		// testing of going to lowercase letter
		char ch = 'z';
		ch = Character.toUpperCase(ch);
		println("the char is currently " + ch);
		//toLowerCase(ch);
		ch = Character.toLowerCase(ch);
		println("now it's " + ch);
		println("this is temp to upper case but not to change variable " + Character.toUpperCase(ch));
		println("but the ch variable is still lower case... " + ch);
		
		println();
		
		println();
		println(concatNCopies(100, " x"));
		println();
		println(acronym("George Oms"));
		
		
		
		
		} // end of run statement



		public enum Weekday {
			SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
			THURSDAY, FRIDAY, SATURDAY
		}
		
		/* Either of the following two boolean methods return
		 * the expected values. 
		 */
		
		//private boolean isWeekendDay(Weekday day) {
			//return day == Weekday.SATURDAY || day == Weekday.SUNDAY;
		//}
		
		private boolean isWeekendDay(Weekday day) {
			switch (day) {
				case SATURDAY: case SUNDAY: return true;
				default: return false;
			}
		}
		
		// for printing a random letter
		private char randomLetter() {
			return (char) rgen.nextInt((int) ' ', (int) 'z');
		}
		
		/* instance variable for the random number generator */
		private RandomGenerator rgen = RandomGenerator.getInstance();
		
		/* method to convert char to lower case */
		/*public static char toLowerCase(char ch) {
			if (ch >= 'A' && ch <= 'Z') {
				return ch + 'a' - 'A';
			} else {
				return ch;
			}
		} */
		
		/* Method to test for vowels */
		private boolean isEnglishVowel(char ch) {
			switch (Character.toLowerCase(ch)) {
				case 'a': case 'e': case 'i': case 'o': case 'u':
					return true;
				default:
					return false;
			}
		}
		
		/* string test method for copies */
		private String concatNCopies(int n, String str) {
			String result = "";
			for (int i = 0; i < n; i++) {
				result += str;
			}
			return result;
		}
		
		/* Acronym, returns acronym of your string */
		private String acronym(String str) {
			String result = str.substring(0, 1);
			int pos = str.indexOf(' ');
			while (pos != -1) {
				result += str.substring(pos + 1, pos + 2);
				pos = str.indexOf(' ', pos + 1);
			}
			return result;
		}
		
					
		
		
		
		
		
		
}
