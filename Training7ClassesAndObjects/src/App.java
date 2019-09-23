import java.util.Scanner;

class Smartphone{
	//Instance variables (data or "state")
	String brand;
	String model;
	double price;
	
	
	//classes can contain
	// 1.Data    2.Subroutines (Methods)
	
	void speak() {
		
		System.out.println("Konnichiwa");
		System.out.println("brand: "+ brand +"\nmodel: "+ model + "\nprice: " + price);
		
	}
	void sayChesse() {
		System.out.println("chiisuu");
	}
	
	
}



public class App {

	public static void main(String[] args) {

//		System.out.println("Konnichiwa");
		
		Smartphone smartphone1 = new Smartphone();
		Smartphone smartphone2 = new Smartphone();
		
		smartphone1.brand = "Samsung";
		smartphone1.model = "Galaxy S10";
		smartphone1.price = 56000;
		
		
		System.out.println(smartphone1.brand + "\n" + smartphone1.model + "\n" + smartphone1.price);
		smartphone1.speak();
		
		
		Scanner inputsmartphonebrand2 = new Scanner(System.in);
		Scanner inputmodel2 = new Scanner(System.in);
		Scanner inputprice2 = new Scanner(System.in);
		
		//input brand
		System.out.print("Enter Brand: ");
		String inputbrand = inputsmartphonebrand2.nextLine();
		smartphone2.brand = inputbrand;
		//input model
		System.out.print("Enter Model: ");
		String inputmodel = inputmodel2.nextLine();
		smartphone2.model = inputmodel;
		//input price
		System.out.print("Enter Price: ");
		double inputprice = inputprice2.nextDouble();
		smartphone2.price = inputprice;
		
		smartphone2.speak();
		smartphone2.sayChesse();
		
		
		
		System.out.println(smartphone2.brand + "\n" + smartphone2.model + "\n" + smartphone2.price);

	}

}
