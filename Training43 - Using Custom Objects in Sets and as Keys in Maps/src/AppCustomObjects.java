import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String toString() {
		return "{ID is: " + id + "; Name is: " + name + "}";

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class AppCustomObjects {

	public static void main(String[] args) {

		// if you want distinct values don't use map or set
		// use list or generate hashCode and equal

		Person p1 = new Person(0, "Haruhi");
		Person p2 = new Person(1, "Kyon");
		Person p3 = new Person(2, "Yuki");
		Person p4 = new Person(1, "Kyon");
		Person p5 = new Person(3, "Mikuru");

		// ^^^ ->use to change String

//Before	Map <String, Integer> map = new LinkedHashMap<String, Integer>();

		Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();

//Before	map.put("one", 1);
		// <change one to p1=
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 1); // <-- keys of the map are unique
		map.put(p5, 2); // <-- will override the first

		// Before String <-- change to Person
		/*
		 * for(String key: map.keySet()) {
		 * 
		 * System.out.println(key +": "+ map.get(key)); }
		 */

		for (Person key : map.keySet()) {

			System.out.println(key + ": " + map.get(key));
		}

		Set<Person> set = new LinkedHashSet<Person>();

		// set.add("inu");
		// change inu to p1
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);

		System.out.println(set);

	}

}
