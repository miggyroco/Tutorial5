import java.io.Serializable;

public class App implements Serializable {

	
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 7838435928366571203L;

		public static void main(String[] args) {
			
			Animal animal = Animal.NEKO;
			
			
			
			switch(animal) {
			case INU:
				System.out.println("Wan wan");
				break;
			case NEKO:
				System.out.println("Nyaa");
				break;
			case NEZUMI:
				System.out.println("Squeakkk");
				break;
			default:
				break;
			
			}
			
			System.out.println(Animal.INU);
			System.out.println(Animal.INU.getClass());
			System.out.println(Animal.INU instanceof Enum);
			
			System.out.println(Animal.NEZUMI.getName());
			
			
		}
	
}
