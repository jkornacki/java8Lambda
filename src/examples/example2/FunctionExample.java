package examples.example2;

import domain.Developer;
import domain.Language;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Funtions example
 *
 * @author toto
 *
 */
public class FunctionExample {

    /**
     * Find sum of arbitrary property
     *
     * @param entries
     * @param mapper
     * @param <T>
     * @return
     */
    public static <T> Integer mapSum(List<T> entries, Function<T, Integer> mapper) {
        Integer sum = 0;
        for(T entry : entries) {
            sum += mapper.apply(entry);
        }

        return sum;
    }

    /**
     * Count languages
     *
     * @return
     */
    public static Function<Developer, Integer> countDevelopersSalaryInEuro() {
        // TODO change to salary
        return d -> d.getAge() * 2;
    }

    public static void main(String[] args) {
        List<Developer> developers = Arrays.asList(
                new Developer("John", "Scott", 20, Language.JAVA, Language.SCALA),
                new Developer("Betty", "Scott", 32, Language.RUBY, Language.JAVA_SCRIPT),
                new Developer("Robert", "Carter", 32, Language.GROOVY, Language.JAVA),
                new Developer("Tom", "Wood", 41, Language.JAVA, Language.JAVA_SCRIPT, Language.SCALA),
                new Developer("Michael", "Beer", 36, Language.JAVA));
        int sumOfAge = mapSum(developers, Developer::getAge);
        int sumOfProgrammingLanguages = mapSum(developers, countDevelopersSalaryInEuro());
        System.out.println(sumOfAge);
        System.out.println(sumOfProgrammingLanguages);

    }

}
