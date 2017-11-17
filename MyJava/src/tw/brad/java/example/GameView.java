package tw.brad.java.example;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GameView extends JPanel {
	private Timer timer;
	private int viewW, viewH, dx, dy;
	
	private BufferedImage[] imgBalls = new BufferedImage[4];
	
	public GameView() {
		timer = new Timer();
		timer.schedule(new RefreshView(), 1000, 60);
		
		dx = dy = 10;
		try {
			imgBalls[0] = ImageIO.read(new File("./dir1/ball0.png"));
			imgBalls[1] = ImageIO.read(new File("./dir1/ball1.png"));
			imgBalls[2] = ImageIO.read(new File("./dir1/ball2.png"));
			imgBalls[3] = ImageIO.read(new File("./dir1/ball3.png"));
		}catch(Exception ee) {
			
		}
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		viewW = getWidth(); viewH = getHeight();
		
		Graphics2D g2d = (Graphics2D)g;
		
		//g2d.drawImage(imgBall, ballX, ballY, null);
		
	}
	
	private class RefreshView extends TimerTask {
		@Override
		public void run() {
			repaint();
		}
	}
	
	private class Ball extends TimerTask {
		int x, y, w, h, which;
		Ball(int x, int y, int which){
			this.x = x; this.y = y;
			this.which = which;
			w = imgBalls[which].getWidth();
			h = imgBalls[which].getHeight();
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
