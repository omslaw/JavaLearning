/*
 * File: Chap4Ex2.java
 * -------------------
 * Kid song this old man, blah blah, each time through
 * he changes the lyrics on two lines so they rhyme.
 * Make it happen.
 */

import acm.program.*;

public class Chap4Ex2 extends ConsoleProgram {
    
    public void run() {
        int i =0;
        println("This is for the kids song.");
        println();
        for (i = 1; i < 8; i++) {
            println();
            switch (i) {
                case 1: println("This old man, he played 1.");
                println("He played knick-knack on my thumb."); break;
                case 2: println("This old man, he played 2.");
                println("He played knick-knack on my shoe."); break;
                case 3: println("This old man, he played 3.");
                println("He played knick-knack on my knee."); break;
                case 4: println("This old man, he played 4.");
                println("He played knick-knack on my door."); break;
                case 5: println("This old man, he played 5.");
                println("He played knick-knack on my hive."); break;
                case 6: println("This old man, he played 6.");
                println("He played knick-knack on my sticks."); break;
                default: println("default"); break;
            }
            println("With a knick-knack, paddy-whack,");
            println("Give your dog a bone.");
            println("This old man came rolling home.");
        }
    }
    
}
