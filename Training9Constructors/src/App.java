class Saiyan{
	
	private String name;
	private int age;
	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public void setInfo(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	
//	int getAge() {
//		return age;
//	}
//	
//	String getName() {
//		return name;
//		
//	}
	
	public Saiyan() {	
		
		this("Goku",37);
		System.out.println("Constructor Running !");
		name = "Vegeta";
		
	}
	
	public Saiyan(String name) {
		System.out.println("Second Constructor Running!");
		this.name = name;
	}
	public Saiyan(String name, int age) {
		System.out.println("Third Constructor Running");
		this.name = name;
		this.age = age;
	}
	
	
}




public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Saiyan saiyan1 = new Saiyan();
		Saiyan saiyan2 = new Saiyan("Trunks");
		Saiyan saiyan3 = new Saiyan("Trunks",16);
		
	
		
	}

}
