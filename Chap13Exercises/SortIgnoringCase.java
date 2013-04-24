/**
 * This program sorts the lines of a file ignoring the case of the letters. 
 * @author dirty
 *
 */

import acm.program.*;
import acm.util.*;

import java.io.*;
import java.util.*;

public class SortIgnoringCase extends ConsoleProgram implements Comparator<String> {
	
	public void run() {
		println("This program sorts a file without regard to case: ");
		BufferedReader rd = openFileReader("Enter input file: ");
		List<String> lines = readLineList(rd);
		Collections.sort(lines, this);
		Iterator<String> iterator = lines.iterator();
		while (iterator.hasNext()) {
			println(iterator.next());
		}
		println("\nAll done fool");
	}
	
	/*
	 * Implements a string comparison method that ingnores case.
	 * This method implements the Comparator<String> interface.
	 */
	public int compare(String s1, String s2) {
		return s1.toUpperCase().compareTo(s2.toUpperCase());
	}
	
	/* 
	 * Reads all available lines from the specified reader and returns a List<String>
	 * containing those lines. This method closes the reader at the end of the line.  
	 */
	private List<String> readLineList(BufferedReader rd) {
		List<String> lineList = new ArrayList<String>();
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
		return lineList;
	}
	
	/* The code from chapter 12  for openFileReader. */
	private BufferedReader openFileReader(String prompt) {
		BufferedReader rd = null;
		while (rd == null) {
			try {
				String name = readLine(prompt);
				rd = new BufferedReader(new FileReader(name));
			} catch (IOException ex) {
				println("Can't open the god damned file!");
			}
		}
		return rd;
	}
	

	
	
	
	
	
	
	
	
	
}
