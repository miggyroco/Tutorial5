
public class Application {

	public static void main(String[] args) {
		String words,space,desu;
		
		int num3 = 12 , num4 = 27;
		double num1,num2;
		int loop = 0;
		
		words = "Konnichiwa";
		space = " ";
		desu = "Nado Desu";
		int num = 1;
		num1 = 15;
		num2 = 32.5;
		
		
		
		
		
		System.out.println(loop);
		
		while(num < 15) {
			System.out.println(words+space+desu+space+num);
			num++;
		}
		
		for(int i=0; i < 8; i++) {
			System.out.printf("The value of number = %d\n",i);
		}
		
		while(true) {
			System.out.println("looping desu namba "+loop);
			if(loop ==5) {
			break;	
			}
			loop++;
		}
		
		
		
		
	}
}
