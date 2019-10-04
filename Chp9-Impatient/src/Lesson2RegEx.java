import java.util.regex.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public class Lesson2RegEx {
	public static void main(String[] args) throws IOException, FileNotFoundException{
		String filename = "neighbor-dump.txt";
		
		byte[] bytes = Files.readAllBytes(Paths.get(filename));
		String s = new String(bytes, Charset.forName("UTF-8"));
		
		
		
	}

}
