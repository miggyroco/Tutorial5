package Test3;

class Car {

	String name;

	public void start() {

		System.out.println("Car Started!");
	}

	
	public Car(String newName){
		this.name = newName;
		
	}


	public String getName() {
		return name;
	}


	
	
}

public class AppTest3 {

	public static void main(String[] args) {

		Car car = new Car("AE86");
		
		car.start();
		
		System.out.println(car.getName());

		
		
	}

}
