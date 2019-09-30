package Task3v2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
	int id;
	String name;

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

	public Employee() {

	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

public class AppTask {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Scanner scanner3 = new Scanner(System.in);
		Scanner scanner4 = new Scanner(System.in);
		Scanner id1 = new Scanner(System.in);

		int loop = 0;
		int input1 = 1;

		Employee emp = new Employee();

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
					int id, age;
					String name, sex;

					System.out.print("Input id: ");
					id = scanner1.nextInt();

					// check if key exists
					if (map.containsKey(id)) {

						System.out.println("ID is already taken");
					} else {
						System.out.print("Input name: ");
						name = scanner2.nextLine();
						map.put(id, name);
					}

				}
				// update and existing employee
				else if (input1 == 3) {

					String name;

					System.out.print("Insert ID:");

					int idInput = id1.nextInt();

					System.out.println("Employee Name: " + map.get(idInput));
					System.out.print("Change name into: ");
					name = scanner2.nextLine();

					map.put(idInput, name);

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
