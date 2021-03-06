package tw.brad.java.example;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Brad30 extends JFrame {
	// Brad30 Object has-a JButton Object
	// Brad30 Object is-a JFrame, .... Container
	JButton open, save, exit;
	JTextArea area;
	
	public Brad30() {
		// super();
		super("視窗城市");
		setLayout(new BorderLayout());
		
		JPanel top = new JPanel(new FlowLayout());
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		top.add(open); top.add(save); top.add(exit);
		
		area = new JTextArea();
		
		add(top, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		
		
		
		
//		MyListener listener = new MyListener(this);
//		open.addActionListener(listener);
//		save.addActionListener(listener);
//		exit.addActionListener(listener);

		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("open");
			}
		});
		
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("save");
			}
		});
		
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("exit");
			}
		});
		
		
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Brad30();
	}

}
/*
class MyListener implements ActionListener {
	private Brad30 obj;
	public MyListener(Brad30 brad30) {
		obj = brad30;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == obj.open) {
			System.out.println("open");
		}else if (e.getSource() == obj.save) {
			System.out.println("save");
		}else if (e.getSource() == obj.exit) {
			System.out.println("exit");
		}else {
			System.out.println("debug");
		}

	}
}
*/