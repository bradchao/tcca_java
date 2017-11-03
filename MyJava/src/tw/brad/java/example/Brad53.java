package tw.brad.java.example;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Brad53 extends JFrame {
	private JButton open, save, exit;
	private JTextArea area;
	private File openfile = null;
	
	public Brad53() {
		super("文字編輯器");
		setLayout(new BorderLayout());
		JPanel panel = new JPanel(new FlowLayout());
	
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		panel.add(open);panel.add(save);panel.add(exit);
		
		area = new JTextArea();
		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openFile();
			}
		});
		
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveFile();
			}
		});
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void openFile() {
		JFileChooser jfc = new JFileChooser(".");
		if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			area.setText("");
			openfile = jfc.getSelectedFile();
			try {
				BufferedReader reader = 
						new BufferedReader(new FileReader(openfile));
				String line;
				while ( (line = reader.readLine()) != null) {
					area.append(line + "\r\n");
				}
				reader.close();
			}catch(Exception ee) {
				System.out.println(ee.toString());
			}
			
		}
	}
	
	private void saveFile() {
		if (openfile==null) return;
		
		try {
			BufferedOutputStream br = 
				new BufferedOutputStream(new FileOutputStream(openfile));
			br.write(area.getText().getBytes());
			br.flush();
			br.close();
		}catch(Exception ee) {
			System.out.println(ee.toString());
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new Brad53();
	}

}
