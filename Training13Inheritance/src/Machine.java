
public class Machine {
	String faction;
	int model;
	
	//protected can access by the child class
	//while private can only be access this class
	protected String name = "I am Ironman";
	
	
	public int setModel() {
		return model;
	}
	
	public void model(int model) {
		this.model = model;
	}
	
	public void faction(String faction) {
		this.faction = faction;
	}
	
	public void start() {
		
		System.out.println("Machine is now Running !");
	}
	
	public void stop() {
		
		System.out.println("Machine Stopped! ");
	}
	
}
