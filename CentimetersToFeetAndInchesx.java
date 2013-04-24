/*
 * File: CentimetersToFeetAndInchesx.java
 * --------------------------------------
 * This program converts centimeters to an integral number of feet
 * and any remaining inches. 
 */

import acm.program.*;

public class CentimetersToFeetAndInchesx extends ConsoleProgram {
    public void run() {
        println("This program converts centimeters to feet and inches.");
        double cm = readDouble("Enter value in centimeters: ");
        double totalInches = cm / CENTIMETERS_PER_INCH;
        int feet = (int) (totalInches / INCHES_PER_FOOT);
        double inches = totalInches - INCHES_PER_FOOT * feet;
        println(cm + "cm = " + feet + "ft = " + inches + "in");
        double myvers = totalInches % 12; //gets the remainder only to get the inches
        println("my version for the inches part. " + myvers);
        
        println("Now starting excercise 1--chap3");
        println("This program converts feet and inches to centimeters.");
        int feet2 = readInt("Enter number of feet: ");
        int inches2 = readInt("Enter number of inches: ");
        double feet2Inches = feet2 * INCHES_PER_FOOT;
        double centTotal = (feet2Inches + inches2) * CENTIMETERS_PER_INCH;
        println(feet2 + "ft " + inches2 + "in = " + centTotal + "cm");
        
        
        
        
        
        // some practice stuff
        int num = 5;
        num++;
        double den = 4;
        double q = num / den;
        println(" ");
        println("printing q.. " + q);
        // Leap year testing
        println();
        int y = 2400;
        boolean year = false;
        println(year);
        year = ((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0);
        println(year);
        
        
        
    }

/* Private constants */
    private static final int INCHES_PER_FOOT = 12;
    private static final double CENTIMETERS_PER_INCH = 2.54;

}



