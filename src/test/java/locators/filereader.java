package locators;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
 
public class filereader {

	public static void main(String[] args) throws IOException{
		
		
		FileReader fr = new FileReader("C:\\Users\\ososa\\eclipse-workspace\\Zazz\\src\\test\\java\\locators\\zazz");
		Properties p = new Properties();
		p.load(fr);
	}

}
