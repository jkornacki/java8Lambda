package examples.example1;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class PatternAsPredicateDemo {
	
	public static void main(String[] args) {
		List<String> progLangs = Arrays.asList("c#", "java", "python", "scala");
		
		Pattern pattern = Pattern.compile("a.a");
		
		// old way
        for (String lang : progLangs) {
        	if (pattern.matcher(lang).find()) {
        		System.out.println(lang);
        	}
        }
		
		// example1 way
        progLangs.stream()
        	.filter(pattern.asPredicate())
        	.forEach(System.out::println);
	}
}
