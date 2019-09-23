import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Create scanner object
		Scanner input = new Scanner(System.in);
		Scanner loopInput = new Scanner(System.in);

		int loop = 0;
		
		
		//input string
		System.out.print("Enter a word desu: ");
		String word = input.nextLine();
		
		//input number
		System.out.print("Enter number of loops u want desu:");
		double loopInputNum = loopInput.nextDouble();
	
		
		
//		while(true) {
//		//Output
//			System.out.println("loop desu namba : "+loop);
//			System.out.println(word + " "+ loop);
//			
//			if(loop==loopInputnum) {
//				break;
//			}
//			loop++;
//		}
		
		/*
		while(loopInputnum != 8) {
			System.out.println("Enter another Number: ");
			loopInputnum = loopInput.nextDouble();
		}
		System.out.println("You guess it right!");
		*/
		
		//Do While Loop
		do {
			System.out.println("Enter another Number: ");
			loopInputNum = loopInput.nextDouble();
		}
		
		while(loopInputNum !=8);{
			while(true) {
				//Output
					System.out.println("loop desu namba : "+loop);
					System.out.println(word + " "+ loop);
					
					if(loop==loopInputNum) {
						break;
					}
					loop++;
				}
		}
		
		
		
		
		
	}

}
