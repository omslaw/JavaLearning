/*
 * File: AnimatedSquare.java
 * -------------------------
 * This program animates a square so that it moves from the 
 * upper left corner of the window to the lower right corner.
 */

/**
 * @author dirty
 *
 */

import acm.graphics.*;
import acm.program.*;

public class AnimatedSquare extends GraphicsProgram {
	
	public void run() {
		GRect square = new GRect(0, 0, SQUARE_SIZE, SQUARE_SIZE);
		square.setFilled(true);
		add(square);
		//double wide = getWidth();
		//GLabel info = new GLabel(wide, 55, 50);
		//add(info);
		//TODO quick test from intellij
		double dx = (getWidth() - SQUARE_SIZE) / N_STEPS;
		double dy = (getHeight() - SQUARE_SIZE) / N_STEPS;
		for (int i = 0; i < N_STEPS; i++) {
			square.move(dx, .15);
			pause(PAUSE_TIME);
		}
	}
/* Private constants */
	private static final int N_STEPS = 1000;
	private static final int PAUSE_TIME = 5; 
	private static final double SQUARE_SIZE = 50;  
}
