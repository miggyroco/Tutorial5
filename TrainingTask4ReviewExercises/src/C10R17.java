import java.util.Scanner;

public class C10R17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);

		double num1 = 0, num2 = 0, result = 0;
		char opt = 0;
		int loop = 0;

		
		//Test
		
		while (loop != 1) {

			System.out.print("Enter First Number: ");
			num1 = scanner1.nextInt();
			System.out.print("Enter Second Number: ");
			num2 = scanner1.nextInt();

			Display_Menu(num1, num2, opt);

			opt = scanner2.next().charAt(0);

			if (opt == 'm' || opt == 'M') {
				result = Multiplication(num1, num2);
			} else if (opt == 'd' || opt == 'D') {
				result = Division(num1, num2);
			} else if (opt == 'a' || opt == 'A') {
				result = Addition(num1, num2);
			} else if (opt == 's' || opt == 'S') {
				result = Subtraction(num1, num2);
			} else if (opt == 'q' || opt == 'Q') {
				System.exit(0);
			} else {
				System.out.println("invalid input");
			}

			System.out.println("The result of this operation is " + result);

			System.out.println("\nPress C key and press ENTER to continue");
			opt = scanner.next().charAt(0);
			if (opt == 'c' || opt == 'C') {
			} else {
				loop++;
			}
		}
	}

	public static void Display_Menu(double num1, double num2, char opt) {
		System.out.println();
		System.out.println("<< Math Operation Menu >>\n");
		System.out.println("First Number : " + num1 + " " + "Second Number : " + num2);
		System.out.println("\nM - Multiplication \r\n" + "D - Division \r\n" + "A - Addition \r\n"
				+ "S - Subtraction \r\n" + "Q - Quit ");

		System.out.print("\nSelect an option: ");

	}

	public static double Multiplication(double num1, double num2) {
		System.out.println("\n\nYou have chosen Multiplication option\n");
		return num1 * num2;
	}
	public static double Division(double num1, double num2) {
		System.out.println("You have chosen Division option\n");
		return num1 / num2;
	}
	public static double Addition(double num1, double num2) {
		System.out.println("You have chosen Addition option\n");
		return num1 + num2;
	}

	public static double Subtraction(double num1, double num2) {
		System.out.println("You have chosen Subtraction option\n");
		return num1 - num2;
	}
}
