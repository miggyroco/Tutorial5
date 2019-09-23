import java.util.Scanner;

class Frog {
	
	private int id;
	private String name;
	
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public String toString() {
		
//		StringBuilder sb = new StringBuilder();
//		
//		sb.append(id).append(": ").append(name);
//		return sb.toString();
//		
		return String.format("%4d:  %s", id,name);
		
		
	}
	
}

public class AppToStringMethod {

	public static void main(String[] args) {
		
		
		Scanner insertFrogId = new Scanner(System.in);
		Scanner insertFrogName = new Scanner(System.in);
		
		System.out.print("Enter ID: ");
		int insertFrogId1 = insertFrogId.nextInt();
		
		System.out.print("Enter Frog Name: ");
		String insertFrogName1 = insertFrogName.nextLine();
		
	
		Frog frog1 = new Frog(insertFrogId1,insertFrogName1);
		Frog frog2 = new Frog(1,"Sanders");
		
//		frog1.toString();
		
//		System.out.println(frog1.toString());
		System.out.println(frog1);
		System.out.println(frog2);
		
		
		
		

	}

}
