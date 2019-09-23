import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {
		
		System.out.println("Writing Objects ...");
		
		
		
		
		//Array
		Person[] person1 = {new Person(12,"Haruhi","Japan"), new Person(13,"Kyon","Nihon"), new Person(14,"Yuki","Philippines")};
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(person1));
		
		
		
		Person haruhi = new Person(123,"Haruhi","Nihon");
		Person kyon = new Person(543,"Kyon","Japan");
		
		System.out.println(haruhi);
		System.out.println(kyon);
		
		
		
		
		
		try(FileOutputStream fs = new FileOutputStream("people.bin")){
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(person1);
			os.writeObject(peopleList);
			
			
			//Array
			os.writeInt(peopleList.size());
			
			for(Person person: peopleList) {
				
				os.writeObject(person);
			}
			
			
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
