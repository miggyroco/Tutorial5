import java.util.Scanner;

public class C10R01 {

	public static void main(String[] args) {

		int n1, n2, n3;

		Scanner input1 = new Scanner(System.in);

		System.out.print("Input the first number : ");
		n1 = input1.nextInt();
		System.out.print("Input the second number : ");
		n2 = input1.nextInt();
		System.out.print("Input the third number : ");
		n3 = input1.nextInt();

		System.out.println();

		System.out.println("OUTPUT (C10R01.java) ");
		System.out.print("The smallest value is " + smallest(n1, n2, n3) + "\n");
		System.out.println();
		System.out.println("OUTPUT (C10R02.java) ");
		System.out.print("The average value is " + average(n1, n2, n3) + "\n");

	}

	public static int smallest(int n1, int n2, int n3) {

		return Math.min(Math.min(n1, n2), n3);

	}

	public static int average(int n1, int n2, int n3) {

		return (n1 + n2 + n3) / 3;

	}

}
