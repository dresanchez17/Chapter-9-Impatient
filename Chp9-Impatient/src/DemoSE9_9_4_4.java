import java.util.regex.*;

public class DemoSE9_9_4_4 {
	public static void main(String[] args) {
		System.out.println("DemoSE9_9_4_4");
		
		String input = "Blockwell Toaster USD29.95";
		System.out.println("input: " + input);
		
		Pattern pattern = Pattern.compile("(\\p{Alnum}+(\\s+\\p{Alnum}+)*)\\s+([A-Z]{3})([0-9.]*)");
		
		Matcher matcher = pattern.matcher(input);
		
		if(matcher.matches()) {
			System.out.println("match!");
			System.out.println("matcher.group(0): " + matcher.group(0));
			System.out.println("matcher.group(1): " + matcher.group(1));
			System.out.println("matcher.group(3): " + matcher.group(3)); 
			System.out.println("matcher.group(4): " + matcher.group(4));
		}
		else {
			System.out.println("No Match!");
		}
	}
}
