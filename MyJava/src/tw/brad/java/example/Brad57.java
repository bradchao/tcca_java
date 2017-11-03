package tw.brad.java.example;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Brad57 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = 
				new ObjectInputStream(new FileInputStream("brad.oo"));
			Object obj1 = oin.readObject();
			Student s1 = (Student)obj1;
			System.out.println(s1.calSum());
			System.out.println(s1.calAvg());
			Object obj2 = oin.readObject();
			Student s2 = (Student)obj2;
			System.out.println(s2.calSum());
			System.out.println(s2.calAvg());
			
			oin.close();
		}catch(Exception ee) {
			
		}
	}

}
