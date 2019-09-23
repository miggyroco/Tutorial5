import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * 
	 */
	//this deserialize
	private static final long serialVersionUID = 4801633306273802062L;
	private int id;
	private String name;
	
	//constructor
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
