package tw.brad.java.example;

import javax.swing.JOptionPane;

public class Brad23 {
	public static void main(String[] args) {
		// 產生謎底
		String answer = createAnswer(3);
		//System.out.println(answer);

		boolean isWINNER = false;
		for (int i=0; i<10; i++) {
			String guess = JOptionPane.showInputDialog("Input a number");
			String result = checkAB(answer, guess);
			JOptionPane.showMessageDialog(null, result);
			
			if (result.equals("3A0B")) {
				JOptionPane.showMessageDialog(null, "WINNER");
				isWINNER = true;
				break;
			}
		}
		
		if (!isWINNER) {
			JOptionPane.showMessageDialog(null, "Loser");
		}
		
		
	}
	
	static String checkAB(String a, String g) {
		int A, B; A = B = 0;
		for (int i=0; i<g.length(); i++) {
			char gc = g.charAt(i); 
			if (gc == a.charAt(i)) {
				A++;
			}else if (a.indexOf(gc)>=0) {
				B++;
			}
		}
		
		return A + "A" + B + "B";
	}
	
	static String createAnswer(int d) {
		int[] poker = new int[10];	// 0, 0, ... 0
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i=0; i<poker.length; i++) {
			int pos = (int)(Math.random()*(poker.length-i));	// 0 - 5
			
			// swap
			int temp = poker[pos];
			poker[pos] = poker[poker.length-i-1];	// ?
			poker[poker.length-i-1] = temp;
			
		}
		
		String ret = "";
		for (int i=0; i<d; i++) {
			ret += poker[i];
		}
		
		
		return ret;
	}
	
}
