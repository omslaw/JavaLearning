/*
 * File InterestRate.java
 * ---------------------
 * this program calculates the annual interest rate on
 * your account balance. 
 */

import acm.program.*;

public class InterestRate extends ConsoleProgram {
	
	public void run() {
		println("Interest caluculation program.");
		double balance = readDouble("Enter starting balance: ");
		double intRate = readDouble("Enter annual interest rate: ");
		double rateOneYear = intRate * balance * .01; // converts the calculation two places
		double balanceOneYear = balance + rateOneYear;
		println("Balance after one year = " + balanceOneYear);
		double rateTwoYear = intRate * balanceOneYear * .01; // converts calc two places
		double balanceTwoYear = balanceOneYear + rateTwoYear;
		println("Balance after two years = " + balanceTwoYear);
	}
		

}
