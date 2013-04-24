/*
 * File: DrawStarMap.java
 * ----------------------
 * Calls my GStar class for drawing a star. 
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This program creates a five-pointed star every time the
 * user clicks the mouse on the canvas. 
 * 
 * @author dirty
 *
 */

public class DrawStarMap extends GraphicsProgram {

/* Initializes the mouse listeners */
	public void init() {
		addMouseListeners();
	}
	
/* Called whenever the user clicks the mouse */
	public void mouseClicked(MouseEvent e) {
		GStar star = new GStar(STAR_SIZE);
		star.setFilled(true);
		add(star, e.getX(), e.getY());
	}

/* Private Constants */
	private static final double STAR_SIZE = 20;


}
