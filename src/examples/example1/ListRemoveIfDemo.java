package examples.example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

public class ListRemoveIfDemo {
	
	public static void main(String[] args) {
		List<String> progLangs1 = new ArrayList<>(asList("c#", "java", "python", "scala"));
		List<String> progLangs2 = new ArrayList<>(progLangs1);
		
		// old way
		for (Iterator<String> it = progLangs1.iterator(); it.hasNext(); ) {
			String s = it.next();
			if (s.length() < 3 || s.length() > 5) {
				it.remove();
			}
		}

		// example1 way
		progLangs2.removeIf(s -> s.length() < 3 || s.length() > 5);
		
		System.out.println(progLangs1);
		System.out.println(progLangs2);		
	}
}
