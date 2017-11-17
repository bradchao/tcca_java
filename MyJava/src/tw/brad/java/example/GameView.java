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
	private File fileBall;
	private Timer timer;
	private int ballX, ballY, viewW, viewH, ballW, ballH, dx, dy;
	
	private BufferedImage imgBall;
	
	public GameView() {
		fileBall = new File("./dir1/ball.png");
		timer = new Timer();
		timer.schedule(new BallTask(), 1000, 60);
		
		dx = dy = 10;
		ballX = ballY = 0;
		try {
			imgBall = ImageIO.read(fileBall);
			ballW = imgBall.getWidth(); ballH = imgBall.getHeight();
		}catch(Exception ee) {
			
		}
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		viewW = getWidth(); viewH = getHeight();
		
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.drawImage(imgBall, ballX, ballY, null);
		
	}
	
	private class BallTask extends TimerTask {
		@Override
		public void run() {
			if (ballX<0 || ballX+ballW > viewW) {
				dx *= -1;
			}
			if (ballY<0 || ballY + ballH > viewH) {
				dy *= -1;
			}
			
			ballX += dx;
			ballY += dy;
			repaint();
		}
	}
	
	
}
