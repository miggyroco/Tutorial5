
public class AppInnerClasses {

	public static void main(String[] args) {
		
		
		Robot robot1 = new Robot(1);
		robot1.start();

		//Robot.Brain brain = robot.new Brain();
		// brain.think();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
		
		
		
		
	}

}
