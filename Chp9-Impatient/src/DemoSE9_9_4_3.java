import java.util.regex.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
/**
 * Example of finding all matches
 * @author asanchez
 *
 */
public class DemoSE9_9_4_3 {
	public static void main(String[] args) throws IOException, FileNotFoundException{
		System.out.println("DemoSE_9_4_3");
		
		//Create a file and write some lines
		String filename = "DemoSE9_9_4_3.txt";
		PrintWriter pw = new PrintWriter(filename, "UTF-8");
		pw.println("Java is fun");
		pw.println("Lava is fun");
		pw.println("Java SE 9");
		pw.println("Advance Java");
		pw.close();
		
		// Read file back
		
		byte[] bytes = Files.readAllBytes(Paths.get(filename));
		String s = new String(bytes, Charset.forName("UTF-8"));
		
		String regex = "[Jj]ava.*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		
		while (matcher.find()) {
			String match = matcher.group();
			System.out.println("match: " + match);
			int matchStart = matcher.start(); // finds where it starts. Its offset
			int matchEnd = matcher.end(); // finds where it ends. its offset
			System.out.println("Start: " + matchStart + ", " + "end: " + matchEnd);
		}
	}
}
