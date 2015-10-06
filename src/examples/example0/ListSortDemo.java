package examples.example0;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortDemo {
	
	private static List<String> progLangs1 = Arrays.asList("c#", "java", "python", "scala");
	private static List<String> progLangs2 = Arrays.asList("c#", "java", "python", "scala");

	public static void main(String[] args) {
		// old way
		Collections.sort(progLangs1, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			};
		});
		
		// example1 way
		progLangs2.sort(
				(s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		System.out.println(progLangs1);
		System.out.println(progLangs2);
	}
}
