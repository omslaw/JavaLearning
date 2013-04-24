/*
 * File: ReverseFile.java
 * ---------------------
 * Open a file and read the contents in reverse.
 */

import acm.program.*;
import acm.util.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

/** This program reverses the lines in a file */
public class ReverseFile extends ConsoleProgram {
	
	public void run() {
		println("This program reverses the lines in a file.");
		BufferedReader rd = openFileReaderUsingChooser();
		//BufferedReader rd = openFileReader("Enter input file: ");
		String[] lines = readLineArray(rd);
		for (int i = lines.length - 1; i >= 0; i--) {
			println(lines[i]);
		}
	}
	
/** 
 * Reads all available lines from the specified reader and returns an array
 * containing those lines.  This method closes the reader at the end of the file. 
 * 
 * Implementation note:
 * 	This implementation uses an ArrayList internally to read the lines of the 
 * 	file because doing so allows the list to expand dynamically. However, 
 * 	because the definition of the method indicates that the method returns an 
 * 	array rather than an ArrayList, the implementation copies the ArrayList
 * 	to an array after all the lines have been read.
 * 
 * @param rd A BufferedReader for the input file
 * @return A string array containing the lines read from the reader. 
 */
	private String[] readLineArray(BufferedReader rd) {
		ArrayList<String> lineList = new ArrayList<String>();
		try {
			while (true) {
				String line = rd.readLine();
				if (line == null) break;
				lineList.add(line);
			}
			rd.close();
		} catch (IOException ex) {
			throw new ErrorException(ex);
		}
		String[] result = new String[lineList.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = lineList.get(i);
		}
		return result;
	}
	
/* New and improved openFileReader...*/
	private BufferedReader openFileReaderUsingChooser() {
		BufferedReader rd = null;
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {
			try {
				File file = chooser.getSelectedFile();
				rd = new BufferedReader(new FileReader(file));
			} catch (IOException ex) {
				println("Can't open that file bitch.");
			}
		}
		return rd;
	}
		
	
	
/* Include the definition of openFileReader from the text...Old manual version...... */
	private BufferedReader openFileReader(String prompt) {
		BufferedReader rd = null;
		while (rd == null) {
			try {
				String name = readLine(prompt);
				rd = new BufferedReader(new FileReader(name));
			} catch (IOException ex) {
				println("Can't open that file mofo");
			}
		}
		return rd;
	}
	
	
				
				
}
