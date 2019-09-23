import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {

		System.out.println("Writing Objects ...");

//		
//		Person kyon = new Person(543,"Kyon","Japan");
//		
//		
//		System.out.println(kyon);
//		
//		

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people.txt"))) {

			Person haruhi = new Person(123, "Haruhi", "Nihon");

			os.writeObject(haruhi);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
