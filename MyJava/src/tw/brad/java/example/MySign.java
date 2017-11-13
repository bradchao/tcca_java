package tw.brad.java.example;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MySign extends JFrame {
	private JButton clear, undo, redo;
	private MyPanel myPanel;
	
	public MySign() {
		super("我的簽名板");
		setLayout(new BorderLayout());
		
		JPanel top = new JPanel(new FlowLayout());
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		top.add(clear);top.add(undo);top.add(redo);
		
		add(top, BorderLayout.NORTH);
		
		myPanel = new MyPanel();
		add(myPanel, BorderLayout.CENTER);
		
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.clear();
			}
		});
		
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MySign();
	}

}
