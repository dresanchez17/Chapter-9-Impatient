import java.util.regex.*;

/**
 * Example of matching by group name
 * @author asanchez
 *
 */

public class DemoSE_9_4_4a {
	public static void main(String[] args) {
		System.out.println("DemoSE9_9_4_4a");
		
		String input = "Blackwell Toaster USD29.95";
		System.out.println("input: " + input);
		
		Pattern pattern = Pattern.compile("(?<item>\\p{Alnum}+(\\s+\\p{Alnum}+)*)\\s+(?<currency>[A-Z]{3})(?<price>[0-9.]*)");
		Matcher matcher = pattern.matcher(input);
		
		if (matcher.matches()) {
			System.out.println("Match!");
			System.out.println("matcher.group(\"item\"):" + matcher.group("item"));
			System.out.println("matcher.group(\"currency\"):" + matcher.group("currency"));
			System.out.println("matcher.group(\"price\"):" + matcher.group("price"));
		}
		else {
			System.out.println("No Match!");
		}
	}
}
