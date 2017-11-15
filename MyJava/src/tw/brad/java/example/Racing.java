package tw.brad.java.example;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame{
	private JButton go;
	private JLabel[] lanes;
	
	public Racing() {
		super("賽馬");
		setLayout(new GridLayout(9, 1));
		
		go = new JButton("Go!");
		add(go);
		
		lanes = new JLabel[8];
		for (int i=0; i<lanes.length; i++) {
			lanes[i] = new JLabel((i+1) +". ");
			add(lanes[i]);
		}
		
		setSize(800, 480);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Racing();
	}

}
