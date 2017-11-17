package tw.brad.java.example;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GameView extends JPanel {
	private Timer timer;
	private int viewW, viewH;
	
	private BufferedImage[] imgBalls = new BufferedImage[4];
	private LinkedList<Ball> balls = new LinkedList<>();
	
	public GameView() {
		timer = new Timer();
		timer.schedule(new RefreshView(), 1000, 60);
		
		try {
			imgBalls[0] = ImageIO.read(new File("./dir1/ball0.png"));
			imgBalls[1] = ImageIO.read(new File("./dir1/ball1.png"));
			imgBalls[2] = ImageIO.read(new File("./dir1/ball2.png"));
			imgBalls[3] = ImageIO.read(new File("./dir1/ball3.png"));
		}catch(Exception ee) {
			
		}
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				addBall(e.getX(), e.getY());
			}
		});
		
	}
	
	private void addBall(int ex, int ey) {
		Ball ball = new Ball(ex, ey, (int)(Math.random()*4));
		timer.schedule(ball, 500, 30);
		balls.add(ball);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		viewW = getWidth(); viewH = getHeight();
		
		Graphics2D g2d = (Graphics2D)g;
		
		for (Ball ball : balls) {
			g2d.drawImage(imgBalls[ball.which], ball.x, ball.y, null);
		}
		
	}
	
	private class RefreshView extends TimerTask {
		@Override
		public void run() {
			repaint();
		}
	}
	
	private class Ball extends TimerTask {
		int x, y, w, h, which;
		int dx,dy;
		Ball(int x, int y, int which){
			dx = dy = 4;
			this.which = which;
			w = imgBalls[which].getWidth();
			h = imgBalls[which].getHeight();
			this.x = x - w/2; this.y = y - h/2;
		}
		@Override
		public void run() {
			if (x<0 || x+w > viewW) {
				dx *= -1;
			}
			if (y<0 || y + h > viewH) {
				dy *= -1;
			}
			
			x += dx;
			y += dy;
		}
	}
	
}
