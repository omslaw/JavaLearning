/**
 * flags.java
 * 
 */

/**
 * @author dirty
 *
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class flags extends GraphicsProgram {
	
	public void run() {
		
		/* The below draws a Cuban Flag!!!! */
		double width = getWidth();
		double height = getHeight();
		double stripe = height / 5;
		add(new FilledRect(0, 0, width, stripe, Color.BLUE));
		add(new FilledRect(0, stripe, width, stripe, Color.WHITE));
		add(new FilledRect(0, stripe*2, width, stripe, Color.BLUE));
		add(new FilledRect(0, stripe*3, width, stripe, Color.WHITE));
		add(new FilledRect(0, stripe*4, width, stripe, Color.BLUE));
		// Add the triangle
		GPolygon redTriangle = new GPolygon();
		redTriangle.addVertex(0, 0);
		redTriangle.addVertex((.45161 * width), height / 2);
		redTriangle.addVertex(0, height);
		redTriangle.setFilled(true);
		redTriangle.setColor(Color.RED);
		add(redTriangle, 0, 0);
		// Add the star from the GStar class I created.
		GStar star = new GStar(.30 * height);
		star.setFilled(true);
		star.setColor(Color.WHITE);
		add(star, (.15 * width), height / 2);
		
		//GRect temp = new GRect(93.3, 100, 500, 100);
		//add(temp);
		
	}

}
