package tw.brad.java.example;

public class Brad34 {
	public static void main(String[] args) {
		Line1 obj1 = new Line1();
		Line12 obj2 = new Line12();
		Line1 obj3 = new Line12();
		Inter1 obj4 = new Line11();
		//Line1 obj4 = new Line2();
		
		Line12 obj5 = (Line12)obj3;
		Line11 obj6 = (Line11)obj3;
		
		Line2 obj7 = new Line2();
		//Line11 obj8 = (Line11)obj7;
		Line11 obj9 = new Line11();
		//Line12 obj10 = (Line12)obj9;
		
		
		
		
	}
}
interface Inter1 {
	
}
class Line1 {
	
}
class Line11 extends Line1 implements Inter1 {
	
}
class Line12 extends Line1 {
	
}
class Line2 {
	
}
class Line21 extends Line2 {
	
}
class Line22 extends Line2 {
	
}
