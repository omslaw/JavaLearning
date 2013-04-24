/**
 * File GrayScale.java
 * -------------------
 * Create a grey scale of an image. 
 */

/**
 * @author dirty
 *
 */

import acm.program.*;
import acm.graphics.*;

public class GrayScale extends GraphicsProgram {
	
	public void run() {
		GImage image = new GImage("steel.jpg");
		add(createGrayscaleImage(image));
		//add(applyAveragingFilter(image));
		//add(image);
	}
	
	private GImage createGrayscaleImage(GImage image) {
		int[][] array = image.getPixelArray();
		int height = array.length;
		int width = array[0].length;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int pixel = array[i][j];
				//int red = (pixel >> 16) & 0xFF;
				int red = GImage.getRed(pixel);
				//int green = (pixel >> 8) & 0xFF;
				int green = GImage.getGreen(pixel); 
				//int blue = pixel & 0xFF
				//int blue = getRed(pixel);
				int blue = GImage.getBlue(pixel);
				int xx = computeLuminosity(red, green, blue);
				pixel = (0xFF << 24) | (xx << 16) | (xx << 8 ) | xx ;
				array[i][j] = pixel;
			}
		}
		
			return new GImage(array);
	}
		
		private int computeLuminosity (int r, int g, int b) {
			return GMath.round(0.299 * r + 0.587 * g + 0.114 * b);
		}
		
		/*
		 * Creates a new image by applying an averaging filter to the orignal.
		 * Each pixel in the original image is replaced by a grayscale pixel with the
		 * average luminosity of the current pixel and it's four immediate neighbors.
		 */
		
		private GImage applyAveragingFilter(GImage image) {
			int[][] array = image.getPixelArray();
			int height = array.length;
			int width = array[0].length;
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					int xx = averageNeighborLuminosity(array, i, j);
					array[i][j] = (0xFF << 24) | (xx << 16) | (xx << 8) | xx;
				}
			}
			return new GImage(array);
		}
			
		/*
		 * Computes the average luminosity of the pixel at array[i][j] and its four
		 * immediate neighbors (up, down, left, and right).
		 */
		private int averageNeighborLuminosity(int[][] array, int i, int j) {
			int sum = getLuminosity(array, i, j);
			int count = 1;
			if (i > 0) {
				sum += getLuminosity(array, i - 1, j);
				count++;
			}
			if (i < array.length - 1) {
				sum += getLuminosity(array, i + 1, j);
				count++;
			}
			if (j > 0) {
				sum += getLuminosity(array, i, j - 1);
				count++;
			}
			if (j < array[0].length -1) {
				sum += getLuminosity(array, i, j + 1);
				count++;
			}
			return GMath.round((double) sum / count);
		}
		
		/*
		 * Determines the luminosity of the pixel at array[i][j]
		 */
		private int getLuminosity(int[][] array, int i, int j) {
			int pixel = array[i][j];
			//int red = (pixel >> 16) & 0xFF;
			int red = GImage.getBlue(pixel);
			//int green = (pixel >> 8) & 0xFF;
			int green = GImage.getRed(pixel);
			//int blue = pixel & 0xFF;
			int blue = GImage.getGreen(pixel);
			return GMath.round(0.299 * red + 0.587 * green + 0.114 * blue);
		
		}
		
		public static int getRed(int pixel) {
			return (pixel >> 16) & 0xFF;
		}
		
		public static int getGreen(int pixel) {
			return (pixel >> 8) & 0xFF;
		}
		
		public static int getBlue(int pixel) {
			return pixel & 0xFF;
		}
		
		public static int createRGBPixel(int r, int g, int b) {
			return (0xFF << 24) | (r << 16) | (g << 8) | b;
		}
		
		
		
		
		
		
		

}
