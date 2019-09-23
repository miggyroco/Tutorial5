import java.util.Iterator;
import java.util.LinkedList;

public class AppIterators {

	public static void main(String[] args) {
		

		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("kitsune");
		animals.add("neko");
		animals.add("inu");
		animals.add("usagi");
		
		
		Iterator<String> it = animals.iterator();
		
				//hasNext if there are next item on the list
		while(it.hasNext()) {
			
			//start in the first item of the list
			String value = it.next();
			
			System.out.println(value);
			
			if(value.equals("neko")) {
				
				it.remove();
			}
			
		}
		
		System.out.println();
		
		
		
		// Modern iteration, java 5 and later
		
		
		for(String animal: animals) {
			
			System.out.println(animal);
		}
		
		
	}

}
