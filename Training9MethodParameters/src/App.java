
class Saiyan{
	String name;
	String ability;
	int age;
	
	public void speak(String shout) {
		System.out.println(shout);
	}
	public void power(int level) {
		System.out.println("His power level is over "+level);
	}
	
	//parameters
	public void place(String planet, double distance) {
		System.out.println("Planet "+ planet + " is " + distance + " lightyears away");
	}
	

}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Saiyan saiyan = new Saiyan();
		Saiyan saiyan2 = new Saiyan();
		
		saiyan.name = "Vegeta";
		saiyan.ability = "Galick Gun";
		saiyan.age = 42;		
		
		String specialmove = "Kame hame ha !";
		saiyan.speak(specialmove);
		
//		saiyan.speak("Galick gun aaa!");
		
		saiyan.power(9999);
		saiyan.place("Vegeta",180.45);
		
		
	}

}
