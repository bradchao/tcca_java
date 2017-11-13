package tw.brad.java.example;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.*;

public class MySign extends JFrame {
	private JButton clear, undo, redo, save, open;
	private MyPanel myPanel;
	
	public MySign() {
		super("我的簽名板");
		setLayout(new BorderLayout());
		
		JPanel top = new JPanel(new FlowLayout());
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		save = new JButton("Save");
		open = new JButton("Open");
		top.add(clear);top.add(undo);top.add(redo);top.add(save);top.add(open);
		
		add(top, BorderLayout.NORTH);
		
		myPanel = new MyPanel();
		add(myPanel, BorderLayout.CENTER);
		
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.clear();
			}
		});
		
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.undo();
			}
		});
		
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.redo();
			}
		});
		
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				save();
			}
		});
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void save() {
		LinkedList<LinkedList<HashMap<String,Integer>>> lines = myPanel.getLines();
		
	}
	
	public static void main(String[] args) {
		new MySign();
	}

}
