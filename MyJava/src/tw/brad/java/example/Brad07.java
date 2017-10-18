package tw.brad.java.example;

import javax.swing.JOptionPane;

public class Brad07 {
	public static void main(String[] args) {
		String yearString = JOptionPane.showInputDialog("Input year");
		int year = Integer.parseInt(yearString);
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					// 29
				}else {
					// 28
				}
			}else {
				// 29
			}
		}else {
			// 28
		}
		
		
	}
}
