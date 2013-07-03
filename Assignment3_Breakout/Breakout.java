/*
 * File: Breakout.java
 * -------------------
 * Name:
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Breakout extends GraphicsProgram {

/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

/** Separation between bricks */
	private static final int BRICK_SEP = 4;

/** Width of a brick */
	private static final int BRICK_WIDTH =
	  (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

/** Number of turns */
	private static final int NTURNS = 3;
	
/** The paddle */
	private GRect paddle;
	private GObject gobj;   // The object being dragged
	private GPoint last;    // The last mouse position

/* Method: run() */
/** Runs the Breakout program. */
	public void init() {
		setup();
		int x = ((WIDTH - PADDLE_WIDTH) /2);
		int y = getHeight() - PADDLE_Y_OFFSET;
		paddle = new GRect(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
		paddle.setFilled(true);
		paddle.setColor(Color.BLACK);
		add(paddle);
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		last = new GPoint(e.getPoint());
		gobj = getElementAt(last);
	}
	
	/* Called on mouse drag to reposition the object */
	public void mouseDragged(MouseEvent e) {
		if (gobj != null) {
			double x = e.getX()  - last.getX();
			println("what is double x" + (e.getX() - PADDLE_WIDTH));
			println("what is x of object " + gobj.getX());
			double xLoc = gobj.getX();
			/*if (xLoc <= 0) {
				gobj.move(0, 0);
			}
			if ((xLoc + PADDLE_WIDTH) >= WIDTH) {
				int edge = WIDTH - PADDLE_WIDTH;
				gobj.move((WIDTH - PADDLE_WIDTH), 0);
			}*/ 
			if (xLoc >= WIDTH) {
				gobj.move((WIDTH - PADDLE_WIDTH), 0);
			}
			gobj.move(x, 0);
			
			last = new GPoint(e.getPoint());
		}
	}


	/**
	 * This setups the game board. 
	 */
	private void setup() {
		brickSetup();
	}


	/**
	 * This setups the bricks at the top of the screen. 
	 */
	private void brickSetup() {
		int x = BRICK_SEP / 2;
		int y = BRICK_Y_OFFSET;
		int twoRowHeight = (BRICK_HEIGHT + BRICK_SEP) * 2;
		createRow(x, y, Color.RED);
		y += twoRowHeight;
		createRow(x, y, Color.ORANGE);
		y += twoRowHeight;
		createRow(x, y, Color.YELLOW);
		y += twoRowHeight;
		createRow(x, y, Color.GREEN);
		y += twoRowHeight;
		createRow(x, y, Color.CYAN);
	}


	/**
	 * Creates two rows of blocks for the game. 
	 * @param x
	 * @param y
	 * @param Color 
	 */
	private void createRow(int x, int y, Color color) {
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 10; j++) {
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				brick.setFilled(true);
				brick.setColor(color);
				add(brick);
				x += BRICK_WIDTH + BRICK_SEP;
			}
			x = BRICK_SEP / 2;
			y += BRICK_HEIGHT + BRICK_SEP;
		}
		

	}

}
