package tw.brad.java.example;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad30 extends JFrame {
	// Brad30 Object has-a JButton Object
	// Brad30 Object is-a JFrame, .... Container
	private JButton open, save, exit;
	
	public Brad30() {
		// super();
		super("視窗城市");
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		
		add(open); add(save); add(exit);
		
		setSize(640, 480);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Brad30();
	}

}
