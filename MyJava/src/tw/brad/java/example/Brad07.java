package tw.brad.java.example;

import javax.swing.JOptionPane;

public class Brad07 {
	public static void main(String[] args) {
		String yearString = JOptionPane.showInputDialog("Input year");
		int year = Integer.parseInt(yearString);
		System.out.println(year + 1);
		
		
	}
}
