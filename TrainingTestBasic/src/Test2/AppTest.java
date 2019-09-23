package Test2;

import java.util.Scanner;


class Car{
	
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car(String name) {
		this.name = name;
		
	}
	
	public void start() {
		System.out.println("Car started!");
	}
	
}


public class AppTest {

	public static void main(String[] args) {
		
		// no 1 An Interactive Program

//		System.out.println("Hello World!");
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		int input;
//		
//		System.out.print("Enter a number: ");
//		
//		input = scanner.nextInt();
//		
//		if(input <10) {
//			
//			System.out.println("This number is too small");
//		}
//		else if(input >=10) {
//			System.out.println("This number is big enough");
//			
//		}
		
		// no2 Arrays
//		Double [] number = {1.2,2.2,3.1,4.5,5.1};
//		System.out.println(number[1]);
//		
		// no3 Arrays and Loops
//		Double [] number = {1.2,2.2,3.1,4.5,5.1};
//		
//		for(int i = 0; i < number.length;i++) {
//			System.out.printf(" %.2f ",number[i]);
//		}
		
		//no4 Two Dimensional Array	
//		String[][] string = {
//				{"Haruhi","Kyon","Yuki"},
//				{"Mikan","Rito","Yui"}	
//		};	
//		System.out.println(string[1][2]);
//		System.out.println();
//		//no5 Looping Through 2D Arrays
//		for(int row = 0;row < string.length; row++) {
//			for(int col = 0; col <3;col++) {				
//				System.out.println(string[row][col]);
//			}
//
//		}
		
		//no 5 Create Classes and Objects
		Car car = new Car("AE86");
		
		String name = car.getName();
		
		System.out.println(name);
		car.start();
		
		
		
	}

}
