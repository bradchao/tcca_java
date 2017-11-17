package tw.brad.java.example;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GameView extends JPanel {
	private File imgBall;
	
	public GameView() {
		imgBall = new File("./dir1/ball.png");
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		try {
			BufferedImage img = ImageIO.read(imgBall);
			g2d.drawImage(img, 0, 0, null);
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
		
	}
	
}
