import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {

	private int id;
	private String name;

	public Person(int id, String name) {
		this.name = name;
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return id + " : " + name;
	}

}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();
		if (len1 > len2) {
			return 1;
		}

		else if (len1 < len2) {
			return -1;
		}

		return 0;
	}

}

class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		return s1.compareTo(s2);

	}

}

class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		return -s1.compareTo(s2);

	}

}

public class AppSortingLists {

	public static void main(String[] args) {

		/////////////// Sorting String
		List<String> animals = new ArrayList<String>();

		animals.add("Neko");
		animals.add("Inu");
		animals.add("Buta");
		animals.add("Tora");
		animals.add("Hebi");
		animals.add("Nezumi");

		System.out.println("\nString Sort");
		// sort String by alphabetical order
//		Collections.sort(animals);

		// sort by length
//		Collections.sort(animals, new StringLengthComparator());

		// sort by Alphabetical order
//		Collections.sort(animals, new AlphabeticalComparator());

		// sort by Reverse Alphabetical order
		Collections.sort(animals, new ReverseAlphabeticalComparator());

		for (String animal : animals) {

			System.out.println(animal);
		}

		///////////////////// Sorting Numbers ///////////
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(27);
		numbers.add(6);
		numbers.add(14);
		numbers.add(31);
		numbers.add(3);
		numbers.add(30);

		System.out.println("\nInteger Sort");
		// sort integer by numerical order
//		Collections.sort(numbers);

		// You can also user anonymous classes
		// reverse numerical order
		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
		});

//		Collections.shuffle(numbers);

		for (Integer number : numbers) {

			System.out.println(number);

		}

		/////////////////// Sorting arbitrary objects ///////////////////

		List<Person> people = new ArrayList<Person>();

		people.add(new Person(2, "Kyon"));
		people.add(new Person(1, "Haruhi"));
		people.add(new Person(4, "Mikuru"));
		people.add(new Person(3, "Yuki"));

		System.out.println();
		
		// Sort in order of ID
		System.out.println("Order by ID");
		Collections.sort(people, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				if (p1.getId() > p2.getId()) {

					return 1;
				} else if (p1.getId() < p2.getId()) {

					return -1;
				}

				return 0;
			}

		});

		for (Person person : people) {

			System.out.println(person);
		}
		
		
		System.out.println();
		
		
		System.out.println("Order by name");
		// Sort in order of name
		Collections.sort(people, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {				

				return p1.getName().compareTo(p2.getName());
			}

		});

		for (Person person : people) {

			System.out.println(person);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
