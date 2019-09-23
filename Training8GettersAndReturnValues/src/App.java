class Smartphone{
	
	String brand;
	String model;
	double price;
	
	void info() {
		System.out.println("Brand: "+brand+"\nModel: "+model+"\nPrice: "+price);
	}
	
	double pricediscount() {
		double discount = price - (0.30 * price); 
		return discount;
	}
	
	double getPrice() {
		return price;
	}
	String getBrand() {
		return brand;
	}
	String getModel() {
		return model;
	}
	
}




public class App {

	public static void main(String[] args) {
	
		Smartphone smartphone = new Smartphone();
		smartphone.brand = "Sony";
		smartphone.model = "XZ Premium";
		smartphone.price = 39000;
		
		smartphone.info();
		
		double discountedprice = smartphone.pricediscount();
		
		System.out.println("Discounted Price is "+ discountedprice);
		
		double price = smartphone.getPrice();
		
		System.out.println("Original Price is "+ smartphone.getPrice());
		System.out.println("Brand is "+ smartphone.getBrand());
		System.out.println("Model is "+ smartphone.getModel());
		
		String brand = smartphone.getBrand();
		
		System.out.println(brand);
		
		
	}

}
