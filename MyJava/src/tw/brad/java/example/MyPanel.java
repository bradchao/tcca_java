package tw.brad.java.example;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private LinkedList<LinkedList<HashMap<String,Integer>>> lines;
	
	public MyPanel() {
		setBackground(Color.YELLOW);
		
		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		
		lines = new LinkedList<>();
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//System.out.println("Here");
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));
		
		for (LinkedList<HashMap<String,Integer>> line :lines) {
			for (int i=1; i<line.size(); i++) {
				HashMap<String,Integer> p0 = line.get(i-1);
				HashMap<String,Integer> p1 = line.get(i);
				g2d.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"));
			}
		}
		
		
	}
	
	private class MyMouseListener extends MouseAdapter {

		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			int x = e.getX(), y = e.getY();
			HashMap<String,Integer> point = new HashMap<>();
			point.put("x", x); point.put("y", y);
			lines.getLast().add(point);
			repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			int x = e.getX(), y = e.getY();
			LinkedList<HashMap<String,Integer>> line = new LinkedList<>();
			HashMap<String,Integer> point = new HashMap<>();
			point.put("x", x); point.put("y", y);
			line.add(point);
			lines.add(line);
		}


	}
	
	
}
