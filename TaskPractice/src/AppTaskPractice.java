import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Person{
	
	int id;
	String name;
	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		
	}
	
	public Person(int newId, String newName) {
		
		this.id = newId;
		this.name = newName;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	
	public void process() {
		

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		Person person = new Person();
		
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Scanner id1 = new Scanner(System.in);
		
		
		int input1 = 1;
		int loop = 0;
		Scanner input = new Scanner(System.in);
		

		
		while (loop != 1) {

			System.out.print("Enter a choice: ");

			if (input.hasNextInt()) {

				input1 = input.nextInt();

				// Exit
				if (input1 == 0) {
//				System.exit(1);
					loop++;

				}

				// print details
				else if (input1 == 1) {

					System.out.print("Insert ID:");

					int idInput = id1.nextInt();

					System.out.println("Employee is: " + map.get(idInput));

				}

				////// insert employee details
				else if (input1 == 2) {
					
					System.out.print("insert id:");
					int inputId = scanner1.nextInt();
					
					if(map.containsKey(inputId)) {
						
						System.out.println("ID is already taken");
					}
					else {
						System.out.println("Insert name:");
						String inputName = scanner2.nextLine();
						
						person.setId(inputId);
						person.setName(inputName);
						
						map.put(person.getId(), person.getName());
					}
					
					
					

				}
				// update and existing employee
				else if (input1 == 3) {

					String name;

					System.out.print("Insert ID:");

					int idInput = id1.nextInt();
					

					if(map.containsKey(idInput)) {
						
						System.out.println("No ID found!");
					}
					else {
						System.out.println("Employee Name: " + map.get(idInput));
						System.out.print("Change name into: ");
						name = scanner2.nextLine();

						map.put(idInput, name);
					}
					

				}
				// remove an existing employee
				else if (input1 == 4) {

					System.out.print("Insert ID:");
					int idInput = id1.nextInt();

					map.remove(idInput);

					System.out.println("Employee " + idInput + " has been removed");
					
				
				}
				// query for existing employee
				else if (input1 == 5) {

					for (Map.Entry<Integer, String> entry : map.entrySet()) {

						int key = entry.getKey();
						String value = entry.getValue();
						System.out.println("ID " + key + ": Name: " + value);
		
					}

					// list of available actions
				} else if (input1 == 6) {

					System.out.println("Actions");
					System.out.println("0 - to shutDown");
					System.out.println("1 - to print personal information (id, name)");
					System.out.println("2 - to add a new employee details");
					System.out.println("3 - to update an existing employee details");
					System.out.println("4 - to remove and existing employee");
					System.out.println("5 - query for existing employee");
					System.out.println("6 - to print a list of available actions");

				}

				else {
					System.out.println("Invalid Input");
				}

				System.out.println();
				System.out.println();

			}

			else {
				input.nextLine();
				System.out.println("\nInvalid input!");
			}
		}
		
		
	}
	
	
}








public class AppTaskPractice {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.process();
		
		
		
		
	}

}
