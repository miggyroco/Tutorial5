
public class App {

	public static void main(String[] args) {
		

		// Array1
//		String[] top = { "Name", "Prelim", "Midterm", "Final", "Grade" };
//		String[] name = { "Justin", "Lorenz", "Jasmine", "Jericho", "Jasper" };
//		int[] prelim = { 88, 90, 86, 83, 91 };
//		int[] midterm = { 90, 88, 92, 87, 83 };
//		int[] finals = { 88, 92, 86, 85, 87 };
//
//		String Grade[] = new String[5];

//		for (int i = 0; i < Grade.length; i++) {
//			double gs = (prelim[i] * 0.3) + (midterm[i] * 0.3) + (finals[i] * .4);
//			String total = Double.toString(gs);
//			Grade[i] = total;
//		}
		// -Array1 end

		String Grade[] = new String[5];

		Grade[0] = "Name"; Grade[1] = "Prelim" ;Grade[2] = "Midterm"; Grade[3] = "Final"; Grade[4] = "Grade";

		for (int i = 0; i < Grade.length; i++) {
			System.out.print(Grade[i] + "\t\t");
		}
		System.out.println();
		Grade[0] = "Justin"; Grade[1] = "88"; Grade[2] = "90"; Grade[3] = "88"; Grade[4] = "xxx";
		printArray(Grade);
		Grade[0] = "Lorenz"; Grade[1] = "90"; Grade[2] = "88"; Grade[3] = "92"; Grade[4] = "xxx";
		printArray(Grade);
		Grade[0] = "Jasmine"; Grade[1] = "86"; Grade[2] = "92"; Grade[3] = "86"; Grade[4] = "xxx";
		printArray(Grade);
		Grade[0] = "Jericho"; Grade[1] = "83"; Grade[2] = "87"; Grade[3] = "85"; Grade[4] = "xxx";
		printArray(Grade);
		Grade[0] = "Jasper"; Grade[1] = "91"; Grade[2] = "83"; Grade[3] = "87"; Grade[4] = "xxx";
		printArray(Grade);

//		System.out.println(Grade[1]);

		// printArray1
//		printArray(top, name, prelim, midterm, finals, Grade);
//		System.out.println();

		

	}

//	public static void printArray(String[] top, String[] name, int[] prelim, int[] midterm, int[] finals, String[] Grade) {
//		
//		for (int i = 0; i < Grade.length; i++) {
//			System.out.print(top[i]+"\t\t");
//		}
//		
//		System.out.println();
//
//		for (int i = 0; i < Grade.length; i++) {
//			System.out.print(name[i]+"\t\t"+prelim[i]+"\t\t"+midterm[i]+"\t\t"+finals[i]+"\t\t"+Grade[i]);
//			System.out.println();
//		}
	
	
//		
//
//	}
//	


	public static void printArray(String[] Grade) {

		double gs;
		
		int Prelim = Integer.parseInt(Grade[1]);
		int Midterm = Integer.parseInt(Grade[2]);
		int Final = Integer.parseInt(Grade[3]);

		gs = Prelim * 0.3 + Midterm * 0.3 + Final * 0.4;
		

		String gstemp = Double.toString(gs);
		Grade[4] = gstemp;
		
		for (int i = 0; i < Grade.length; i++) {
			System.out.print(Grade[i]+"\t\t");
		}


		System.out.println();
	}

}
