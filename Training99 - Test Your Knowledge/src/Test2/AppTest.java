package Test2;

public class AppTest {

	public static void main(String[] args) {

		System.out.println("hello world");

		String[][] name = { 
				{"Haruhi","Kyon","Yuki"},
				{"Hamin","Junu","Sunga"}
		};

		System.out.println(name[1][2]);
		
		System.out.println();
		
		for(int row = 0; row < 2;row++) {
			
			for(int col = 0; col < 3; col++) {
				
				System.out.println(name[row][col]);
			}
				
			System.out.println();
		}
		
		
	}

}
