import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int input1 = 0;
		int loop = 0;

		while (loop != 1) {

			System.out.print("\nEnter a number: ");
			
			
			
			if (input.hasNextInt()) {

				input1 = input.nextInt();

				
				if (input1 >= 0 && input1 <= 9999) {
					if (input1 == 0) {
						System.out.println("Exit !");
//						loop ++;
						System.exit(0);
					} else {
						System.out.print("Result: ");
						convertDigitToWord((input1 / 1000 ), " Thousand");
						convertDigitToWord(((input1 / 100) % 10), " Hundred");
						convertDigitToWord((input1 % 100), " ");
					}

				} else {
					System.out.println("NUMBER OUT OF RANGE");
				}
				
				
			}
			
			

			else {
				input.nextLine();
				System.out.println("\nInteger only!");
			}
			
			
			
		}

		
		
	}

	public static void convertDigitToWord(int input1, String val) {

		String ones[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
				" Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen",
				" Nineteen" };
		String tens[] = { " ", " ", " Twenty", " Thirty", " Fourty", " Fifty", " Sixty", " Seventy", " Eighty",
				" Ninety" };

		if (input1 > 19) {
			System.out.print(tens[input1 / 10] + " " + ones[input1 % 10]);
		} else {
			System.out.print(ones[input1]);
		}

		if (input1 > 0) {
			System.out.print(val);
		}

	}

}
