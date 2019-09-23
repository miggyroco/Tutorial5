import java.util.Scanner;

public class AppInheritance {

	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		
//		System.out.println(mach1.model+" "+mach1.type);
		
		
//		mach1.start();
//		mach1.stop();
		
		Gundam gundam1 = new Gundam();
		
		
		
		
		Scanner inputModel1 = new Scanner(System.in);
		Scanner inputFaction1 = new Scanner(System.in);
		
		
		
		
		System.out.print("Input model : ");
		int inputModel = inputModel1.nextInt();
		
		
		System.out.print("Enter Faction: ");
		String inputFaction = inputFaction1.nextLine();
		
		gundam1.model(inputModel);
		gundam1.faction(inputFaction);
		
		
		System.out.println(gundam1.faction+" "+gundam1.model+" ");
		
		gundam1.direction();
		gundam1.start();
		
		gundam1.showInfo();
		
		
	}

}
