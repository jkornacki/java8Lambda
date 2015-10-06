package examples.example1;

import domain.Developer;
import domain.Language;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Exercies with integer fields.
 *
 * @author toto
 */
public class CollectorsExercise {

    private static List<Developer> developers = Arrays.asList(
            new Developer("John", "Scott", 20, Language.JAVA, Language.SCALA),
            new Developer("Betty", "Scott", 32, Language.RUBY, Language.JAVA_SCRIPT),
            new Developer("Robert", "Carter", 32, Language.GROOVY, Language.JAVA),
            new Developer("Tom", "Wood", 41, Language.JAVA, Language.JAVA_SCRIPT, Language.SCALA),
            new Developer("Michael", "Beer", 36, Language.JAVA));

    public static void main(String[] args) {
        System.out.println("Ex 1");
        exercise1();

        System.out.println("\nEx 2");
        exercise2();

        System.out.println("\nEx 3");
        exercise3();
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
     * 2. Determine average age of developers
     */

    private static void exercise2() {
        Double averangeAge = developers
                .stream()
                .collect(Collectors.averagingInt(d -> d.getAge()));

        System.out.println(averangeAge);
    }

    /**
     * 3. Return string with additional info
     * Collectors.joining
     */

    private static void exercise3() {
        String info = developers
                .stream()
                .filter(d -> d.getProgrammingLanguages().contains(Language.SCALA))
                .map(d -> d.getLastName())
                .collect(Collectors.joining(" and ", "In our company ", " are cool."));

        System.out.println(info);
    }
}
