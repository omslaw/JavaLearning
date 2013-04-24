/**
 * Auto Generated Java Class.
 */
/*
 * File: Chap4Ex1.java
 * -------------------
 * List out lyrics of song 99 bottles of beer on the
 * wall while changing the number. All use a constant other
 * than 99 as the initial number of bottles. 
 */

import acm.program.*;


public class Chap4Ex1 extends ConsoleProgram {

    public void run() {
        int i = 0;
        for (i = BOTTLES; i > 0;) {
            println(i + " bottles of beer on the wall.");
            println(i + " bottles of beer.");
            println("You take one one down, pass it around.");
            i --;
            println(i + " bottles of beer on the wall.");
            println();
        }
    }
/* Constant */
    private static final int BOTTLES = 99;
}
        
    
