public class App{
	public static void main(String[] args) {
		
		String Grade[] = new String[5];
		
		String tabs[] = {"Name", " Prelim", "Midterm", "Final", "Grade"};		
		String name[] = {"Justin", "Lorenz", "Jasmine", "Jericho", "Jasper"};
		int prelim[] =  {88, 90, 86, 83, 91};
		int midterm[] = {90, 88, 92, 87, 83};
		int finals[] =  {88, 92, 86, 85, 87};

		printArray(Grade, tabs, name, prelim, midterm, finals);

	}
	

	public static void printArray(String[] Grade, String tabs[], String name[], int prelim[], int midterm[], int finals[]) {
	double gs[] = new double[Grade.length];
		
	for(int x =0; x<Grade.length;x++) {
			System.out.print(tabs[x] + "\t");
			
		}
		System.out.println();
		
		for(int y =0; y<Grade.length;y++) {
			System.out.println(name[y] + "\t   " + prelim[y]+ "\t  " + midterm[y] + "\t  " + finals[y] + "\t "  + (gs[y]=(prelim[y]*0.3)+(midterm[y]*0.3)+(finals[y]*.4)));
		}
		
		
		
		
	}
	
	
	 public void compute2(int Grade[], int prelim[], int midterm[], int finals[]) {
			for(int h = 0; h<Grade.length;h++) {

				System.out.println((prelim[h]*0.3)+(midterm[h]*0.3)+(finals[h]*.4));
//			System.out.printf("");	
			}

		}
}

