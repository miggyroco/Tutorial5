import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


class Animals{
	
	String type;
	String name;
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	
	
}

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(); 
		Scanner scanner = new Scanner(System.in);
		
		Animals animals = new Animals();
		
		String inputType,inputName;
		
		int loop = 0;
		
		while(loop != 3) {
			System.out.print("Type of Animal: Air/Land/Water: ");
			inputType = scanner.nextLine();
			animals.setType(inputType);
			System.out.print("Name of the Animal: ");
			inputName = scanner.nextLine();
			animals.setName(inputName);
			list.add(animals.getName()+" "+animals.type);
			loop++;
		}
		
		String animal = list.get(0);
		
		System.out.println(animal);
		
//        list.add("A"); 
//        list.add("B"); 
//        list.add("C"); 
//        list.add("D"); 
//        list.add("E"); 
  
        // Iterator to traverse the list 
        Iterator iterator = list.iterator(); 
  
       
        System.out.println("List elements : "); 
  
        
        //hasNext check if the there is next value
        while (iterator.hasNext()) 
            System.out.println(iterator.next() + " "); 
  
        System.out.println(); 
	
	
	
	}

}
