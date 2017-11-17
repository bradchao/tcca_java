package tw.brad.java.example;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyGame extends JFrame {
	private GameView gameView;
	
	public MyGame() {
		super("");
		setLayout(new BorderLayout());
		
		gameView = new GameView();
		add(gameView, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new MyGame();
	}

}
