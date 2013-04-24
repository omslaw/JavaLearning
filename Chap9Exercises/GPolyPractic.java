/*
 * practice for chap 9
 */

import acm.graphics.*;
import acm.program.*;				

public class GPolyPractic extends GraphicsProgram {
	
/* Public Constants */
	public final static int DIAMOND_WIDTH = 40;
	public final static int DIAMOND_HEIGHT = 60;
	
	public void run() {
		
		int r = 100;
		GArc x = new GArc(200, 200, 135, -90);
		add(x);
		
		waitForClick();
		GPolygon diamond = new GPolygon();
		diamond.addVertex(-DIAMOND_WIDTH / 2, 0);
		diamond.addVertex(0, DIAMOND_HEIGHT / 2);
		diamond.addVertex(DIAMOND_WIDTH / 2, 0);
		diamond.addVertex(0, -DIAMOND_HEIGHT / 2);
		add(diamond, getWidth() / 4, getHeight() / 2);
		
		GPolygon diamond2 = new GPolygon();
		diamond2.addVertex(-DIAMOND_WIDTH / 2, 0);
		diamond2.addEdge(DIAMOND_WIDTH / 2, DIAMOND_HEIGHT / 2);
		diamond2.addEdge(DIAMOND_WIDTH / 2, -DIAMOND_HEIGHT / 2);
		diamond2.addEdge(-DIAMOND_WIDTH / 2, -DIAMOND_HEIGHT / 2);
		diamond2.addEdge(-DIAMOND_WIDTH / 2, DIAMOND_HEIGHT / 2);
		diamond2.setFilled(true);
		add(diamond2, 100, 100);
		
		// call that hexagon
		add(createHexagon(50), 200, 200);
		waitForClick();
		
		// calling the arched door class i created
		GArchedDoor door = new GArchedDoor(50, 70);
		add(door, 700, 799);
	}
	
// Method for creating hexagon
	private GPolygon createHexagon(double side) {
		GPolygon hex = new GPolygon();
		hex.addVertex(-side, 0);
		int angle = 60;
		for (int i = 0; i < 6; i++) {
			hex.addPolarEdge(side, angle);
			angle -= 60;
		}
		return hex;
	}

}
