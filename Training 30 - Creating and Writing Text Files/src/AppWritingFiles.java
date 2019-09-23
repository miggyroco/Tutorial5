import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppWritingFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		File file = new File("test.txt");
		// Only Text File
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
			br.write("This is line one");
			br.newLine();
			br.write("This is line two");
			br.newLine();
			br.write("Last Line");
		}  catch (IOException e) {
			System.out.println("Unable to read file "+ file.toString());
		}

		
		
		
	}

}
