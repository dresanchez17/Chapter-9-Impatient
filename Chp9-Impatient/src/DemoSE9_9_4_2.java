import java.util.regex.*;
/**
 * Example of finding one regex match
 * 
 * @author asanchez
 *
 */

public class DemoSE9_9_4_2 {
	public static void main(String[] args) {
		System.out.println("DemoSE_9_4_2");
		
		String regex = "[Jj]ava.*";
		
		CharSequence cs1 = "Java";
		CharSequence cs2 = "Lava";
		CharSequence cs3 = "Java is fun";
		
		if (Pattern.matches(regex, cs1)) {
			System.out.println("cs1 matches");
		}
		if (Pattern.matches(regex, cs2)) {
			System.out.println("cs2 matches");
		}
		if (Pattern.matches(regex, cs3)) {
			System.out.println("cs3 matches");
		}
	}
}
