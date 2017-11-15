package tw.brad.java.example;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame{
	private JButton go;
	private JLabel[] lanes;
	private Horse[] horses;
	
	public Racing() {
		super("賽馬");
		setLayout(new GridLayout(9, 1));
		
		go = new JButton("Go!");
		add(go);
		
		lanes = new JLabel[8];
		horses = new Horse[8];
		for (int i=0; i<lanes.length; i++) {
			lanes[i] = new JLabel((i+1) +". ");
			add(lanes[i]);
			horses[i] = new Horse(i);
		}
		
		go.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		
		
		setSize(800, 480);
		setVisible(true);
	}
	
	private void go() {
		for (int i=0; i<horses.length; i++) {
			horses[i].start();
		}
	}
	
	
	private class Horse extends Thread {
		int lane;
		Horse(int lane){this.lane = lane;}
		@Override
		public void run() {
			for (int i=0; i<100; i++) {
				lanes[lane].setText(lanes[lane].getText() + ">");
				try {
					Thread.sleep(0 + (int)(Math.random()*200));
				} catch (InterruptedException e) {
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Racing();
	}

}
