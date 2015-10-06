package examples.example2;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Exercies with integer fields.
 * 
 * @author toto
 *
 */
public class CollectorsExercise {

    private static List<Developer> developers = Arrays.asList(
            new Developer("John", "Scott", 20, Language.JAVA, Language.SCALA),
            new Developer("Betty", "Scott", 32, Language.RUBY, Language.JAVA_SCRIPT),
            new Developer("Robert", "Carter", 32, Language.GROOVY, Language.JAVA),
            new Developer("Tom", "Wood", 41, Language.JAVA, Language.JAVA_SCRIPT, Language.SCALA),
            new Developer("Michael", "Beer", 36, Language.JAVA));

	public static void main(String[] args) {
		exercise5();
	}
	
	/**
	 * 1. Group developers by age
	 */

	private static void exercise1() {
		Map<Integer, List<Developer>> developersByAge = developers
			.stream()
			.collect(Collectors.groupingBy(d -> d.getAge()));
		
		developersByAge.forEach((age, d) -> System.out.format("age %s : %s\n", age, d)); 
	}

	/**
	 * 3. Determine average age of developers
	 */

	private static void exercise2() {
		Double averangeAge = developers
			.stream()
			.collect(Collectors.averagingInt(d -> d.getAge()));
		
		System.out.println(averangeAge);
	}

	/**
	 * 4. Determine min, max, averange and sum
	 * 
	 * @see IntSummaryStatistics
	 */

	private static void exercise3() {
		IntSummaryStatistics ageSummary = developers
			.stream()
			.collect(Collectors.summarizingInt(d -> d.getAge()));
			
		System.out.println(ageSummary);	
	}

	/**
	 * 5. Return string with additional info
	 * Collectors.joining
	 */

	private static void exercise4() {
		String info = developers
			.stream()
			.filter(d -> d.getProgrammingLanguages().contains(Language.SCALA))
			.map(d -> d.getLastName())
			.collect(Collectors.joining(" and ", "In our company ", " are cool."));
		
		System.out.println(info);
	}

	/**
	 * 6. Implement own Collector Example: DEV1 <> DEV3 <> DEV4
	 */

	private static void exercise5() {
		Collector<Developer, StringJoiner, String> devNameCollector =
			Collector.of(
				() -> new StringJoiner(" <> "), 
				(j, d) -> j.add(d.getLastName().toUpperCase()),
				(j1, j2) -> j1.merge(j2),
				StringJoiner::toString);
		
		String names = developers
			.stream()
			.collect(devNameCollector);
			
		System.out.println(names);
	}
}
