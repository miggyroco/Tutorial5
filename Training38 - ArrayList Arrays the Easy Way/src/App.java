import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		//Always specify the type of want to store<Integer>
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		//Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);

		//Retrieving
		System.out.println(numbers.get(0));
		
		System.out.println();

		System.out.println("Iteration #1");
		//indexed for loop iteration #1
		for(int i = 0;i <numbers.size(); i++){ 
			System.out.print(numbers.get(i)+" ");
			}
		System.out.println();
		
		System.out.println();
		
		
		//removing item (careful!)
				numbers.remove(numbers.size()-1);//last item

				//This is very slow
				numbers.remove(0);
		
		
		
		//iteration #2
		System.out.println("Interation #2");
		for(Integer value: numbers){ 
			System.out.println(value);  
			}

		
		// List interface
		List <String> values = new ArrayList<String>();
		

	}

}
