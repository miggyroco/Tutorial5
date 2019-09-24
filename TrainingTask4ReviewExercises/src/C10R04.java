import java.util.Scanner;

public class C10R04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);

		System.out.print("Input a String: ");
		String str = scanner.nextLine();
		System.out.print("Number of  Vowels in the string:: " + vowels(str) + "\n");

	}

	public static int vowels(String str) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}
		return count;

	}

}
