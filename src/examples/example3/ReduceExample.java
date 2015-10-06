package examples.example3;

import domain.Developer;
import domain.Language;

import java.util.Arrays;
import java.util.List;


/**
 * Example with reduce() method
 *
 * @author toto
 */
public class ReduceExample {

    List<Developer> developers = Arrays.asList(
            new Developer("John", "Scott", 20, Language.JAVA, Language.SCALA),
            new Developer("Betty", "Scott", 32, Language.RUBY, Language.JAVA_SCRIPT),
            new Developer("Robert", "Carter", 32, Language.GROOVY, Language.JAVA),
            new Developer("Tom", "Wood", 41, Language.JAVA, Language.JAVA_SCRIPT, Language.SCALA),
            new Developer("Michael", "Beer", 36, Language.JAVA));

    public static void main(String[] args) {
        ReduceExample re = new ReduceExample();
        re.getSumOfAge();
    }

    /**
     * Get the youngest dev
     */
    public void getTheYoungestDev() {
        developers
                .stream()
                .reduce((d1, d2) -> d1.getAge() < d2.getAge() ? d1 : d2)
                .ifPresent(System.out::println);
    }

    /**
     * Get sum of developers age
     */
    public void getSumOfAge() {
        Integer ageSum = developers
                .stream()
                .reduce(0, (sum, d) -> sum += d.getAge(), (sum1, sum2) -> sum1 + sum2);

        System.out.println(ageSum);
    }

}
