package tw.brad.java.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Brad52 {

	public static void main(String[] args) {
		try {
			BufferedReader reader = 
					new BufferedReader(
							new FileReader("./dir1/mydata.csv"));
			String data;
			while ((data = reader.readLine()) != null) {
				String[] fields = data.split(",");
				for (String field: fields) {
					System.out.println(field);
				}
				System.out.println("-----");
			}
			
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
