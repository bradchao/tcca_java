package tw.brad.java.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad56 {

	public static void main(String[] args) {
		Student s1 = new Student(70, 30, 20);
		Student s2 = new Student(74, 33, 25);
		try {
			ObjectOutputStream oout = new ObjectOutputStream(
					new FileOutputStream("brad.oo"));
			oout.writeObject(s1);
			oout.writeObject(s2);
			oout.flush();
			oout.close();
			System.out.println("Save OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
class Student implements Serializable {
	int ch, math, eng;
	Student(int ch, int math, int eng){
		this.ch = ch; this.math = math; this.eng = eng;
	}
	int calSum() {
		return ch + math +eng;
	}
	double calAvg() {
		return calSum() / 3.0;
	}
}
