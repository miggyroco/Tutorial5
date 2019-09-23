
public class Gundam extends Machine {
	
	String direction;

	
	public void direction() {
		System.out.println("forward !");

	}


	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Gundam is now Initializing !");
	}
	
	public void showInfo() {
		System.out.println("Machine name: " + name);
	}

	
}
