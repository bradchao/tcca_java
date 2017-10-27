package tw.brad.java.example;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad30 extends JFrame {
	// Brad30 Object has-a JButton Object
	// Brad30 Object is-a JFrame, .... Container
	private JButton open, save, exit;
	
	public Brad30() {
		// super();
		super("視窗城市");
		setLayout(new FlowLayout());
		
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		
		add(open); add(save); add(exit);
		
		open.addActionListener(new MyListener());
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Brad30();
	}

}
class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK");
	}
}
