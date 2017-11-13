package tw.brad.java.example;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public MyPanel() {
		setBackground(Color.YELLOW);
		
		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		
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
			System.out.println("drag");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			System.out.println("press");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			super.mouseReleased(e);
			System.out.println("release");
		}
		
	}
	
	
}
