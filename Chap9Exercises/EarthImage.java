// Copyright 2012 Google Inc. All Rights Reserved.

/* 
 * File: EarthImage.java
 * ---------------------
 * This program displays an image of the earth from space. 
 * The image appears through the courtesy of NASA/JPL-Caltech.
 */

/**
 * @author oms@google.com (George Oms)
 *
 */

import acm.program.*;
import acm.graphics.*;

public class EarthImage extends GraphicsProgram {
  
  public void run() {
    //add(new GImage("diablo.jpg"));
	GImage image = new GImage("diablo.jpg");
	image.setSize(getWidth(), getHeight() - CITATION_MARGIN);
	add(image);
	addCitation("Courtesy Blizzard");
  }
  
/* Adds a citation label at the lower right of the canvas. */
  private void addCitation(String text) {
    GLabel label = new GLabel(text);
    label.setFont(CITATION_FONT);
    double x = getWidth() - label.getWidth();
    double y = getHeight() - CITATION_MARGIN + label.getAscent();
    add(label, x, y);
  }
  
/* Private Constants */
  private static final String CITATION_FONT = "SansSerif-10";
  private static final int CITATION_MARGIN = 13;
  
/* Set the dimensions of the window */
  public static final int APPLICATION_WIDTH = 800;
  public static final int APPLICATION_HEIGHT = 600 + CITATION_MARGIN;

}
