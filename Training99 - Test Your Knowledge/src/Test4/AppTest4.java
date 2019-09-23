package Test4;

import java.util.Scanner;

public class AppTest4 {

	public static void main(String[] args) {

		Scanner inputNum = new Scanner(System.in);

		int inputNum1 = 0;

		while (inputNum1 != 27) {

			System.out.print("Enter number 27: ");

			if (inputNum.hasNextInt()) {

				inputNum1 = inputNum.nextInt();

			} else {
				inputNum.nextLine();
				System.out.println("Please enter an integer");
			}

		}

		System.out.println("Got it!");

		Scanner scanner = new Scanner(System.in);

		int num = 0;

		System.out.print("Input a number:");
		
		if (scanner.hasNextInt()) {
			num = scanner.nextInt();

			switch (num) {

			case 1:
				System.out.println("Got 1");
				break;
			case 66:
				System.out.println("Got 66");
				break;
			default:
				System.out.println("Got Something else");
			}

		} else
			System.out.println("Wrong input");

	}

}
