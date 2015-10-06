package examples.example1;

import domain.Person;
import examples.service.PersonGenerator;

import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

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
