import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner inputSize = new Scanner(System.in);
		int value = 8;
		int b=0;
		int[] values;
		
//		values = new int[5];
//		values[0] = 15;
//		values[1] = 22;
//		values[2] = 12;
//		values[3] = 16;
//		values[4] = 19;
		
		System.out.print("enter size of the array: ");
		int size = inputSize.nextInt();
		values = new int[size];
		
		//insert array using loop
		for(int i=0;i<size;i++) {
			System.out.print("Enter values ["+i+"] : ");
			int number = input.nextInt();
			values[i] = number;
		}
		

//		System.out.println(values[0]);
//		System.out.println(values[1]);
//		System.out.println(values[2]);
//		
		for(int i=0; i<values.length;i++) {
			System.out.println("values ["+i+"]:"+values[i]);
		}
		
		//array simple
		System.out.println("\n");
		//static array
		int [] numbers = {3, 2 , 1};
		for(int i=0; i<numbers.length;i++) {
			System.out.println("numbers ["+i+"]:"+numbers[i]);
		}
		
	}

}
