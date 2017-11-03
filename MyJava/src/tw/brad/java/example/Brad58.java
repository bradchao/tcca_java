package tw.brad.java.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad58 {

	public static void main(String[] args) {
		try {
			Brad583 obj1 = new Brad583();
			ObjectOutputStream out = 
					new ObjectOutputStream(new FileOutputStream("test1"));
			out.writeObject(obj1);
			out.flush();
			out.close();
			System.out.println("save OK");
			
			ObjectInputStream oin = 
					new ObjectInputStream(new FileInputStream("test1"));
			Object obj2 = oin.readObject();
			Brad583 obj3 = (Brad583)obj2;
			oin.close();
			System.out.println("read OK");
			System.out.println(obj1 == obj3);
		}catch(Exception ee) {
			
		}
	}

}
class Brad581 implements Serializable{
	Brad581(){
		System.out.println("Brad581()");
	}
}
class Brad582 extends Brad581{
	Brad582(){
		System.out.println("Brad582()");
	}
}
class Brad583 extends Brad582 {
	Brad583(){
		System.out.println("Brad583()");
	}
}

