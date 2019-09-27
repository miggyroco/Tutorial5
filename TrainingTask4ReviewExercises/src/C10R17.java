import java.util.Scanner;

public class C10R17 {

	private static double num1 = 0, num2 = 0, result = 0;
	private static char opt = 0;

	public static void main(String[] args) {
		Display_Menu(num1, num2, opt);

	}

	public static void Display_Menu(double num1, double num2, char opt) {

		int loop = 0;
		Scanner scanner1 = new Scanner(System.in);

		while (loop != 1) {

			System.out.print("Enter First Number: ");
			num1 = scanner1.nextInt();
			System.out.print("Enter Second Number: ");
			num2 = scanner1.nextInt();

			System.out.println();
			System.out.println("<< Math Operation Menu >>\n");
			System.out.println("First Number : " + num1 + " " + "Second Number : " + num2);
			System.out.println("\nM - Multiplication \r\n" + "D - Division \r\n" + "A - Addition \r\n"
					+ "S - Subtraction \r\n" + "Q - Quit ");

			System.out.print("\nSelect an option: ");

			opt = scanner1.next().charAt(0);

			if (opt == 'm' || opt == 'M') {
				System.out.println("\n\nYou have chosen Multiplication option\n");
				result = Multiplication(num1, num2);
			} else if (opt == 'd' || opt == 'D') {
				System.out.println("You have chosen Division option\n");
				result = Division(num1, num2);
			} else if (opt == 'a' || opt == 'A') {
				System.out.println("You have chosen Addition option\n");
				result = Addition(num1, num2);
			} else if (opt == 's' || opt == 'S') {
				System.out.println("You have chosen Subtraction option\n");
				result = Subtraction(num1, num2);
			} else if (opt == 'q' || opt == 'Q') {
				System.exit(0);
			} else {
				System.out.println("invalid input");
				result = 0;
			}

			System.out.println("The result of this operation is " + result);

			System.out.println("\nPress C key and press ENTER to continue");
			opt = scanner1.next().charAt(0);
			if (opt == 'c' || opt == 'C') {
			} else {
				loop++;
			}
		}

	}

	public static double Multiplication(double num1, double num2) {

		return num1 * num2;
	}

	public static double Division(double num1, double num2) {

		return num1 / num2;
	}

	public static double Addition(double num1, double num2) {

		return num1 + num2;
	}

	public static double Subtraction(double num1, double num2) {

		return num1 - num2;
	}
}
