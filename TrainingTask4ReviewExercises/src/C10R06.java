import java.util.Scanner;

public class C10R06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Input an integer: ");
		int input = scanner.nextInt();
		System.out.println("The sum is " + sum(input));

	}

	public static int sum(int input) {
		int sum = 0;

		while (input > 0) {
			sum = sum + input % 10;
			input = input / 10;
		}

		return sum;
	}

}
