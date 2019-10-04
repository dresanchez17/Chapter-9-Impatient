import java.util.regex.*;

public class DemoSE9_9_4_5 {
	public static void main(String[] args) {
		System.out.println("DemoSE9_9_4_5");
		String input = "red, green, blue";
		
		System.out.println("input: " + input);
		
		Pattern commas = Pattern.compile("\\s*,\\s*");
		String[] tokens = commas.split(input);
		System.out.println("tokens");
		
		for(String s : tokens) {
			System.out.println(s);
		}
		
		String[] tokens2 = input.split("\\s*,\\s*");
		System.out.println("tokens2");
		
		for (String s : tokens2) {
			System.out.println(s);
		}
				
	}
}
