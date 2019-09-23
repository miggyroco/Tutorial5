package Test1;

class Brain{
	
	public Brain() {
		
		System.out.println("Thinking...");
	}
}


class Person{
	
	private String name;
	
	private Brain brain;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		
		
	}
	
	public Person(String name) {
		
		
		 brain = new Brain();
		this.name = name;
		
	}
	
	public void writeName() {
		System.out.println("My name is "+ name);
		
	}
	
	
}

public class AppTest {

	public static void main(String[] args) {

			System.out.println("Hello World!");
			
			Person person = new Person("Haruhi");
			
			String name;
			
			name = person.getName() + " Suzumiya";
			
			person.setName(name);
			
			
			person.writeName();
			
			

	}
	

}
