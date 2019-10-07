import java.util.regex.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public class Lesson2RegEx {
	public static void main(String[] args) throws IOException, FileNotFoundException{
		String filename = "neighbor-dump.txt";
		// regex - PANID - works
		String regex1 = "(PANID\\s+=\\s+[0-9a-z]{4})";
		// regex string to catch the mac address and it's rssi
		
		String regex3 = "(000781fe0000[0-9a-z]{4})\\s+BPD\\s+false\\s+65535\\s+FSK_75\\s+FSK_75\\s+([-0-9.]+)";
		
		Map<String, String> map = new HashMap<>();
		
		byte[] bytes = Files.readAllBytes(Paths.get(filename));
		String s = new String(bytes, Charset.forName("UTF-8"));
		
		Pattern pattern = Pattern.compile(regex1);
		Matcher matcher = pattern.matcher(s);
		
		System.out.println("-List of PAN IDs");
		while(matcher.find()) {
			String match = matcher.group();
			System.out.println(match);
			
		}
		System.out.println();
		
		pattern = Pattern.compile(regex3);
		matcher = pattern.matcher(s);
		
		while(matcher.find()) {
			String match1 = matcher.group(1);
			String match2 = matcher.group(2);
			map.put(match1, match2);
		}
		
		Set<Map.Entry<String, String>> set = map.entrySet();
		
		System.out.println("-List of MAC Addresses (Total of " + set.size() + ")");
		
		for(Map.Entry<String, String> ma : set) {
			System.out.println(ma.getKey());
		}
		
		System.out.println();
		System.out.println("-List of RF_RSSI_M values for each MAC Address");
		
		for (Map.Entry<String, String> me : set) {
				System.out.println(me.getKey() + " " + me.getValue());
			
		}
	}
}