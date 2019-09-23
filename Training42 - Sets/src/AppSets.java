import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AppSets {

	public static void main(String[] args) {
		

		// HashSet does not retain order
//		Set< String> set1 = new HashSet<String>();

		// LinkedHashSet remembers the order of items that you add
//		Set< String> set1 = new LinkedHashSet<String>();

		// TreeSet sorts in natural order
		Set<String> set1 = new TreeSet<String>();

		if (set1.isEmpty()) {

			System.out.println("Set is empty");
		}

		set1.add("Kyon");
		set1.add("Haruhi");
		set1.add("Yuki");
		set1.add("Mikuru");
		set1.add("Koizumi");

		// Adding duplicate items does nothing
		set1.add("Haruhi");

		System.out.println(set1);
		System.out.println();
		
		if (set1.isEmpty()) {

			System.out.println("Set is empty");
		}

		

		
		////// Iteration //////
		for (String element : set1) {

			System.out.println(element);

		}

		System.out.println();
		
		
		////////////  Does set contains a given item?  ////////////

		
		
		if (set1.contains("Taniguchi")) {

			System.out.println("not found");
		}
		
		if (set1.contains("Kyon")) {

			System.out.println("Kyon Detected");
			
			
		}
		
		//// set2 contains some common elements with set1, and some new
		Set<String> set2 = new TreeSet<String>();
		
		set2.add("Kyon");
		set2.add("Haruhi");
		set2.add("Yuki");
		set2.add("Nezuko");
		set2.add("Kanao");

		
		System.out.println("set2:");
		System.out.println(set2);
		System.out.println();
		
		
		
		////////////  Intersection  ////////////
		
		

		//make the intersection copy of set1
		Set<String> intersection = new HashSet<String>(set1);
		
		System.out.println(set1);
		System.out.println();
		System.out.println(intersection);
		
		//keep only the elements in intersection that both set1 and set2 have
		intersection.retainAll(set2);
		
		
		System.out.println("\nintersection");
		System.out.println(intersection);
		
		
		
		//////////// Difference  ////////////
		Set<String> difference = new HashSet<String>(set2);
		
		difference.removeAll(set1);
		
		//^^ you can do the other way around
		
		System.out.println("\ndifference ");
		System.out.println(difference);
		
		
	}

}
