import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;

import acm.gui.TableLayout;
import acm.program.Program;

/**
 * FlowLayout Example from 10.7 page 385
 */

/**
 * @author dirty
 *
 */
public class FlowLayoutExample extends Program {
	
	public void init() {
		/*setLayout(new FlowLayout());
		add(new JButton("Button 1"));
		add(new JButton("Button 2"));
		add(new JButton("Button 3"));
		add(new JButton("Button 4"));
		add(new JButton("Button 5"));
		add(new JButton("Button 6"));*/
		// the above is the original and the below is example of gridlayout
		setLayout(new GridLayout(2, 3));
		add(new JButton("Button 1"));
		add(new JButton("Button 2"));
		add(new JButton("Button 3"));
		add(new JButton("Button 4"));
		add(new JButton("Button 5"));
		add(new JButton("Button 6"));
	}
}
