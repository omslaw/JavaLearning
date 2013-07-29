import java.awt.BorderLayout;

import javax.swing.JButton;

import acm.program.Program;
import acmx.export.javax.swing.JPanel;

/**
 * BorderLayout Example from chap 10.7 page 384
 * 
 */

/**
 * @author dirty
 *
 */


public class BorderLayoutExample extends Program {
	
	public void init() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(new JButton("NORTH"), BorderLayout.NORTH);
		panel.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		panel.add(new JButton("WEST"), BorderLayout.WEST);
		panel.add(new JButton("EAST"), BorderLayout.EAST);
		panel.add(new JButton("CENTER"), BorderLayout.CENTER);
		add(panel);
	}

}
