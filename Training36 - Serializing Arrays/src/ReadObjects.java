import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) {

		System.out.println("Reading objects..");

		try(FileInputStream fi = new FileInputStream("people.bin")){
			
			ObjectInputStream os = new ObjectInputStream(fi);
			
			Person[] person1 = (Person[]) os.readObject();
//			Person[] person2 = (Person[]) os.readObject();
			
			
			//Array
			@SuppressWarnings("unchecked")
			ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();
			
			//
			for(Person person: person1) {
				System.out.println(person);
				
			}
			
			System.out.println();
			
			
			//Array
			for(Person person: peopleList) {
				System.out.println(person);
				
			}
			
			//Array 
			System.out.println();
			int num = os.readInt();
			
			for(int i = 0;i<num;i++) {
				Person person = (Person)os.readObject();
				System.out.println(person);
				
				
			}
			
			
			
			
			
			
			
			
			os.close();
			
//			System.out.println(person1);
			
//			System.out.println(person2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
