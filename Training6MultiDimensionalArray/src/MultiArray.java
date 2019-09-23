
public class MultiArray {

	public static void main(String[] args) {

		String[][] country = {
				{"Philippines","Malaysia","Singapore"},
				{"Japan","China","Korea"},
				{"USA","Canada","Mexico"}
		};
	
		
		System.out.println(country[1][0]+" and "+country[2][0]);
		
		String[][] movies = new String[3][3];
		movies[0][0] = "Superman";
		movies[1][1] = "Aquaman";
		movies[0][1] = "Vacant";
		movies[1][1] = "Aquaman";
		movies[2][2] = "WonderWoman";
		
		
		System.out.println(movies[1][1]);
		
		
		
		System.out.println("\n");
		
		//nested for loop for array
		
		//rows
		for(int row=0;row<movies.length;row++) {
			//columns
			for(int column=0;column<movies[row].length;column++) {
				// \t for tab
				System.out.print(movies[row][column]+"\t");
			}	
			System.out.println();
		}
		
		
		
		System.out.println(movies.length);
		
	}

}
