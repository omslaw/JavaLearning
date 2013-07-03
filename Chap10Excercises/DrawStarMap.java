/*
 * File: DrawStarMap.java
 * ----------------------
 * Calls my GStar class for drawing a star. 
 */

import acm.graphics.*;
import acm.program.*;
//import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import javax.swing.JCheckBox;

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
		//ImageIcon icon = new ImageIcon("steel.jpg");
		JButton button = new JButton("Clear");
		button.setActionCommand("Clear");
		add(button, SOUTH);
		//add(new JButton("Clear"), SOUTH);
		
		fillCheckBox = new JCheckBox("Filled");
		fillCheckBox.setSelected(true);
		add(fillCheckBox, NORTH);
		
		/*smallButton = new JRadioButton("Small");
		mediumButton = new JRadioButton("Medium");
		largeButton = new JRadioButton("Large");
		ButtonGroup sizeGroup = new ButtonGroup();
		sizeGroup.add(smallButton);
		sizeGroup.add(mediumButton);
		sizeGroup.add(largeButton);
		mediumButton.setSelected(true);
		add(smallButton, NORTH);
		add(mediumButton, NORTH);
		add(largeButton, NORTH);*/
		
		sizeSlider = new JSlider(MIN_SIZE, MAX_SIZE, INITIAL_SIZE);
		add(new JLabel(" Small"), NORTH);
		add(sizeSlider, NORTH);
		add(new JLabel("Large"), NORTH);
		
		addMouseListeners();
		addActionListeners();
	}
	
/* Called whenever the user clicks the mouse */
	public void mouseClicked(MouseEvent e) {
		GStar star = new GStar(getCurrentSize());
		star.setFilled(fillCheckBox.isSelected());
		add(star, e.getX(), e.getY());
	}
	
	// To clear the canvas
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Clear")) removeAll();
	}
	
	// Determine size for star based on selection
	public double getCurrentSize()	{
		return sizeSlider.getValue();
	}

/* Private Constants */
	//private static final double STAR_SIZE = 20;
	private JCheckBox fillCheckBox;
	private JRadioButton smallButton;
	private JRadioButton mediumButton;
	private JRadioButton largeButton;
	private static int SMALL_SIZE = 10;
	private int MEDIUM_SIZE = 17;
	private int LARGE_SIZE = 25;
	private JSlider sizeSlider;
	private static int MIN_SIZE = 1;
	private static int MAX_SIZE = 50;
	private static int INITIAL_SIZE = 16;
		
	
}
