/**
 * This program puts up button on the screen, which triggers a 
 * message inspired by Douglas Adams's novel.  
 */

/**
 * @author dirty
 *
 */

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class HitchhikerButton extends ConsoleProgram {
	
	/* Initializes the user-interface buttons */
	public void init() {
		add(new JButton("Red"), SOUTH);
		addActionListeners();
	}
	
	/* Responds to a button action */
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().endsWith("Red")) {
			println("Please do not press this button again.");
		}
	}

}
