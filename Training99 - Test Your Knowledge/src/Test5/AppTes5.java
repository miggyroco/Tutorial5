package Test5;

import java.util.Scanner;

public class AppTes5 {

	public static void main(String[] args) {

		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		
		do {
			System.out.print("Input an integer greater than 10 :");
			num = scanner.nextInt();
			
		}
		
		while(num < 10);{
			System.out.println("Integer greater than 10 detected : "+ num);
			
		}
		
		
		
	}

}
