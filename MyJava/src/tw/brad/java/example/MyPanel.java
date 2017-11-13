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
	private LinkedList<HashMap<String,Integer>> line;
	
	public MyPanel() {
		setBackground(Color.YELLOW);
		
		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		
		line = new LinkedList<>();
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//System.out.println("Here");
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(0, 0, 200, 200);
	}
	
	private class MyMouseListener extends MouseAdapter {

		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			int x = e.getX(), y = e.getY();
			HashMap<String,Integer> point = new HashMap<>();
			point.put("x", x); point.put("y", y);
			line.add(point);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			super.mouseReleased(e);
		}
		
	}
	
	
}
