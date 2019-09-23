
public class ArrayString {

	public static void main(String[] args) {
		
		String[] pets =new String[4];
		pets[0] = "neko";
		pets[1] = "inu";
		pets[2] = "tori";
		pets[3] = "buta";
		
		System.out.println(pets[0]);
		
		System.out.println("\n");
		
		String[] animals = {"cat","dog","bird","pig"};
		
		System.out.println(animals[0]);
		
		System.out.println("\n");
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		System.out.println("\n");
		
		int value = 0;
		
		String text = null;
		
		System.out.println(text);
		
		String[] texts = new String[2];
		
		System.out.println(texts[0]);
		texts[0] = "neko mitai desu";
		
		System.out.println(texts[0]);
		
		

	}

}
