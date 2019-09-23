import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * 
	 */
	//this De-serialization
	private static final long serialVersionUID = 4801633306273802062L;
	private transient int id;
	private String name;
	private String address;
	
	
	private static int count;
	
	
	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		Person.count = count;
	}


	//constructor
	public Person(int id, String name,String address) {
		
		this.id = id;
		this.name = name;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [id= " + id + ", name= " + name + ", address= " + address + "] Count is:  " + count;
	}
	
	
	
	
	
}
