import java.util.Iterator;
import java.util.LinkedList;

public class AppImplementingIterable {

	public static void main(String[] args) {
		
		UrlLibrary urlLibrary = new UrlLibrary();
		
	
		for(String html: urlLibrary) {
			
			System.out.println(html.length());
			
			System.out.println(html);
		}
		
		
	}

}
