import java.util.Scanner;

public class App {



        public static void main(String[] args) {
            int input = 0;
            Scanner scanner = new Scanner(System.in);
            
            
            System.out.print("Enter a number:");
            input = scanner.nextInt();
            
            boolean isNumeric = false;
            
            
            while(input!=-1){
                if(input>=0 && input<=9999){
                    if(input==0){
                    	System.out.println("Exit !");
                        System.exit(input);
                    } else {
                        System.out.print("Result:");
                        convertDigitToWord(((input / 1000) % 10), " Thousand");
                        convertDigitToWord(((input / 100) % 10), " Hundred");
                        convertDigitToWord((input % 100)," ");
                    }

                } else{
                    System.out.print("OUT OF RANGE");
                }
                System.out.print("\nEnter a number:");
                input = scanner.nextInt();
            }
            
               
            
            
        }

        public static void convertDigitToWord(int num, String thouhun) {
            String ones[] = {" ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"
            };
            String tens[] = {" ", " ", " Twenty", " Thirty", " Fourty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};
            if (num > 19) {
                System.out.print(tens[num / 10] + " " + ones[num % 10]);
            } else {
                System.out.print(ones[num]);
            }
            if (num > 0) {
                System.out.print(thouhun);
            }
        }
    }