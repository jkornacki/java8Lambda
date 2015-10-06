import domain.Person;
import examples.service.PersonGenerator;

import java.util.List;
import java.util.function.Consumer;

/**
 * Created by P on 2015-10-05.
 */
public class Example2 {

    public static Consumer<Person> consumer = System.out::println;

    public static void main(String[] args) {
        PersonGenerator personGenerator = new PersonGenerator();

        List<Person> persons = personGenerator.generateExamplePerson();

        persons.forEach(
                (p) -> {
                    System.out.println(p);
                });

        System.out.println("");

        persons.forEach(consumer);
    }
}
