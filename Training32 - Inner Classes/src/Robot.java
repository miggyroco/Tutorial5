
public class Robot {

	private int id;
	
	
	
	public Robot(int id) {
		super();
		this.id = id;
	}




	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking ");
		}
	}

	
	
	
	static class Battery {
		public void charge() {

			System.out.println("Battery charging");
		}

	}

	
	
	

	
	
	
	public void start() {
		System.out.println("Starting Robot " + id);
		Brain brain1 = new Brain();
		brain1.think();

		String name = "exia";

		class Temp {
			public void doSomething() {
				System.out.println("ID is: " + id);
				System.out.println("My name is " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();

	}

	
	
}
