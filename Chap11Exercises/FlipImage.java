/**
 * 
 */

/**
 * @author dirty
 *
 */

import acm.program.*;
import acm.graphics.*;

public class FlipImage extends GraphicsProgram {

	public void run() {
		GImage image = new GImage("diablo.jpg");
		//add(image);
		//int[][] pixelArrayTest = image.getPixelArray();
		//println("printing out pixelArrayTest: " + pixelArrayTest);
		//int h = pixelArrayTest.length;
		//int w = pixelArrayTest[0].length;
		//println("here is h: " + h);
		//println("here is w: " + w);
		
		//for (int i = 0; i < pixelArrayTest[0].length; i++) {
			//println(pixelArrayTest[i]);
		//}
		add(flipVertical(image));
		//add(image);
	}
	
	private GImage flipVertical(GImage image) {
		int[][] array = image.getPixelArray();
		int height = array.length;
		for (int p1 = 0; p1 < height/2; p1++) {
			int p2 = height - p1 - 1;
			int[] temp = array[p1];
			array[p1] = array[p2];
			array[p2] = temp;
		}
		return new GImage(array);
		
	}
}
