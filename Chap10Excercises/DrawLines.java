/**
 * File: DrawLines.java
 * --------------------
 * 
 */

/**
 * @author dirty
 *
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;

/* This class allows users to draw lines on the canvas */
public class DrawLines extends GraphicsProgram {
	
	/* Initializes the program by enabling the mouse listeners */
	public void init() {
		addMouseListeners();
	}
	
	/* Called on mouse press to create a new line */
	public void mousePressed(MouseEvent e) {
		line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		add(line);
	}
	
	/* Called on mouse drag to reset the endpoint */
	public void mouseDragged(MouseEvent e) {
		line.setEndPoint(e.getX(), e.getY());
	}
	
	/* Private instance variable */
	private GLine line;
	

}
