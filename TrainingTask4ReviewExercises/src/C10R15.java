import java.text.SimpleDateFormat;
import java.util.Date;

public class C10R15 {

	public static void main(String[] args) {
	
		SimpleDateFormat formatter= new SimpleDateFormat("EEEEEEEE MMMMM dd, YYYY h:mm:ss ");
		
		Date date = new Date(System.currentTimeMillis());		
		
		System.out.print("Current date and Time: ");
		System.out.print(formatter.format(date));

	}

}
