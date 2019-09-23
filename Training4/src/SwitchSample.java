import java.util.Scanner;

public class SwitchSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Input a command: ");

		String command = input.nextLine();
		
		switch(command) {
			case "start": 
				System.out.println("Engine Start");
				break;
			case "stop":
				System.out.println("Stop");
				break;
			case "up":
				System.out.println("up");
				break;
			case "down":
				System.out.println("down");
				break;
			case "left":
				System.out.println("left");
			break;
			case "right":
				System.out.println("right");
			break;
			
			default:
				System.out.println("Command not recognized");
		
		}
		
		
	}

}
